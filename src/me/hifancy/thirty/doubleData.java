package me.hifancy.thirty;

public class doubleData {
	//SMC
	public double smc(statistics num1,statistics num2){
		int M01 = 0,M00 = 0,M10 = 0,M11 = 0;
		for(int i = 0;i<num1.getNum().size();i++){
			if(num1.getNum().get(i).equals(0)&&num2.getNum().get(i).equals(1)){
				M01 = M01 + 1;	
			}
			if(num1.getNum().get(i).equals(0)&&num2.getNum().get(i).equals(0)){
				M00 = M00 + 1;	
			}
			if(num1.getNum().get(i).equals(1)&&num2.getNum().get(i).equals(0)){
				M10 = M10 + 1;	
			}
			if(num1.getNum().get(i).equals(1)&&num2.getNum().get(i).equals(1)){
				M11 = M11 + 1;	
			}
		}
		return (M11+M00)/(M00+M01+M10+M11);
	}
	//Jaccard
	public double jac(statistics num1,statistics num2){
		int M01 = 0,M00 = 0,M10 = 0,M11 = 0;
		for(int i = 0;i<num1.getNum().size();i++){
			if(num1.getNum().get(i).equals(0)&&num2.getNum().get(i).equals(1)){
				M01 = M01 + 1;	
			}
			if(num1.getNum().get(i).equals(0)&&num2.getNum().get(i).equals(0)){
				M00 = M00 + 1;	
			}
			if(num1.getNum().get(i).equals(1)&&num2.getNum().get(i).equals(0)){
				M10 = M10 + 1;	
			}
			if(num1.getNum().get(i).equals(1)&&num2.getNum().get(i).equals(1)){
				M11 = M11 + 1;	
			}
		}
		return (M11)/(M01+M10+M11);
	}
}

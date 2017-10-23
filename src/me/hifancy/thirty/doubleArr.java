package me.hifancy.thirty;

import java.util.ArrayList;

public class doubleArr {
	//�������ϵ��
	public  double r(statistics num1,statistics num2){
		double sum1 = 0,sum2 = 0;
    	for( int i = 0; i < num1.getNum().size() ;i++){
            sum1 += (num1.getNum().get(i)-num1.mean())*(num2.getNum().get(i)-num2.mean());
    	}
    	for(int i = 0;i < num1.getNum().size(); i++){
    	    sum2 += (num1.getNum().get(i)-num1.mean())*(num2.getNum().get(i)-num2.mean());
    	}
		return sum1/sqrt(sum2);
    }

	//�������ƶ�
		public double cosSimilarity(statistics num1,statistics num2){
			double sum1 = 0,sum2 = 0;
			for (int i=0;i<num1.getNum().size();i++){
				sum1 += num1.getNum().get(i)*num2.getNum().get(i);
			}
			for(int i=0;i<num1.getNum().size();i++){
				sum2 += num1.getNum().get(i)*num2.getNum().get(i);
			}
			return sum1/sqrt(sum2);
		}
		//ŷ����þ���
		public double ojiDistance(statistics num1,statistics num2){
			double d=0;
			for(int i = 0;i<num1.getNum().size();i++){
				d += (num1.getNum().get(i)-num2.getNum().get(i) )*(num1.getNum().get(i)-num2.getNum().get(i) );
			}
			return sqrt(d);
		}
		//�ɿƷ�˹�������е������پ���
		public double manhadunDistance(statistics num1,statistics num2){
			double d=0;
			for(int i = 0;i<num1.getNum().size();i++){
				d += (num1.getNum().get(i)-num2.getNum().get(i) )*(num1.getNum().get(i)-num2.getNum().get(i) );
			}
			return d;
		}
		//Canberra����
		public double canDistance(statistics num1,statistics num2){
			double d = 0;
			for(int i= 0;i<num1.getNum().size();i++){
				d += (num1.getNum().get(i)-num2.getNum().get(i))/(num1.getNum().get(i)+num2.getNum().get(i));
			
			}
			return d;
		}
		//BrayCurtis����
		public double brayDistance(statistics num1,statistics num2){
			double sum1=0,sum2=0;
			for(int i=0;i<num1.getNum().get(i);i++){
				sum1 += num1.getNum().get(i)-num2.getNum().get(i);
			}
			for(int i=0;i<num1.getNum().get(i);i++){
				sum2 += num1.getNum().get(i)+num2.getNum().get(i);
			}
			return sum1/sum2;
		}
		//Czekanowski����
        public double czeDistance(statistics num1,statistics num2){
        	double sum1=0,sum2=0;
        	for(int i=0;i<num1.getNum().size();i++){
        		if(num1.getNum().get(i)<num2.getNum().get(i)){
        			sum1 = sum1 + num1.getNum().get(i);
        		}else{
        			sum1 = sum1 + num2.getNum().get(i);
        		}
        	}
        	for(int i=0;i<num1.getNum().get(i);i++){
				sum2 += num1.getNum().get(i)+num2.getNum().get(i);
			}
        	return 1 - (2*sum1/sum2);
        }
		private double sqrt(double d) {
			// TODO Auto-generated method stub
			return 0;
		}
}

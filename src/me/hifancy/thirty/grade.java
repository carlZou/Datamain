package me.hifancy.thirty;

public enum grade {
	A(1),B(2),C(3),D(4);
	private  int index;
	private static int Mf = 4;
	grade(int i){
		index = i;
	}
	
	public static int getMf(){
		return Mf;
	}
	
	public  int getI(){
		return index;
	}
}

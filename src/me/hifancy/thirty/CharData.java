package me.hifancy.thirty;

import java.util.ArrayList;

public class CharData {
	private static ArrayList<Character> listP = new ArrayList<>();
	private static ArrayList<Character> listQ = new ArrayList<>();
	
    public float getDataD(String str1,String str2) {
		// TODO Auto-generated constructor stub
    	int t = 0;
    	int bt = 0;
    	float d = 0;
    	char[] p = str1.toCharArray();
    	char[] q = str2.toCharArray();
    	int l;
    	if (p.length > q.length) {
			l = p.length;
		}else {
			l = q.length;
		}
    	
    	for (int i = 0; i < l; i++) {
			listP.add(p[i]);
			listQ.add(q[i]);
			if(listP.get(i).equals(listQ.get(i))) {t++;}else {
				bt++;
			}
			 d = (float)bt/(float)l;
		}
    	
    	 return d;
	}
	
    public float getDataZ(Stu o) {
		return	(float)(o.getF() - 1)/(float)(grade.getMf() - 1);
	}
    
    public float getMix(){
    	return 0;
    }
}

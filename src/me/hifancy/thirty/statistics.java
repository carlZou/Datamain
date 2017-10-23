package me.hifancy.thirty;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class statistics {
	private static ArrayList<Double> num = new ArrayList<>();

	public statistics(double... x) {
		if (x.length > 2) {
			for (double i : x) {
				num.add(i);
			}
		} else {
			System.out.println("�������㹻��������");
		}
	}
	
	

	public ArrayList<Double> getNum() {
		return num;
	}



	public static void setNum(ArrayList<Double> num) {
		statistics.num = num;
	}



	// �������������Ĭ��˳��Ϊ��С����
	public double[] getArrays() {
		double[] temp = new double[num.size()];
		for (int i = 0; i < num.size(); i++)
			temp[i] = num.get(i);
		return temp;
	}

	// ƽ����
	public double mean() {
		int sum = 0;
		for (double i : num) {
			sum += i;
		}
		return sum / num.size();
	}

	// ��λ��
	public double median() {
		int l = num.size();
		if (l % 2 == 1) {
			return num.get((int) l / 2);
		} else if (l % 2 == 0) {
			return (num.get(l / 2) + num.get(l / 2 - 1)) / 2;
		} else
			return -1;
	}

	public double median(double[] num) {
		int l = num.length;
		if (l % 2 == 1) {
			return num[l / 2];
		} else if (l % 2 == 0) {
			return num[l / 2] + num[(l / 2 - 1) / 2];
		} else
			return -1;
	}

	// ������
	public double midrange() {
		double n = 0;
		double m = 0;
		for (double i : num) {
			if (i > n)
				n = i;
			if (i < m)
				m = i;
		}
		return (n + m) / 2;
	}

	// �ķ�λ��
	public double[] quartiles() {
		double[] quart = new double[3];
		double[] temp = new double[num.size()];
		for (int i = 0; i < num.size(); i++)
			temp[i] = (double) num.get(i);
		Arrays.sort(temp);
		quart[1] = median();
		if (temp.length % 2 == 0) {
			quart[0] = median(Arrays.copyOfRange(temp, 0, temp.length / 2));
			quart[1] = median(Arrays.copyOfRange(temp, temp.length / 2, temp.length));
		} else {
			quart[0] = median(Arrays.copyOfRange(temp, 0, temp.length / 2));
			quart[1] = median(Arrays.copyOfRange(temp, temp.length / 2 + 1, temp.length));
		}
		return quart;
	}

	// ����
	public double range() {
		double[] temp = getArrays();
		Arrays.sort(temp);
		return temp[temp.length] - temp[0];
	}

	public double range(double[] n) {
		Arrays.sort(n);
		return n[n.length] - n[0];
	}

	// �ķ�λ������
	public double quartilesRange() {
		return 0;
	}
	
	
}
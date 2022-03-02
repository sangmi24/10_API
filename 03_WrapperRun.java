package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
	
		/*
		 * �ڷ��� => �⺻Ÿ�� / ����Ÿ��
		 * 
		 * *Wrapper Ŭ����
		 * �⺻ �ڷ����� ��ü �������� �������ִ� Ŭ�������� ���� Ŭ������� ��
		 * 
		 * �⺻�ڷ���         <---->     WrapperŬ����
		 * boolean                 Boolean
		 * char                    Character
		 * byte                    Byte
		 * short                   Short
		 * int                     Integer
		 * long                    Long
		 * float                   Float
		 * double                  Double
		 * 
		 * => �⺻�ڷ����� WrapperŬ���� ���·� �ٲ��ִ� �۾���  Boxing �̶�� ��
		 * => WrapperŬ���� ���¸� �⺻�ڷ��� ���·� �ٲ��ִ� �۾���  Unboxing �̶�� ��
		 * 
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		// num1�� num2 �� �������� ��¹��� ���ؼ� �˾ƺ���ʹٸ�?
		System.out.println(num1 == num2 ); // false
		//System.out.println(num1.equals(num2)); 
		//System.out.println(num1.hashCode());
		//=>�Ϲ� �⺻ �ڷ������� ��ü �ڷ����� �޼ҵ���� ������ ���� ���� ��
		//  Wrapper Ŭ������ ��ȯ�ؼ� ����Ѵ�.
		
		// �⺻�ڷ��� =>Wrapper �ڷ��� (Boxing)
		Integer i1 = num1; //10
		Integer i2 = num2; //15
		
		System.out.println(i1.equals(i2));  // false
		System.out.println(i1.hashCode()); // 10
		
		System.out.println(num1 < num2); // true =>��Һ� (�Ϲ�Ÿ���ϰ��)
		System.out.println(i1.compareTo(i2)); // -1 => ��Һ�(����Ÿ���� ���)
		// a.compareTo(b)  : a �� b�� ���ؼ� a�� b���� ũ�ٸ� 1, a�� b ���� �۴ٸ� -1, ���ٸ� 0 �� ��ȯ���ִ� �޼ҵ� 
		// => ��ü�� �ٲٰ� �Ǹ� �޼ҵ���� �̿� �����ϴ�. 
		
		//Wrapper �ڷ��� =>  �⺻�ڷ��� (Unboxing)
		int num3 = i1;  //10
		int num4 = i2;  //15
		
		System.out.println(num3 == num4); //false
		System.out.println(num3 > num4);  //false
        
		System.out.println("---------------------------");
		
		// ***�⺻�ڷ���  <--> String
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1+str2); //"1015.3"
		
		// 1. String --> �⺻�ڷ��� : �Ľ��Ѵ�.
		// [ ǥ���� ]
        // �ش�WrapperŬ������.parseXXX(��ȯ�ҹ��ڿ�);
		int i = Integer.parseInt(str1);  //"10" --> 10
		double d = Double.parseDouble(str2); //"15.3"-->15.3
		
		System.out.println(i+d); // 25.3
		
		// 2. �⺻�ڷ��� --> String 
		//      10          "10"
		//      15.3        "15.3"
		//  [ ǥ���� ]
		//  String.valueOf( ��ȯ�ұ⺻�ڷ����� ) : String => �����ε��� ����!
		String strI = String.valueOf(i);  //10 --> "10"
		String strD = String.valueOf(d);  //15.3 --> "15.3"
		
		System.out.println(strI+strD);  //"1015.3"
		
		
		

	}

}

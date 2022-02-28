package com.kh.chap01_math.run;

// import java.lang.Math;  
// ���� ����, �������� ������ �׻� �̹� import �� �Ǿ��ִ�.

public class MathRun {

	public static void main(String[] args) {

        // Math Ŭ���� (���а� ����)���� �����ϴ� ������ ��ɵ��� ���캸��
	    //1.  java.lang.Math 
	    //2. ��� �޼ҵ���� static, ��� �ʵ���� static => ��ü ���� �ʿ����!			
		//3. Math math = new Math(); => �⺻�����ڰ� private �̶� ��ü ���� ���� �ۼ��� �Ұ��ϴ�!
		
		// ����ʵ�
		// ���� (������) => math Ŭ���� ���� ����ʵ�� ���ǵǾ� ����
		System.out.println("����: "+ Math.PI);
		
		// �޼ҵ�
		// �޼ҵ��(�Ű�����)  : ��ȯ��
		// 1. �ø�ó�� => Math.ceil (double) : double
		double num1 = 4.349;
		System.out.println("�ø�: "+Math.ceil(num1)); // 5.0
		
		// 2. �ݿø�ó�� => Math.round(double) : long (����) 
		System.out.println("�ݿø�: "+Math.round(num1)); // 4
		
		// 3. ����ó�� => Math.floor(double) : double
		System.out.println("����: "+Math.floor(num1)); //4.0
		
		// 4. ���밪(ũ��) => Math.abs(int/double/long/float) : int/double/long/float => �����ε��� ����� ����!
		int num2 = -10;
		System.out.println("���밪: "+Math.abs(num2)); //10
		
		// 5. �ּҰ�  => Math.min(int, int) : int          //double���� ���� �����ε��� �Ͼ�� ����
		System.out.println("�ּҰ�: "+Math.min(10, 5));  //5   min(10, 5)���⿡ ������ �������
		
		// 6. �ִ밪 => Math.max(int,int) : int
		System.out.println("�ִ밪: "+Math.max(5, 10)); //10
		
		// 7. ������ => Math.sqrt(double) : double
		System.out.println("4�� ������: "+Math.sqrt(4)); //2.0
		//int���� 4�� double ���·� �ڵ�����ȯ �Ȱ�!
		
		// 8. ���� => Math.pow(double, double ): double
		System.out.println("2�� 10����: "+Math.pow(2, 10)); // 1024.0
		// 2�� 10�� ���ϰڴ�.
		
		/*
		 * java.lang.Math Ŭ������ Ư¡
		 * -��� �ʵ� : ��� �ʵ�
		 * -��� �޼ҵ� : static �޼ҵ�
		 * 
		 *  ���� �� static �̱� ������ Math. ���� ���� ����(��ü ������ �ʿ䰡 ����)
		 *  Math Ŭ������ �����ڴ� private �̱� ������ ��ü ������ �Ұ�
		 *  
		 *  static : ���α׷� ����� ���ÿ� �޸� ������ �÷����� "����, ��Ȱ��" �ϴ� ����
		 *  => �̱��� ���� 
		 *  
		 */
		
		
		
	}

}






package com.hw4;

import com.hw4.controller.EmpTest;

public class Run {

	public static void main(String[] args) {
		

		EmpTest et =new EmpTest();
		
		//setEmp()�� ���� �� ���� ����� ��� �� �Է��� ���� ��� �Ѹ� ���� ���
		et.setEmp();
		System.out.println("--------���� ���� -----------");
		
		//printEmp()�� ������ ����� ���
		et.printEmp();
		
		System.out.println("--------���� ���� -----------");
		//nameSortPrint()�� ���� ������� �̸��� ������������ ���
		et.nameSortPrint();
		
		System.out.println("--------���� ���� �������� ���� ���� -----------");
		
		et.ageSortPrint();
		
		
		
		
	}

}

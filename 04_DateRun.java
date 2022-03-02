package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		
		/*
		 * * Date Ŭ����
		 * - java.util ��Ű�� �ȿ� ����
		 * - ��¥�� �ð��� ���� ������ ���� �� �ִ� Ŭ����
		 * - �ڹ� ���� ��â�⿡ ���ϰ� ���� �ϼ����� ���� ���� Ŭ����
		 */
		
		// �⺻�����ڸ� ���� Date ��ü ���� => ���� ��¥ �� �ð��� ������ ��
		Date today = new Date();
		System.out.println("�⺻������ : "+today); //(toString �������̵�) Wed Mar 02 12:16:49 KST 2022
		
		// ���� ���ϴ� ��¥ (2020�� 6�� 19��)
		// ���1. �Ű����� �����ڸ� �̿��ؼ� ���ϴ� ��¥ ����
		//Date date1 = new Date(2020 ,6 ,19 );  // deprecated : �������� �Ⱦ��Ե� (����� ��������� ����)
		// System.out.println("�Ű�����������: "+ date1);  
		// ���������� ���� ������ �⵵ + 1900 => �����ϰ��� �ϴ� �⵵ -1900
		// ���������� ���� ������ ���� + 1    => �����ϰ��� �ϴ� ���� -1 
		// Date date1 = new Date(2020-1900, 6-1, 19);
		Date date1 = new Date(2020-1900, 6-1, 19, 19,15,30);// �ú��ʵ� ���� ���� => �����ε�
		
		System.out.println("�Ű�����������: "+date1 );
		
		// ���2. �߰������� ���� ���ϴ� ��¥�� ���ϴ� �������� �����ؼ� ���
		// "2020�� 06�� 19�� 19��15�� 30��" �������� ���� �ʹ� !
		// => java.text.SimpleDateFormat Ŭ������ ���� ����Ѵ�. (���������� ����)
		
		// 1. ������ �����ϸ鼭  SimpleDateFormat ��ü ���� (�Ű����� �����ڷ�)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
		// 2. SimpleDateFormat Ŭ�������� �����ϴ� format() �޼ҵ带 ȣ��
		// [ ǥ���� ]
		// sdf.format( Date��ü )  : String  
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
		
		
		
		
		
		
		
		
		

	}

}

package com.kh.chap02_String.controller;

import java.util.Arrays;
import java.util.Scanner;

public class B_StringMethodTest {

	// ���ڿ��� ���õ� ������ �޼ҵ��
	public void method() {
		
		String str1 = "Hell World";
		
		// �޼ҵ��(�Ű�����) : ��ȯ��
		
		// 1. ���ڿ�.charAt(int index ) : char 
		// => ���ڿ��κ��� ���޹��� index��ġ�� ���� �ϳ����� �������ִ� �޼ҵ�
		char ch = str1.charAt(3); // l
		System.out.println("ch: "+ch);
		
		//2. ���ڿ�.concat(String str): String
		//=> ���ڿ��� ���޵� �� �ٸ� ���ڿ��� �ϳ��� ���ļ� ��ȯ���ִ� �޼ҵ� (��, �ΰ��� ��ĥ�� �ִ�. )
		//=> ���ڿ� + str �� ���� ������ �ϰڴ�. ���ڿ�1+���ڿ�2+���ڿ�3...
		String str2="!!!";
		System.out.println(str1.concat(str2)); //Hell World!!!
		System.out.println(str1+str2);  //���� ����.
		
		//3. ���ڿ�.length() : int
		//=> ���ڿ��� ���̸� ��ȯ���ִ� �޼ҵ�(��� ���ڷ� �̷�����ִ��� ������ ������ ��ȯ�ϰڴ�.)
		System.out.println("str1�� ���� : "+str1.length()); //10 
		//�������� : ���� ��ĭ(' ')�� ���� �ϳ��� ó���Ǽ� ������ ������.
		
		//4_1. ���ڿ�.substring( int beginIndex) : String
		//=> ���ڿ���  beginIndex ��ġ�������� �������� �κй��ڿ��� �����ؼ� ��ȯ���ִ� �޼ҵ� (�����ε� ����)
		System.out.println("str1�� �κй��ڿ�: "+str1.substring(6));  //orld (0���� ��) 6�� o
		
		//4_2. ���ڿ�.substring( int beginIndex,int endIndex) : String
		//=> ���ڿ��� beginIndex��ġ�������� endIndex -1 ������ �κй��ڿ��� �����ؼ� ��ȯ���ִ� �޼ҵ� (�����ε� ����)
		System.out.println("str1�� �κй��ڿ�2: "+str1.substring(0, 6)); //Hell W (���� -1�� �����)
		                                                             // 0 <= �ε������� < 6
		//5. ���ڿ�.replace(char old, char new ) : String
		//=> ���ڿ������� old �� �ش��ϴ� ���ڵ��� new �� ��ȯ���Ѽ� �ش� ���ڿ��� ��ȯ�����ִ� �޼ҵ�
		String str3 = str1.replace('l', 'c');
		System.out.println("str3: "+str3);  //Hecc Worcd
		
		//6. ���ڿ�.trim() : String
		//=> ���ڿ������� �յ� ������ ������ ���ڿ��� ��ȯ���ִ� �޼ҵ�
		String str4 ="       JA     VA          ";
		System.out.println("str4�� trim �޼ҵ� ȣ���ؼ� ����: "+str4.trim()); //JA     VA
		
		// Quiz) str4���� �߰� ������ ���ְ� ������ replace ����� �����ұ�?  �����ε��� ���·� ����! ""�� ��
		System.out.println("�ǳ�? :" +(str4.trim()).replace(" ", "")); //JAVA 
		
		//7_1. ���ڿ�.toUpperCase() : String
		//=> ���ڿ��� ��� �� �빮�ڷ� ���� �� �� ���ڿ��� ��ȯ�����ִ� �޼ҵ�
		System.out.println("upper: "+str1.toUpperCase());  //HELL WORLD
		
		//7_2. ���ڿ�.toLowerCase() : String
		//=> ���ڿ��� ��� �� �ҹ��ڷ� ���� �� �� ���ڿ��� ��ȯ�����ִ� �޼ҵ�
		System.out.println("lower: "+str1.toLowerCase());  //hell world
		
		/*
		 * ����ڷκ��� 
		 * ���Ḧ ���ϸ� y�� �Է��ؾ� ��� ����
		 */
		System.out.println("-------------------------------");
		
		Scanner sc= new Scanner(System.in);
		System.out.print("�����Ͻðڽ��ϱ�? (y/n) : ");
        System.out.println();
		//���1)
		 /*
		  char answer = sc.nextLine().charAt(0); //'y' / 'Y'
		  if(answer =='y'|| answer =='Y' ) {
			  System.out.println("�����մϴ�.");
		  }else {
			  System.out.println("�������� �ʽ��ϴ�.");
		  }
		  */
		//���2)  .  �������� ������
		/*
		char answer = sc.nextLine().toUpperCase().charAt(0); //'Y' //'N'
		// �޼ҵ带 ���̾ ȣ�� => �޼ҵ�ü�̴�
		
		if(answer =='Y') {
			System.out.println("�����մϴ�.");
		}else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		*/
		System.out.println("-------------------------------");
		
		// ���ڿ� => char[] 
		// str1 ���ڿ� �������� ���� �ϳ��ϳ��� �����ؼ� ���� �迭�� ��ڴ�. 
		char[] arr = new char[str1.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]  = str1.charAt(i);
		}
		System.out.println(Arrays.toString(arr));  //[H, e, l, l,  , W, o, r, l, d]
		
		//8. ���ڿ�.toCharArray() : char[]
		//=> ���ڿ��� �� ���ڵ��� char[] �迭�� �Űܴ�Ƽ� �� �ش� �迭 ��ü�� ��ȯ���ִ� �޼ҵ�
		char[] arr2 = str1.toCharArray(); 
		System.out.println(Arrays.toString(arr2)); //[H, e, l, l,  , W, o, r, l, d]
		
		// char[] => ���ڿ�
		char[] arr3 = {'a','p','p','l','e'};
		String result="";  //��Ȯ�� ���� �������� ""�� �ʱ�ȭ��
		for(int i=0; i<arr3.length;i++) {
			result=result+arr3[i];
		}
		System.out.println("result: "+result);  //apple
		
		//9. static valueOf(char[] data) : String //�Ű������� ��ȯ���� �迭�� ���� �ִ�.
		//=> ���޵� char[]�� ��� ���ڵ��� �ϳ��� ���ڿ��� ���̾ ��ȯ���ִ�  �޼ҵ�
		System.out.println("valueOf �޼ҵ� ����� : "+ String.valueOf(arr3));  //apple
		
		
		
	}
	
	
}





package com.kh.chap02_String.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		String str = "Java, Oracle, JDBC, HTML, Server, Spring";
		
		// �����ڸ� �����ؼ� �ش� ���ڿ��� �и���Ű�� ���
		// ���1. �и��� ���ڿ����� String[] �迭�� �������� ��Ƽ� ����
		// split �̶�� ���ڿ��� �ɰ��ִ� �޼ҵ带 Ȱ�� (String Ŭ�������� ����)
		// [ ǥ���� ]  ���ڿ�.split(String ������)  : String[]    (�����ڴ�  String ���� , ���� �̳� / ��� ����)
		String[] arr = str.split(", ");
	    for(int i=0 ; i< arr.length ; i++) {
	    	System.out.println(arr[i]);
	    }
		
	    // �迭�� ��� for ���� ������ ���� �� �� �ִ� : ���� for�� (foreach ��)
	    // [ ǥ���� ]
	    // for(��������ٺ������� : ���������������ϰ����ϴ¹迭��Ǵ��÷��Ǹ� ) { �ݺ������� ������ �ڵ�; }
	    for(String s : arr ) {  // 0 1 2 3 4 5   //���ǻ��� : �ش� �迭�� Ÿ�Կ� �°� ���� ������ �ۼ��ؾ� �Ѵ�! 
	    	
	    	//���������� s ��� ���ڿ� Ÿ���� ������ arr[i] �濡 ���� ���� ���������� ���鼭 �ݺ��� �Ͼ 
	    	//���� �̹� �̾Ƽ� ������ ��Ƽ� �����Ǵ� �����̱� ������
	    	//�迭�� ���� ���� �����ϴ� �뵵�δ� ������, ���� ���� ����ϴ� �뵵�θ� �� �� �ִ�. 
	    	 System.out.println(s);  
	    }
	    
	    System.out.println("--------------------------------------");
	    
	    // ���2.�и��� ������ ���ڿ����� "��ū" �̶�� ������ ����ϴ� ��� (��ū == �ܾ�)
	    // java.util.StringTokenizer Ŭ������ Ȱ��
	    // [ ǥ���� ]
	    // StringTokenizer ��ü�� = new StringTokenizer(�и���Ű�����ϴ¹��ڿ�, ������ );
	    StringTokenizer stn = new StringTokenizer(str,", ");
	    
	    System.out.println("�и��� ���ڿ��� ����: "+ stn.countTokens());  //countTokens : ��ū�� ���ڴ�. : 6
	    
	    // Java, Oracle, JDBC, HTML, Server, Spring
//	    System.out.println(stn.nextToken());  // Java 
//	    System.out.println(stn.nextToken());  // Oracle
//	    System.out.println(stn.nextToken());  // JDBC
//	    System.out.println(stn.nextToken());  // HTML
//	    System.out.println(stn.nextToken());  // Server
//	    System.out.println(stn.nextToken());  // Spring
	    
	    //System.out.println(stn.nextToken());
	    // NoSuchElementException 
	    // ���� �����ִ� stn ��ü�κ��� ��ū ������ ������ ����� �߻��ϴ� ����
	    
	    System.out.println("���� ����ִ� ��ū�� ���� : "+ stn.countTokens()); // 0 
	    
//	    int end = stn.countTokens();
//	    for(int i= 0; i< end ; i++) {
//	    	System.out.println(stn.nextToken());
//	    }
	    //��ū�� �ϳ� �̾Ƴ������� countTokens() ����� -1 �Ǳ� ������ �̸� ������ ��Ƶΰ� �ݺ��� �����ؾ� ��!
	    
	    //���̻� �̾Ƴ� ��ū�� �ֳ�?  ��� ������ �����ϸ� while �� ��� ����
	    //StringTokenizer Ŭ�������� �����ϴ� hasMoreTokens() �޼ҵ�
	    //=> StringTokenizer ��ü�κ��� �� �̻� �̾Ƴ� ��ū�� �ִ� ��쿡 true �� ��ȯ ������ false
	    while(stn.hasMoreTokens()) {
	    	System.out.println(stn.nextToken());
	    }
	    
	    
	    
	    
	}
	
	
	
	
	
	
	
	
}

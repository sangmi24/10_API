package com.hw6.controller;

import java.util.Scanner;

public class NumberOk {

	private int ran;
	
    public NumberOk() {
    	
    }
    //����ڿ��� ���ڸ� �Է� �ް� �Է� ���� ���ڰ� ������ ������ ��������
    //������, ū��, ��� ���� ���ߴ���, ���߸� ��� ���� ������ ���� �޼ҵ�
	public void numGame() {
		
		//���� = ����
		int inputAnswer= (int)( (Math.random()*100)+1 );
		
		Scanner sc = new Scanner(System.in);
		int num; //num�� ����ڰ� ��� ������ ���� 
		int count=1; //count�� ���� Ƚ���� ī��Ʈ�ϴ� ����
		
		while(true){	
			System.out.print("1���� 100������ ������ �ϳ� �Է��ϼ���: ");		
			num = sc.nextInt(); //�ݺ��� �ȿ� ������ ������ ������ �ݺ�
			
           //����ڰ� �Է��� ���ڿ� ������ ������, ������, ū�� ��		 
		 if(inputAnswer == num ) {
			 System.out.println( count +"�� ���� ������ϴ�.");			 
			 break;
		 }else if (inputAnswer> num){
			 System.out.println( num+"���� Ů�ϴ�. "+count+"��° ����!!" );
					
		 }else {
			 System.out.println( num+"���� �۽��ϴ�. "+count+"��° ����!!" );						
		 }
		 count++;
		  
			//sc.close();
			 
		} 		
		
		System.out.println("��� �Ͻðڽ��ϱ�?(y/n): ");
		char answer =sc.nextLine().toUpperCase().charAt(0); //�̺κп��� ������. ��? ����?
		if(answer=='Y') {
	      System.out.println("����մϴ�.");
		}else if(answer=='N'){
		System.out.println("������ �����մϴ�.");
	    }else {
		System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
		
	
	
	 }
	}
	


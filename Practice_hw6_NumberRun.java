package com.hw6.run;

import java.util.Scanner;

import com.hw6.controller.NumberOk;

public class NumberRun {

	public static void main(String[] args) {
	
		NumberOk no = new NumberOk();
		//NumberOk ��ü�� �̿��Ͽ� �޼ҵ� ����
		no.numGame();
		
		//����ϴ��� �Ǵ��ϴ� y,n �Է°� �Ǵ��ϱ�
		//NumberOk =>���⼭ �� �ڵ带 ¥�ٰ� �������� run���� �ڵ�«
		while(true) {  // �߸� �Է��ϼ̽��ϴ� ������ ����Ͻðڽ��ϱ�? ���;� �ϴµ�
			           // �ȳ��ͼ� ����ϴٰ� while ���ѷ����� ���� 
			           // �ݺ� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �Ͻðڽ��ϱ�?(y/n): ");
		
		char answer =sc.nextLine().toUpperCase().charAt(0); 
	
		if(answer =='Y') {
	      System.out.println("���ο� ������ �����մϴ�!");
	      no.numGame();
		}else if(answer=='N'){
		System.out.println("������ �����մϴ�.");
		break;
	    }else {
		System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		continue;
		}
        
	  }
	}
}

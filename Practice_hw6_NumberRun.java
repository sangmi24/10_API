package com.hw6.run;

import java.util.Scanner;

import com.hw6.controller.NumberOk;

public class NumberRun {

	public static void main(String[] args) {
	
		NumberOk no = new NumberOk();
		//NumberOk 객체를 이용하여 메소드 실행
		no.numGame();
		
		//계속하는지 판단하는 y,n 입력값 판단하기
		//NumberOk =>여기서 밑 코드를 짜다가 오류나서 run에서 코드짬
		while(true) {  // 잘못 입력하셨습니다 다음에 계속하시겠습니까? 나와야 하는데
			           // 안나와서 고민하다가 while 무한루프를 만들어서 
			           // 반복 제어 만듬
		Scanner sc = new Scanner(System.in);
		System.out.print("계속 하시겠습니까?(y/n): ");
		
		char answer =sc.nextLine().toUpperCase().charAt(0); 
	
		if(answer =='Y') {
	      System.out.println("새로운 게임을 시작합니다!");
	      no.numGame();
		}else if(answer=='N'){
		System.out.println("게임을 종료합니다.");
		break;
	    }else {
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		continue;
		}
        
	  }
	}
}

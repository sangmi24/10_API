package com.hw6.controller;

import java.util.Scanner;

public class NumberOk {

	private int ran;
	
	//기본 생성자
    public NumberOk() {  
    	
    }
    
    //사용자에게 숫자를 입력 받고 입력 받은 숫자가 임의의 난수와 비교했을때
    //작은지, 큰지, 몇번 만에 맞추는지, 맞추면 계속 할지 끝낼지 묻는 메소드
	public void numGame() {
		
		//난수 = 정답
		int inputAnswer= (int)( (Math.random()*100)+1 );  //1부터 100사이의 정수 
		Scanner sc = new Scanner(System.in);
		
		int num; //num은 사용자가 찍는 숫자의 변수 
		int count = 1; //count는 맞춘 횟수를 카운트하는 변수
		
		while(true){	
			System.out.print("1부터 100사이의 정수를 하나 입력하세요: ");		
			num = sc.nextInt(); //반복문 안에 있으면 여러번 무조건 반복
			
           //사용자가 입력한 숫자와 난수와 같은지, 작은지, 큰지 비교		 
		 if(inputAnswer == num ) {
			 System.out.println( count +"번 만에 맞췄습니다.");			 
			 break;
		 }else if (inputAnswer> num){
			 System.out.println( num+"보다 큽니다. "+count+"번째 실패!!" );
					
		 }else {
			 System.out.println( num+"보다 작습니다. "+count+"번째 실패!!" );						
		 }
		 count++;
		  
			
			 
		} 		
		
		
	
	
	 }
	}
	


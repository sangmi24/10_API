package com.kh.chap02_String.controller;

import java.util.Arrays;
import java.util.Scanner;

public class B_StringMethodTest {

	// 문자열과 관련된 유용한 메소드들
	public void method() {
		
		String str1 = "Hell World";
		
		// 메소드명(매개변수) : 반환형
		
		// 1. 문자열.charAt(int index ) : char 
		// => 문자열로부터 전달받은 index위치의 문자 하나만을 추출해주는 메소드
		char ch = str1.charAt(3); // l
		System.out.println("ch: "+ch);
		
		//2. 문자열.concat(String str): String
		//=> 문자열과 전달된 또 다른 문자열을 하나로 합쳐서 반환해주는 메소드 (단, 두개만 합칠수 있다. )
		//=> 문자열 + str 와 같은 역할을 하겠다. 문자열1+문자열2+문자열3...
		String str2="!!!";
		System.out.println(str1.concat(str2)); //Hell World!!!
		System.out.println(str1+str2);  //위와 같다.
		
		//3. 문자열.length() : int
		//=> 문자열의 길이를 반환해주는 메소드(몇개의 문자로 이루어져있는지 문자의 갯수를 반환하겠다.)
		System.out.println("str1의 길이 : "+str1.length()); //10 
		//주의할점 : 공백 한칸(' ')도 문자 하나로 처리되서 갯수가 세진다.
		
		//4_1. 문자열.substring( int beginIndex) : String
		//=> 문자열의  beginIndex 위치에서부터 끝까지의 부분문자열을 추출해서 반환해주는 메소드 (오버로딩 형태)
		System.out.println("str1의 부분문자열: "+str1.substring(6));  //orld (0부터 셈) 6이 o
		
		//4_2. 문자열.substring( int beginIndex,int endIndex) : String
		//=> 문자열의 beginIndex위치에서부터 endIndex -1 까지의 부분문자열을 추출해서 반환해주는 메소드 (오버로딩 형태)
		System.out.println("str1의 부분문자열2: "+str1.substring(0, 6)); //Hell W (끝은 -1로 계산해)
		                                                             // 0 <= 인덱스범위 < 6
		//5. 문자열.replace(char old, char new ) : String
		//=> 문자열에서의 old 에 해당하는 문자들을 new 로 변환시켜서 해당 문자열을 반환시켜주는 메소드
		String str3 = str1.replace('l', 'c');
		System.out.println("str3: "+str3);  //Hecc Worcd
		
		//6. 문자열.trim() : String
		//=> 문자열에서의 앞뒤 공백을 제거한 문자열을 반환해주는 메소드
		String str4 ="       JA     VA          ";
		System.out.println("str4에 trim 메소드 호출해서 적용: "+str4.trim()); //JA     VA
		
		// Quiz) str4에서 중간 공백을 없애고 싶으면 replace 사용이 가능할까?  오버로딩된 형태로 가능! ""로 함
		System.out.println("되나? :" +(str4.trim()).replace(" ", "")); //JAVA 
		
		//7_1. 문자열.toUpperCase() : String
		//=> 문자열을 모두 다 대문자로 변경 후 그 문자열을 반환시켜주는 메소드
		System.out.println("upper: "+str1.toUpperCase());  //HELL WORLD
		
		//7_2. 문자열.toLowerCase() : String
		//=> 문자열을 모두 다 소문자로 변경 후 그 문자열을 반환시켜주는 메소드
		System.out.println("lower: "+str1.toLowerCase());  //hell world
		
		/*
		 * 사용자로부터 
		 * 종료를 원하면 y를 입력해야 라고 유도
		 */
		System.out.println("-------------------------------");
		
		Scanner sc= new Scanner(System.in);
		System.out.print("종료하시겠습니까? (y/n) : ");
        System.out.println();
		//방법1)
		 /*
		  char answer = sc.nextLine().charAt(0); //'y' / 'Y'
		  if(answer =='y'|| answer =='Y' ) {
			  System.out.println("종료합니다.");
		  }else {
			  System.out.println("종료하지 않습니다.");
		  }
		  */
		//방법2)  .  직접접근 연산자
		/*
		char answer = sc.nextLine().toUpperCase().charAt(0); //'Y' //'N'
		// 메소드를 연이어서 호출 => 메소드체이닝
		
		if(answer =='Y') {
			System.out.println("종료합니다.");
		}else {
			System.out.println("종료하지 않습니다.");
		}
		*/
		System.out.println("-------------------------------");
		
		// 문자열 => char[] 
		// str1 문자열 기준으로 문자 하나하나를 추출해서 문자 배열에 담겠다. 
		char[] arr = new char[str1.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]  = str1.charAt(i);
		}
		System.out.println(Arrays.toString(arr));  //[H, e, l, l,  , W, o, r, l, d]
		
		//8. 문자열.toCharArray() : char[]
		//=> 문자열의 각 문자들을 char[] 배열에 옮겨담아서 그 해당 배열 자체를 반환해주는 메소드
		char[] arr2 = str1.toCharArray(); 
		System.out.println(Arrays.toString(arr2)); //[H, e, l, l,  , W, o, r, l, d]
		
		// char[] => 문자열
		char[] arr3 = {'a','p','p','l','e'};
		String result="";  //정확한 값을 얻으려고 ""로 초기화함
		for(int i=0; i<arr3.length;i++) {
			result=result+arr3[i];
		}
		System.out.println("result: "+result);  //apple
		
		//9. static valueOf(char[] data) : String //매개변수나 반환값에 배열도 들어갈수 있다.
		//=> 전달된 char[]에 담긴 문자들을 하나의 문자열로 연이어서 반환해주는  메소드
		System.out.println("valueOf 메소드 사용후 : "+ String.valueOf(arr3));  //apple
		
		
		
	}
	
	
}





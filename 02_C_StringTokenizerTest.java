package com.kh.chap02_String.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		String str = "Java, Oracle, JDBC, HTML, Server, Spring";
		
		// 구분자를 제시해서 해당 문자열을 분리시키는 방법
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담아서 관리
		// split 이라는 문자열을 쪼개주는 메소드를 활용 (String 클래스에서 제공)
		// [ 표현법 ]  문자열.split(String 구분자)  : String[]    (구분자는  String 형태 , 공백 이나 / 등등 가능)
		String[] arr = str.split(", ");
	    for(int i=0 ; i< arr.length ; i++) {
	    	System.out.println(arr[i]);
	    }
		
	    // 배열의 경우 for 문을 다음과 같이 쓸 수 있다 : 향상된 for문 (foreach 문)
	    // [ 표현법 ]
	    // for(값을담아줄변수선언문 : 순차적으로접근하고자하는배열명또는컬렉션명 ) { 반복적으로 실행할 코드; }
	    for(String s : arr ) {  // 0 1 2 3 4 5   //주의사항 : 해당 배열의 타입에 맞게 변수 선언문을 작성해야 한다! 
	    	
	    	//내부적으로 s 라는 문자열 타입의 변수에 arr[i] 방에 들은 값이 순차적으로 담기면서 반복이 일어남 
	    	//값을 이미 뽑아서 변수에 담아서 제공되는 형식이기 때문에
	    	//배열에 들은 값을 변경하는 용도로는 못쓰고, 단지 값을 출력하는 용도로만 쓸 수 있다. 
	    	 System.out.println(s);  
	    }
	    
	    System.out.println("--------------------------------------");
	    
	    // 방법2.분리된 각각의 문자열들을 "토큰" 이라는 단위로 취급하는 방법 (토큰 == 단어)
	    // java.util.StringTokenizer 클래스를 활용
	    // [ 표현법 ]
	    // StringTokenizer 객체명 = new StringTokenizer(분리시키고자하는문자열, 구분자 );
	    StringTokenizer stn = new StringTokenizer(str,", ");
	    
	    System.out.println("분리된 문자열의 갯수: "+ stn.countTokens());  //countTokens : 토큰을 세겠다. : 6
	    
	    // Java, Oracle, JDBC, HTML, Server, Spring
//	    System.out.println(stn.nextToken());  // Java 
//	    System.out.println(stn.nextToken());  // Oracle
//	    System.out.println(stn.nextToken());  // JDBC
//	    System.out.println(stn.nextToken());  // HTML
//	    System.out.println(stn.nextToken());  // Server
//	    System.out.println(stn.nextToken());  // Spring
	    
	    //System.out.println(stn.nextToken());
	    // NoSuchElementException 
	    // 현재 남아있는 stn 객체로부터 토큰 갯수의 범위를 벗어나면 발생하는 오류
	    
	    System.out.println("현재 담겨있는 토큰의 갯수 : "+ stn.countTokens()); // 0 
	    
//	    int end = stn.countTokens();
//	    for(int i= 0; i< end ; i++) {
//	    	System.out.println(stn.nextToken());
//	    }
	    //토큰을 하나 뽑아낼때마다 countTokens() 결과가 -1 되기 때문에 미리 변수에 담아두고 반복을 시작해야 함!
	    
	    //더이상 뽑아낼 토큰이 있나?  라는 조건을 제시하면 while 문 사용 가능
	    //StringTokenizer 클래스에서 제공하는 hasMoreTokens() 메소드
	    //=> StringTokenizer 객체로부터 더 이상 뽑아낼 토큰이 있는 경우에 true 를 반환 없으면 false
	    while(stn.hasMoreTokens()) {
	    	System.out.println(stn.nextToken());
	    }
	    
	    
	    
	    
	}
	
	
	
	
	
	
	
	
}

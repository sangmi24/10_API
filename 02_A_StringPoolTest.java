package com.kh.chap02_String.controller;

public class A_StringPoolTest {

	// String 클래스에 대해서 공부해보자
	// String  은 "불변클래스" (변하지 않는 클래스)
	// => String 객체 기준으로 값이 수정되는 순간 
	//  기존에 담긴 그 공간의 값이 변경되는 것이 아니라 새로운 곳에서 새로운 문자열 위치를 참조하겠다.
	
	// String 형태의 객체 만들기
	// 1. 생성자를 통해서 문자열 담기(String str = new String("~~"); )
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2 ); // false => 주소값을 비교함
		
		System.out.println(str1 /*toString() */);  //hello
		System.out.println(str2);    //hello
		// String 클래스의 toString() 메소드의 경우
		// 실제 담겨있는 주소값을 내보내는 역할에서 실제 담겨있는 문자열을 반환하게끔
		// 오버라이딩 된 형태이다. 
		
		System.out.println(str1.equals(str2));  //true => 실제 문자열 비교
		// String 클래스의 equals() 메소드의 경우
		// 실제 담겨있는 주소값을 비교하는 역할에서 실제 담겨있는 문자열을 비교해서 
		// 같으면 true, 아니면 false를 반환하게끔 오버라이딩 된 형태이다. 
		
		System.out.println(str1.hashCode()); //주소값 99162322
		System.out.println(str2.hashCode()); //주소값 99162322  같다.
		//String 클래스의 hashcode() 메소드의 경우
		//hashcode()는 실제 담겨있는 주소값을 기반으로 십진수 형태로 내보내는 역할에서
		//실제 담겨있는 문자열 기반으로 해시코드를 십진수 형태로 만들어서 내보내게끔 오버라이딩 된 형태이다. 
		
		// 그렇다면 진짜 주소값의 해시코드를 알고싶다면?
		// System .identityHashCode(참조형변수명)
		// => 해당 객체의 실제 주소의 해시코드를 출력
		System.out.println(System .identityHashCode(str1)); // 주소값 1829164700
		System.out.println(System .identityHashCode(str2));  //주소값 2018699554 다르다.
	}
	
	
	// 2. 값을 리터럴(=값)로써 아예 대입해버리기(String str="~~";)
	public void method2() {
		
		String str1 ="hello";
		String str2 ="hello";
		//String 객체를 만들때 리터럴을 제시하는 방식으로 객체를 만든다면
		// 그 내용물이 heap 영역에 있는 "상수풀(StringPool)" 영역에 올라감
		//=> StringPool의 특징 : 동일한 문자열 내용물이 존재 불가 
		System.out.println(str1 == str2); // true (주소값 비교해서- 동일함)
        
		System.out.println(str1);  //hello (toString 메소드 생략됨-오버라이딩됨)
		System.out.println(str2);  //hello
		
		System.out.println(str1.equals(str2)); // true 문자열의 동등비교
		
		System.out.println(str1.hashCode());  //99162322 (실제 내용물을 기반으로 십진수화)
		System.out.println(str2.hashCode());  //99162322
		
		System.out.println(System .identityHashCode(str1)); //1829164700 (주소 값 기반으로 비교한것)
		System.out.println(System .identityHashCode(str2)); //1829164700 같게 나옴

	}
	//불변클래스
	public void method3() {
		
		String str = "hello";
		System.out.println(System .identityHashCode(str)); //주소값 1829164700
		
		str = "goodbye";
		System.out.println(System .identityHashCode(str)); //주소값 2018699554
		
		str += "abc";  //goodbyeabc
		
		System.out.println(System .identityHashCode(str)); //주소값 1311053135
		
		/*
		 * 기존의 상수풀의 연결이 끊긴 문자열들은 가비지 컬렉터가 알아서 정리해줌
		 * "불변" 이라고 해서 수정이 아예 안되는 것이 아니라 (이 경우에는 "상수" 임!)
		 * 기존의 그 자리에서 수정되는 개념이 아닌 매번 새로운 주소값을 참조하는 개념
		 */
		
	}
	
	
	
	
	
	
	
}






package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
	
		/*
		 * 자료형 => 기본타입 / 참조타입
		 * 
		 * *Wrapper 클래스
		 * 기본 자료형을 객체 형식으로 포장해주는 클래스들을 래퍼 클래스라고 함
		 * 
		 * 기본자료형         <---->     Wrapper클래스
		 * boolean                 Boolean
		 * char                    Character
		 * byte                    Byte
		 * short                   Short
		 * int                     Integer
		 * long                    Long
		 * float                   Float
		 * double                  Double
		 * 
		 * => 기본자료형을 Wrapper클래스 형태로 바꿔주는 작업을  Boxing 이라고 함
		 * => Wrapper클래스 형태를 기본자료형 형태로 바꿔주는 작업을  Unboxing 이라고 함
		 * 
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		// num1과 num2 가 동일한지 출력문을 통해서 알아보고싶다면?
		System.out.println(num1 == num2 ); // false
		//System.out.println(num1.equals(num2)); 
		//System.out.println(num1.hashCode());
		//=>일반 기본 자료형에서 객체 자료형의 메소드들을 가져다 쓰고 싶을 때
		//  Wrapper 클래스로 변환해서 사용한다.
		
		// 기본자료형 =>Wrapper 자료형 (Boxing)
		Integer i1 = num1; //10
		Integer i2 = num2; //15
		
		System.out.println(i1.equals(i2));  // false
		System.out.println(i1.hashCode()); // 10
		
		System.out.println(num1 < num2); // true =>대소비교 (일반타입일경우)
		System.out.println(i1.compareTo(i2)); // -1 => 대소비교(참조타입일 경우)
		// a.compareTo(b)  : a 랑 b를 비교해서 a가 b보다 크다면 1, a가 b 보다 작다면 -1, 같다면 0 을 반환해주는 메소드 
		// => 객체로 바꾸게 되면 메소드들을 이용 가능하다. 
		
		//Wrapper 자료형 =>  기본자료형 (Unboxing)
		int num3 = i1;  //10
		int num4 = i2;  //15
		
		System.out.println(num3 == num4); //false
		System.out.println(num3 > num4);  //false
        
		System.out.println("---------------------------");
		
		// ***기본자료형  <--> String
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1+str2); //"1015.3"
		
		// 1. String --> 기본자료형 : 파싱한다.
		// [ 표현법 ]
        // 해당Wrapper클래스명.parseXXX(반환할문자열);
		int i = Integer.parseInt(str1);  //"10" --> 10
		double d = Double.parseDouble(str2); //"15.3"-->15.3
		
		System.out.println(i+d); // 25.3
		
		// 2. 기본자료형 --> String 
		//      10          "10"
		//      15.3        "15.3"
		//  [ 표현법 ]
		//  String.valueOf( 변환할기본자료형값 ) : String => 오버로딩된 형태!
		String strI = String.valueOf(i);  //10 --> "10"
		String strD = String.valueOf(d);  //15.3 --> "15.3"
		
		System.out.println(strI+strD);  //"1015.3"
		
		
		

	}

}

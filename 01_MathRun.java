package com.kh.chap01_math.run;

// import java.lang.Math;  
// 생략 가능, 보이지는 않지만 항상 이미 import 가 되어있다.

public class MathRun {

	public static void main(String[] args) {

        // Math 클래스 (수학과 관련)에서 제공하는 유용한 기능들을 살펴보자
	    //1.  java.lang.Math 
	    //2. 모든 메소드들이 static, 모든 필드들이 static => 객체 생성 필요없다!			
		//3. Math math = new Math(); => 기본생성자가 private 이라 객체 생성 구문 작성이 불가하다!
		
		// 상수필드
		// 파이 (원주율) => math 클래스 내에 상수필드로 정의되어 있음
		System.out.println("파이: "+ Math.PI);
		
		// 메소드
		// 메소드명(매개변수)  : 반환형
		// 1. 올림처리 => Math.ceil (double) : double
		double num1 = 4.349;
		System.out.println("올림: "+Math.ceil(num1)); // 5.0
		
		// 2. 반올림처리 => Math.round(double) : long (정수) 
		System.out.println("반올림: "+Math.round(num1)); // 4
		
		// 3. 버림처리 => Math.floor(double) : double
		System.out.println("버림: "+Math.floor(num1)); //4.0
		
		// 4. 절대값(크기) => Math.abs(int/double/long/float) : int/double/long/float => 오버로딩이 적용된 상태!
		int num2 = -10;
		System.out.println("절대값: "+Math.abs(num2)); //10
		
		// 5. 최소값  => Math.min(int, int) : int          //double형태 들어가서 오버로딩이 일어날수 있음
		System.out.println("최소값: "+Math.min(10, 5));  //5   min(10, 5)여기에 순서는 상관없음
		
		// 6. 최대값 => Math.max(int,int) : int
		System.out.println("최대값: "+Math.max(5, 10)); //10
		
		// 7. 제곱근 => Math.sqrt(double) : double
		System.out.println("4의 제곱근: "+Math.sqrt(4)); //2.0
		//int형인 4가 double 형태로 자동형변환 된것!
		
		// 8. 제곱 => Math.pow(double, double ): double
		System.out.println("2의 10제곱: "+Math.pow(2, 10)); // 1024.0
		// 2를 10번 곱하겠다.
		
		/*
		 * java.lang.Math 클래스의 특징
		 * -모든 필드 : 상수 필드
		 * -모든 메소드 : static 메소드
		 * 
		 *  모든게 다 static 이기 때문에 Math. 으로 접근 가능(객체 생성할 필요가 없음)
		 *  Math 클래스의 생성자는 private 이기 때문에 객체 생성도 불가
		 *  
		 *  static : 프로그램 실행과 동시에 메모리 영역에 올려놓고 "공유, 재활용" 하는 개념
		 *  => 싱글톤 패턴 
		 *  
		 */
		
		
		
	}

}






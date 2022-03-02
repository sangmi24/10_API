package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		
		/*
		 * * Date 클래스
		 * - java.util 패키지 안에 존재
		 * - 날짜와 시간에 대한 정보를 담을 수 있는 클래스
		 * - 자바 개발 초창기에 급하게 만든 완성도가 높지 않은 클래스
		 */
		
		// 기본생성자를 통해 Date 객체 생성 => 현재 날짜 및 시간을 가지고 옴
		Date today = new Date();
		System.out.println("기본생성자 : "+today); //(toString 오버라이딩) Wed Mar 02 12:16:49 KST 2022
		
		// 내가 원하는 날짜 (2020년 6월 19일)
		// 방법1. 매개변수 생성자를 이용해서 원하는 날짜 지정
		//Date date1 = new Date(2020 ,6 ,19 );  // deprecated : 언제가는 안쓰게될 (사용이 권장되지는 않음)
		// System.out.println("매개변수생성자: "+ date1);  
		// 내부적으로 내가 전달한 년도 + 1900 => 셋팅하고자 하는 년도 -1900
		// 내부적으로 내가 전달한 월수 + 1    => 셋팅하고자 하는 월수 -1 
		// Date date1 = new Date(2020-1900, 6-1, 19);
		Date date1 = new Date(2020-1900, 6-1, 19, 19,15,30);// 시분초도 같이 지정 => 오버로딩
		
		System.out.println("매개변수생성자: "+date1 );
		
		// 방법2. 추가적으로 내가 원하는 날짜를 원하는 형식으로 지정해서 출력
		// "2020년 06월 19일 19시15분 30초" 형식으로 찍어보고 싶다 !
		// => java.text.SimpleDateFormat 클래스를 같이 사용한다. (보조적으로 쓰임)
		
		// 1. 형식을 지정하면서  SimpleDateFormat 객체 생성 (매개변수 생성자로)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		// 2. SimpleDateFormat 클래스에서 제공하는 format() 메소드를 호출
		// [ 표현법 ]
		// sdf.format( Date객체 )  : String  
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
		
		
		
		
		
		
		
		
		

	}

}

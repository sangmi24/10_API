package com.hw4.controller;

import java.util.Arrays;

import com.hw4.model.vo.Employee;



public class EmpTest {

     private Employee[] empArr;
  
     
     public EmpTest() {	
    	 
	  }
     
     public void setEmp() {
    	 
    	 empArr = new Employee[5];
    	 
    	 empArr[0]= new Employee("문말똥", 24, 1500000, 1.245);
    	 empArr[1]= new Employee("장소똥", 40, 2500000, 1.4);
    	 empArr[2]= new Employee("금개똥", 22, 1780000, 1.3);
    	 empArr[3]= new Employee("봉쥐똥", 31, 1950000, 1.365);
    	 empArr[4]= new Employee("홍닭똥", 34, 1650000, 1.212);
    	 
     }
     //출력
     public void printEmp() {
    	
    	 for(int i =0; i< empArr.length ; i++) {
    		 System.out.println(empArr[i]);		 
    	 }  	
     }
     //정렬을 이용하여 이름을 기준으로 오름차순으로 출력
     //String에서 제공되는 comepareTo() 활용
     // 이름 기준으로 오름차순
     public void nameSortPrint() {
    	 
    	 // 정렬 : 여러개의 데이터를 일정한 규칙에 따라 차례대로 순서에 맞게 나열하겠다.(sort) 
    	 // 오름차순 : 작은거에서부터 큰 순서대로 나열하겠다. ( 1 2 3 4 5 / 가 나 다 라 마/ a b c d e)
    	 // 내림차순 : 큰거에서부터 작은 순서대로 나열하겠다. ( 5 4 3 2 1 / 마 라 다 나 가 / e d c b a)
    	 
    	 /*
    	  * * 대표적인 정렬 기법 : 버블정렬 (가장 쉽고, 비효율적인 방법)
    	  * => 원리가 일일이 다 비교하는 원리   // a.comepareTo(b) : a가 크면 양수반환
    	  * => 매 시도마다 제일 뒷자리부터 차곡차곡 정렬이 이루어진다.   
    	  * => 매 시도마다 반복되는 횟수가 1씩 감소
    	  * => 맨 처음 반복은 정렬대상갯수-1 만큼 이루어짐
    	  */
    	 
    	 // 정렬해야되는 대상 갯수 : 5개
    	 
    	 for( int i=0; i <empArr.length-1 ; i++) {  //일단 크게 배열크기 -1만큼 돌리겠다.
    		 
    		 for (int j=0 ; j <empArr.length-1 -i ; j++) { //매번 4 3 2 1 만큼 반복 돌리겠다. 
    			                                      // => 매번 반복돌릴때마다 조건식 부분에서 1씩 더 빼줘야 함!
    			 //만약에 앞의 녀석이 더 크다면 자리 바꿈 / 아니면 킵
    			 if( empArr[j].getName().compareTo(empArr[j+1].getName()) > 0 ) { //더 크다면 자리 바꿔주기
    				                                                //내림차순하려면 <0 으로 하면 된다. 
    				 
    				 //임시저장소를 하나 만들어서 거기에 잠깐 보관 => 바꿔치기 용도
    				 Employee temp = empArr[j];
                     empArr[j] = empArr[j+1];
                     empArr[j+1] = temp;                   
    			 }
    		 }    		 
    	 }
    	 //적어도 이 시점에 도달했다 == 정렬이 오름차순으로 잘 이루어졌다.
    	 //위에서 만든 메소드를 재활용
    	   printEmp();

    }
     //나이 기준으로 오름차순
     public void ageSortPrint() {
    	 
    	 for(int i=0 ; i< empArr.length -1 ; i++) {  //일단 4트를 하겠다.
    		 
    		 for( int j=0; j<empArr.length -1- i ; j++) {  //4 3 2 1 바퀴를 돌리겠다. 
 
    			 if(empArr[j].getAge() > empArr[j+1].getAge()  ) {//앞의 것이 더 크다면 자리를 바꾸겠다.
    			 
    				 Employee temp=empArr[j];
    				 empArr[j] =empArr[j+1];
    				 empArr[j+1] = temp;				 
    			 }
    		 } 
    	 } //이 시점까지 오름차순으로 잘 이루어짐
    	 
    	 printEmp();
    	 
     
     
	

	
	
     }
}

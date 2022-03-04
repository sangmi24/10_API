package com.hw4.controller;

import java.util.Arrays;

import com.hw4.model.vo.Employee;



public class EmpTest {

     private Employee[] empArr;
  
     
     public EmpTest() {	
    	 
	  }
     
     public void setEmp() {
    	 
    	 empArr = new Employee[5];
    	 
    	 empArr[0]= new Employee("������", 24, 1500000, 1.245);
    	 empArr[1]= new Employee("��Ҷ�", 40, 2500000, 1.4);
    	 empArr[2]= new Employee("�ݰ���", 22, 1780000, 1.3);
    	 empArr[3]= new Employee("�����", 31, 1950000, 1.365);
    	 empArr[4]= new Employee("ȫ�߶�", 34, 1650000, 1.212);
    	 
     }
     //���
     public void printEmp() {
    	
    	 for(int i =0; i< empArr.length ; i++) {
    		 System.out.println(empArr[i]);		 
    	 }  	
     }
     //������ �̿��Ͽ� �̸��� �������� ������������ ���
     //String���� �����Ǵ� comepareTo() Ȱ��
     // �̸� �������� ��������
     public void nameSortPrint() {
    	 
    	 // ���� : �������� �����͸� ������ ��Ģ�� ���� ���ʴ�� ������ �°� �����ϰڴ�.(sort) 
    	 // �������� : �����ſ������� ū ������� �����ϰڴ�. ( 1 2 3 4 5 / �� �� �� �� ��/ a b c d e)
    	 // �������� : ū�ſ������� ���� ������� �����ϰڴ�. ( 5 4 3 2 1 / �� �� �� �� �� / e d c b a)
    	 
    	 /*
    	  * * ��ǥ���� ���� ��� : �������� (���� ����, ��ȿ������ ���)
    	  * => ������ ������ �� ���ϴ� ����   // a.comepareTo(b) : a�� ũ�� �����ȯ
    	  * => �� �õ����� ���� ���ڸ����� �������� ������ �̷������.   
    	  * => �� �õ����� �ݺ��Ǵ� Ƚ���� 1�� ����
    	  * => �� ó�� �ݺ��� ���Ĵ�󰹼�-1 ��ŭ �̷����
    	  */
    	 
    	 // �����ؾߵǴ� ��� ���� : 5��
    	 
    	 for( int i=0; i <empArr.length-1 ; i++) {  //�ϴ� ũ�� �迭ũ�� -1��ŭ �����ڴ�.
    		 
    		 for (int j=0 ; j <empArr.length-1 -i ; j++) { //�Ź� 4 3 2 1 ��ŭ �ݺ� �����ڴ�. 
    			                                      // => �Ź� �ݺ����������� ���ǽ� �κп��� 1�� �� ����� ��!
    			 //���࿡ ���� �༮�� �� ũ�ٸ� �ڸ� �ٲ� / �ƴϸ� ŵ
    			 if( empArr[j].getName().compareTo(empArr[j+1].getName()) > 0 ) { //�� ũ�ٸ� �ڸ� �ٲ��ֱ�
    				                                                //���������Ϸ��� <0 ���� �ϸ� �ȴ�. 
    				 
    				 //�ӽ�����Ҹ� �ϳ� ���� �ű⿡ ��� ���� => �ٲ�ġ�� �뵵
    				 Employee temp = empArr[j];
                     empArr[j] = empArr[j+1];
                     empArr[j+1] = temp;                   
    			 }
    		 }    		 
    	 }
    	 //��� �� ������ �����ߴ� == ������ ������������ �� �̷������.
    	 //������ ���� �޼ҵ带 ��Ȱ��
    	   printEmp();

    }
     //���� �������� ��������
     public void ageSortPrint() {
    	 
    	 for(int i=0 ; i< empArr.length -1 ; i++) {  //�ϴ� 4Ʈ�� �ϰڴ�.
    		 
    		 for( int j=0; j<empArr.length -1- i ; j++) {  //4 3 2 1 ������ �����ڴ�. 
 
    			 if(empArr[j].getAge() > empArr[j+1].getAge()  ) {//���� ���� �� ũ�ٸ� �ڸ��� �ٲٰڴ�.
    			 
    				 Employee temp=empArr[j];
    				 empArr[j] =empArr[j+1];
    				 empArr[j+1] = temp;				 
    			 }
    		 } 
    	 } //�� �������� ������������ �� �̷����
    	 
    	 printEmp();
    	 
     
     
	

	
	
     }
}

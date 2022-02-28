package com.kh.chap02_String.controller;

public class A_StringPoolTest {

	// String Ŭ������ ���ؼ� �����غ���
	// String  �� "�Һ�Ŭ����" (������ �ʴ� Ŭ����)
	// => String ��ü �������� ���� �����Ǵ� ���� 
	//  ������ ��� �� ������ ���� ����Ǵ� ���� �ƴ϶� ���ο� ������ ���ο� ���ڿ� ��ġ�� �����ϰڴ�.
	
	// String ������ ��ü �����
	// 1. �����ڸ� ���ؼ� ���ڿ� ���(String str = new String("~~"); )
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2 ); // false => �ּҰ��� ����
		
		System.out.println(str1 /*toString() */);  //hello
		System.out.println(str2);    //hello
		// String Ŭ������ toString() �޼ҵ��� ���
		// ���� ����ִ� �ּҰ��� �������� ���ҿ��� ���� ����ִ� ���ڿ��� ��ȯ�ϰԲ�
		// �������̵� �� �����̴�. 
		
		System.out.println(str1.equals(str2));  //true => ���� ���ڿ� ��
		// String Ŭ������ equals() �޼ҵ��� ���
		// ���� ����ִ� �ּҰ��� ���ϴ� ���ҿ��� ���� ����ִ� ���ڿ��� ���ؼ� 
		// ������ true, �ƴϸ� false�� ��ȯ�ϰԲ� �������̵� �� �����̴�. 
		
		System.out.println(str1.hashCode()); //�ּҰ� 99162322
		System.out.println(str2.hashCode()); //�ּҰ� 99162322  ����.
		//String Ŭ������ hashcode() �޼ҵ��� ���
		//hashcode()�� ���� ����ִ� �ּҰ��� ������� ������ ���·� �������� ���ҿ���
		//���� ����ִ� ���ڿ� ������� �ؽ��ڵ带 ������ ���·� ���� �������Բ� �������̵� �� �����̴�. 
		
		// �׷��ٸ� ��¥ �ּҰ��� �ؽ��ڵ带 �˰�ʹٸ�?
		// System .identityHashCode(������������)
		// => �ش� ��ü�� ���� �ּ��� �ؽ��ڵ带 ���
		System.out.println(System .identityHashCode(str1)); // �ּҰ� 1829164700
		System.out.println(System .identityHashCode(str2));  //�ּҰ� 2018699554 �ٸ���.
	}
	
	
	// 2. ���� ���ͷ�(=��)�ν� �ƿ� �����ع�����(String str="~~";)
	public void method2() {
		
		String str1 ="hello";
		String str2 ="hello";
		//String ��ü�� ���鶧 ���ͷ��� �����ϴ� ������� ��ü�� ����ٸ�
		// �� ���빰�� heap ������ �ִ� "���Ǯ(StringPool)" ������ �ö�
		//=> StringPool�� Ư¡ : ������ ���ڿ� ���빰�� ���� �Ұ� 
		System.out.println(str1 == str2); // true (�ּҰ� ���ؼ�- ������)
        
		System.out.println(str1);  //hello (toString �޼ҵ� ������-�������̵���)
		System.out.println(str2);  //hello
		
		System.out.println(str1.equals(str2)); // true ���ڿ��� �����
		
		System.out.println(str1.hashCode());  //99162322 (���� ���빰�� ������� ������ȭ)
		System.out.println(str2.hashCode());  //99162322
		
		System.out.println(System .identityHashCode(str1)); //1829164700 (�ּ� �� ������� ���Ѱ�)
		System.out.println(System .identityHashCode(str2)); //1829164700 ���� ����

	}
	//�Һ�Ŭ����
	public void method3() {
		
		String str = "hello";
		System.out.println(System .identityHashCode(str)); //�ּҰ� 1829164700
		
		str = "goodbye";
		System.out.println(System .identityHashCode(str)); //�ּҰ� 2018699554
		
		str += "abc";  //goodbyeabc
		
		System.out.println(System .identityHashCode(str)); //�ּҰ� 1311053135
		
		/*
		 * ������ ���Ǯ�� ������ ���� ���ڿ����� ������ �÷��Ͱ� �˾Ƽ� ��������
		 * "�Һ�" �̶�� �ؼ� ������ �ƿ� �ȵǴ� ���� �ƴ϶� (�� ��쿡�� "���" ��!)
		 * ������ �� �ڸ����� �����Ǵ� ������ �ƴ� �Ź� ���ο� �ּҰ��� �����ϴ� ����
		 */
		
	}
	
	
	
	
	
	
	
}






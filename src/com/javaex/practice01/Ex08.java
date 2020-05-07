package com.javaex.practice01;

public class Ex08 {

	public static void main(String[] args) {
		
		/*
		int x, y = 0; 
		//오류이유: 변수를 한꺼번에 선언하더라고 값은 각각 적어주어야 한다.
		
		char grade = "A"; 
		//오류이유:큰따옴표 > 작은따옴표 사용해야함
		 * 
		int salay = 2,000,000; 
		//오류이유: ,는 문자기 때문에 int에서 사용 불가능
        쉼표를 사용하려면 int가 아닌 String 사용하기
        
		byte n = 1000;
		//오류이유: byte 표현범위보다 큰 숫자 입력함
		int로 입력하거나 나중에 형변환을 해주어야 함
		*/
		
		int x= 0, y= 0; 
		char grade = 'A';
		String salay = "2,000,000";
		int n = 1000;
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(grade);
		System.out.println(salay);
		System.out.println(n);

	}

}

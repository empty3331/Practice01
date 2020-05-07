package com.javaex.practice01;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		int x, y 
		
		x = 10
		y = 20  //코드의 오류점1 : 끝에 세미콜론을 찍지 않음
		
		sum = x+y // 코드의 오류점2: 변수명만 있고 변수는 적어주지 않음
		
		System.out.println("합은'+sum);
		
		//코드의 오류점3: ""가 아니라 "'로 오타가 남
		 */
		
		
		int x, y; 
		
		x = 10; 
		y = 20;  
				
		int sum = x+y; 
		
		System.out.println("합은"+sum);
		

	}

}

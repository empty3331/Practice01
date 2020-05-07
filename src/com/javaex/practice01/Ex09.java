package com.javaex.practice01;

public class Ex09 {
	
	public static void main(String[] args) {
		
		/*
		 //화씨온도를 섭씨온도로 변화하는 식
		  * 
		double f=80.0;
		System.out.println(5/9*(f-32.0));
		
		// 제대로 된 값이 아닌 0이 나오는 이유
		 정수연산은 소수점이 계산되지 않기 때문에 값이 0이 나온다.
		 값이 제대로 나오게 하려면 앞에 실수로 형변환을 해주거나,
		 실수값을 정의해주는것이 좋다.		 	
		 */
		
		double f=80.0;
		System.out.println((double)5/(double)9*(f-32.0));
		
		
	}

}

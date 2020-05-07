package com.javaex.practice01;

public class Ex02 {
	
	public static void main(String[] args) {
		
		System.out.println( 12 / 5-3);
		/*
		 예상: 곱셈,나눗셈이 덧셈,뺄셈보다 우선순위로 계산되므로 
		       12/5 = (나머지제외)2 --> 2-3 --> -1이 출력될 것이다.
		*/
		
		System.out.println( 5 + 19 % 3);
		/*
		 예상: 곱셈,나눗셈이 덧셈,뺄셈보다 우선순위로 계산되므로 
		       19/3 = (나머지값)1 --> 5+1 --> 6이 출력될 것이다.
		*/
				
	}

}

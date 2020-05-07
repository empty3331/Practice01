package com.javaex.practice01;

public class Ex06 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ %2;
		
		System.out.println(i);
		/* 예상 : i%2 연산 --> i+1 --> i값 출력 순으로 작업되므로
		   i+1의 값인  11이 나올 것이다.*/
		
		System.out.println(n);
		/* 예상 : 뒤에붙는 ++은 다른작업보다 나중에 수행되므로
		   % 연산이 먼저 수행되어 10/2의 나머지값=0이 나올 것이다.*/
	}

}

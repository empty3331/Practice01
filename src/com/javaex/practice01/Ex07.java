package com.javaex.practice01;

public class Ex07 {
	public static void main(String[] args) {
		
			int i = 10;
			int n = ++i %2;
			
			
			System.out.println(i);
			System.out.println(n);
			
			/*Ex06과의 차이점
			++이 %보다 먼저 수행되기 때문에 
			10+1 = 11 --> 11/2의 나머지값=1 이되어
			n의 값이 1로 출력된다.
			*/
		
	}

}

package com.javaex.practice01;

public class Ex03 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a="+a);
		/* 예상: +가 출력보다 우선적으로 수행되기 때문에 
		 1+1=2 --> 2*2=4 --> 4가 출력된다.*/ 
		  
		System.out.println("b="+b);
		/* 예상: 출력이 +보다 우선적으로 수행되기 때문에 
		 1*2=2 --> 2가 출력된 후 y의 값이 2로 변한다.*/ 
		  
		System.out.println("x="+x);
		/* 예상: ++로 인해 값이 1 더해져서 2가 출력된다.*/ 
		
		System.out.println("y="+y);
		/* 예상: ++로 인해 값이 1 더해져서 2가 출력된다.*/
	}

}

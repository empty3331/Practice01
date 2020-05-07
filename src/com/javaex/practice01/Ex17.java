package com.javaex.practice01;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		//구의 부피 계산하기

		final double pi = 3.14; //파이 상수로 고정
		
		Scanner sh = new Scanner(System.in);
								
		System.out.print("반지름:");
		double r = sh.nextDouble();
		
		double v = (double)4/(double)3*pi*r*r*r;
	
		System.out.print("구의 부피는 "+v+" 입니다.");
		sh.close();
		

	}

}

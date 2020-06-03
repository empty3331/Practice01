package com.javaex.practice01;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		//원의면적 구하기
		
		final double pi =3.14;
				
		Scanner sc = new Scanner(System.in);
				
		System.out.print("반지름을 입력하세요:");
		int radius = sc.nextInt();
		double circle = pi*radius*radius;
		
		System.out.printf("원의 넓이는 "+"%.2f\n",circle);
		//소수점 2자리까지만 나타내기 위해"%.2f\n"를 넣었다.
		sc.close();
				

	}

}

package com.javaex.practice01;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		//직사각형 둘레와 면적 구하기
		
		Scanner sf = new Scanner(System.in);
								
		System.out.print("가로를 입력하세요:");
		double garo = sf.nextDouble();
		System.out.print("세로를 입력하세요:");
		double sero = sf.nextDouble();
		
		System.out.println("사각형의 넓이는 "+ garo*sero);
		System.out.println("사각형의 둘레는 "+ (garo*2+sero*2));
		sf.close();
			

	}

}

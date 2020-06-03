package com.javaex.practice01;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		//직사각형 둘레와 면적 구하기
		
		Scanner sf = new Scanner(System.in);
		double x,y;
		
								
		System.out.print("가로를 입력하세요:");
		x = sf.nextDouble();
		System.out.print("세로를 입력하세요:");
		y = sf.nextDouble();
		
		double area = x*y;
		double round = (x*2)+(y*2);
		
		System.out.println("사각형의 넓이는 "+ area);
		System.out.println("사각형의 둘레는 "+ round);
		sf.close();
			

	}

}

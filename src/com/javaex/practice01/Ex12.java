package com.javaex.practice01;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		//원의면적 구하기
		
		final double pi =3.14;
				
		Scanner sd = new Scanner(System.in);
				
		System.out.print("반지름을 입력하세요:");
		int numm = sd.nextInt();
		System.out.print("원의 넓이는 ");
		System.out.printf("%.2f\n",pi*numm*numm);
		sd.close();
				

	}

}

package com.javaex.practice01;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		//총금액 계산 프로그램
		
        Scanner sz = new Scanner(System.in);
		
		System.out.print("500원 개수:");
		int won500 = sz.nextInt();
		System.out.print("100원 개수:");
		int won100 = sz.nextInt();
		System.out.print("50원 개수:");
		int won50 = sz.nextInt();
		System.out.print("10원 개수:");
		int won10 = sz.nextInt();
		
		int wonwon = 500*won500 + 100*won100 + 50*won50 + 10*won10;
		
		System.out.println("동전의 총합은 "+wonwon+" 원 입니다.");
		
		
		sz.close();
		

	}

}

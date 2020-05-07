package com.javaex.practice01;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		//저축액 계산하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요:");
		int num = sc.nextInt();
		
		System.out.print("10년동안 최대 저축액은 " + num*12 +"원 입니다.");
		
		sc.close();

	}

}

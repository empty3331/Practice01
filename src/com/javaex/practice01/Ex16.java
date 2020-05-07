package com.javaex.practice01;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		//부가세 계산하기
		
		Scanner sh = new Scanner(System.in);
		
		System.out.print("상품가격:");
		double won1 = sh.nextDouble();
		System.out.print("받은돈:");
		double won2 = sh.nextDouble();
		
		double won3 = won1/10;
		double won4 = won2-won1;
		
		System.out.println("====================");
		System.out.println("받은돈: "+won2);
		System.out.println("상품가격: "+won1);
		System.out.println("부가세: "+won3);
		System.out.println("잔액: "+won4);
		
		
		sh.close();
		
		
		

	}

}

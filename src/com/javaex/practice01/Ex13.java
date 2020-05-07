package com.javaex.practice01;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		//달러 환전하기
		
		final double dol =1230.95; //환율 상수로 고정
						
		Scanner se = new Scanner(System.in);
						
		System.out.print("환전할 원화를 입력하세요:");
		double nummm = se.nextDouble();
		System.out.print("받으실 달러는 "+nummm/dol);
		se.close();
		
	}

}

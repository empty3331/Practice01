package com.javaex.practice01;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		//mile==>km 변환하기
		
		final double km =1.609; //마일 상수로 고정
								
		Scanner sg = new Scanner(System.in);
								
		System.out.print("마일을 입력하세요:");
		double mile = sg.nextDouble();
		System.out.print(mile+"마일은 "+km*mile+"킬로미터 입니다.");
		sg.close();
				

	}

}

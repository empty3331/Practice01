package com.javaex.practice01;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		//화씨온도 ==> 섭씨온도

		Scanner si = new Scanner(System.in);
										
		System.out.print("화씨:");
		double f = si.nextDouble();
				
		double c = (double)5/(double)9*(f-(double)32);
			
		System.out.print("화씨"+f+" 의 섭씨온도는"+c+" 입니다.");
		si.close();
				

	}

}

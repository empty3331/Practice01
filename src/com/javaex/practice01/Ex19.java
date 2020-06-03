package com.javaex.practice01;


public class Ex19 {

	public static void main(String[] args) {
		
		//빛의 거리 계산하기
		
	
		long f = 300000;//초당 이동 거리
		long g = 60*60*24*365;//1년 초단위로 계산
		long year =1;
		long yearkm = year*f*g;
							
		System.out.print("빛이 "+year+"년동안 가는 거리는"+yearkm+" km 입니다.");
		
		

	}

}

package edu.java.conditional01;

import java.util.Scanner;

public class ConditionalMain01 {
	
	public static void main(String[] args) {
			//조건문 (Conditional statement)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력>>>");
		int number = sc.nextInt();
		sc.close();
		
		if (number > 0) { //만약 number가 0보다 크면
			System.out.println("양수");
			
		}
		System.out.println("===프로그램 끝===");
	}
}

package edu.java.array08;

import java.util.Random;

//성적 처리 프로그램
public class ArrayMain08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		// 0~100사이의 난수를 10개를 저장할수 있는 배열 선언.
		int[] scores = new int[10];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = rand.nextInt(101);
		}	
	
		System.out.print("scores: ");
		for (int s : scores) {
			System.out.print(s + " ");
		}
		System.out.println();
		int sum=0;
		for (int s : scores) {
			sum += s;
		}
		//평균을 계산하고 출력:
		System.out.println("총점: " + sum);
		double mean = (double)sum / scores.length;
		System.out.println("평균: " + mean);
		
		double sumOfSquares = 0.0;
		for (int s :  scores) {
			sumOfSquares += (s-mean)*(s-mean);
		}
		double deviation = sumOfSquares /scores.length;
		double stdDev = Math.sqrt(deviation);
		System.out.println("표준편차: " + stdDev);
		
		//최댓값을 찾아서 출력
		int max = scores[0]; //배열의 첫번째 원소를 최댓값이라고 가정
		for (int i = 1; i<scores.length; i++) {//배열의 원소들을 모두 반복하면서
			if(max < scores[i]) { // 배열에서 max보다 더 큰값을 찾으면
				max = scores[i]; // max를 배열에서 찾은 값으로 바꿈
			}
		}
		
		System.out.println("최댓값: " + max);
		
		//최솟값을 찾아서 출력
		int min = scores[0]; // 최솟값을 배열의 첫번째 값이라고 가정
		for (int s : scores) { //배열의 모든 원소들에 대해서 반복하면서
			if(min > s) { //배열에서 min보다 더 작은 값을 발견했다면
				min = s; // 더 작은 값으로 min을 변경
			}
		}
		System.out.println("최솟값: " + min);
		
	} //end main

}

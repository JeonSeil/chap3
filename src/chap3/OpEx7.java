package chap3;

import java.util.Scanner;

/*
 * 삼항 연산자 : 조건연산자  ? :
 * (조건문)?참:거짓
 * 조건문의 결과는 무조건  boolean이어야 한다.
 */
public class OpEx7 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요(0~100)");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt(); //55
		String result = (score>=60)?"합격":"불합격";
		System.out.println(score + "점수는 " + result + "입니다.");	
		System.out.println(score + "점수는 " + ((score>=60)?"합격":"불합격") + "입니다.");
		int i = 1;
		String error = (false)?"참":"거짓";
		System.out.println(error);
	}
}

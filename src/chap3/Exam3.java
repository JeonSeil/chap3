package chap3;

import java.util.Scanner;

/*
 * 화면에서 3자리 정수를 입력받아 
 * [예1]
 * 세자리 정수를 입력하세요
 * 321
 * 301 
 * [예2]
 * 세자리 정수를 입력하세요
 * 100
 * 101 
 * [예3]
 * 세자리 정수를 입력하세요
 * 199
 * 101 
 */
public class Exam3 {
	public static void main(String[] args) {
		int num;
		System.out.println("세자리 정수를 입력하세요");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println((num / 100) * 100 + 1);
	}
}

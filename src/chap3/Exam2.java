package chap3;

import java.util.Scanner;

/*
 * 화면에서 3자리 정수를 입력받아 100 자리 미만을 버리고 출력하기
 * [예1]
 * 세자리 정수를 입력하세요
 * 321
 * 300 
 * [예2]
 * 세자리 정수를 입력하세요
 * 100
 * 100 
 * [예3]
 * 세자리 정수를 입력하세요
 * 199
 * 100 
 */
public class Exam2 {
	public static void main(String[] args) {
			int num;
			System.out.println("세자리 정수를 입력하세요");
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			System.out.println((num-(num%100)));
			System.out.println((num/100)*100);
	}
}

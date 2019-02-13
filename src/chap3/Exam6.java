package chap3;

import java.util.Scanner;

/*
 * 문자를 입력받아서 소문자인 경우 대문자로 변경하여 출력하기.
 * 영문자 아닌 경우 소문자 아님 출력하기
 * Scanner.next() String  리턴
 * 한문자 저장 
 * char c = scan.next().charAt(0);
 * 
 *  [예1]
 *  한문자를 입력하세요
 *  a
 *  A
 *  [예2]
 *  한문자를 입력하세요
 *  1
 *  소문자 아님
 */
public class Exam6 {
	public static void main(String[] args) {
		System.out.println("소문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		System.out.println(ch + 
				(((ch>='a')&&(ch <='z'))?"의 대문자는 " + (char)(ch-32):"문자는 소문자 아님"));
	}
}

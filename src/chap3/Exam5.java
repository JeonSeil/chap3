package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 양수면 양수, 음수면 음수를 0인 0을 출력하기 : 오세현
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력받아서 양수면 양수, 음수면 음수를 0인 0을 출력하기");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("입력된 수는 : "  + ((num1>0)?"양수":(num1<0)?"음수":"0"));
	}
}

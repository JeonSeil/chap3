package chap3;

import java.util.Scanner;

/*
 * 화면에서 점수를 입력받아서 90점이상이면 A학점, 80점이상이면 B학점,70점이상이면 C학점,60점이상이면 D학점,
 *  60점 미만이면 F학점 을 출력하기
 *  
 *   [예1]
 *   점수를 입력하세요
 *   88
 *   B학점입니다.
 */
public class Exam9 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade = (score>=90)?"A":
			           (score>=80)?"B":
			           (score>=70)?"C":
			           (score>=60)?"D":"F";
		System.out.println(grade + "학점입니다.");

	}
}

package chap3;

import java.util.Scanner;

//12345 초가 몇시간 몇분 몇초인지 출력하기
//결과
// ??시간 ??분 ??초
public class Exam1 {
	public static void main(String[] args) {
		int num = 12345;
		System.out.println("계산할 초를 입력하세요");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println(num/3600 + "시간" + ((num%3600)/60) + "분" + (num%60) + "초");	
	}
}

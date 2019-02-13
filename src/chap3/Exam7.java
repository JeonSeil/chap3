package chap3;

import java.util.Scanner;

/*
 * 사과를 사과 상자에 담기 위한 상자의 갯수를 출력하기
 * 한 상자에는 사과를 10개씩 담을 수 있다.  이해인
 * 
 * [예1]
 * 사과의 갯수를 입력하세요
 * 22
 * 필요한 상자의 갯수 : 3
 * [예2]
 * 사과의 갯수를 입력하세요
 * 30
 * 필요한 상자의 갯수 : 3
 */
public class Exam7 {
	public static void main(String[] args) {
		System.out.println("사과의 개수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int apple = scan.nextInt();
		String result = "필요한 상자의 개수 : " + ((apple%10 == 0)?(apple/10):(apple/10)+1) +"박스";
		System.out.println(result);
		int box = (apple/10) + ((apple%10==0)?0:1);
		System.out.println("필요한 상자의 갯수 :" + box);		
	}
}

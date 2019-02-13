package chap3;

import java.util.Scanner;

/*
 * 조건 연산자 예제
 * 두개의 숫자를 입력받아서 더 큰수를 출력하기
 */
public class OpEx8 {
	public static void main(String[] args) {
		System.out.println("숫자 두개를 입력하세요");
		//System.in : 표준입력. 키보드 입력
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt(); //10
		int num2 = scan.nextInt(); //20
		
		int result = (num1>num2)?num1:num2;
		System.out.println("입력된 두 수 중 더 큰수 : " + result);
		System.out.println("입력된 두 수 중 더 큰수 : " 
		   + ((num1>num2)?num1:(num1<num2)?num2:"두수는 같다"));
		
	}
}

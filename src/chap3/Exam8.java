package chap3;

import java.util.Scanner;

/*
 * 10부터 99사이의 수를 입력받아 입력받은 수보다 크거나 같으면서, 가장 가까운 10의 배수를 구하여
 *  구해진 10의 배수와 입력받은 수의 차를 출력하기
 *  
 *  [예1]
 *  10부터 99사이의 수를 입력하세요
 *  24
 *  30 - 24 = 6
 *  [예2]
 *  10부터 99사이의 수를 입력하세요
 *  20
 *  20 - 20 = 0
 *  [예3]
 *  10부터 99사이의 수를 입력하세요
 *  77
 *  80 - 77 = 3
 */
public class Exam8 {
	public static void main(String[] args) {
		System.out.println("두자리 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int num10 = (num/10)*10 + ((num%10==0)?0:10);
		System.out.println(num10+ "-" + num + "=" + (num10 - num));
	}
}

package chap3;

import java.util.Scanner;

/*
 * 10���� 99������ ���� �Է¹޾� �Է¹��� ������ ũ�ų� �����鼭, ���� ����� 10�� ����� ���Ͽ�
 *  ������ 10�� ����� �Է¹��� ���� ���� ����ϱ�
 *  
 *  [��1]
 *  10���� 99������ ���� �Է��ϼ���
 *  24
 *  30 - 24 = 6
 *  [��2]
 *  10���� 99������ ���� �Է��ϼ���
 *  20
 *  20 - 20 = 0
 *  [��3]
 *  10���� 99������ ���� �Է��ϼ���
 *  77
 *  80 - 77 = 3
 */
public class Exam8 {
	public static void main(String[] args) {
		System.out.println("���ڸ� ������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int num10 = (num/10)*10 + ((num%10==0)?0:10);
		System.out.println(num10+ "-" + num + "=" + (num10 - num));
	}
}

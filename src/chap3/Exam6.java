package chap3;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾Ƽ� �ҹ����� ��� �빮�ڷ� �����Ͽ� ����ϱ�.
 * ������ �ƴ� ��� �ҹ��� �ƴ� ����ϱ�
 * Scanner.next() String  ����
 * �ѹ��� ���� 
 * char c = scan.next().charAt(0);
 * 
 *  [��1]
 *  �ѹ��ڸ� �Է��ϼ���
 *  a
 *  A
 *  [��2]
 *  �ѹ��ڸ� �Է��ϼ���
 *  1
 *  �ҹ��� �ƴ�
 */
public class Exam6 {
	public static void main(String[] args) {
		System.out.println("�ҹ��ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		System.out.println(ch + 
				(((ch>='a')&&(ch <='z'))?"�� �빮�ڴ� " + (char)(ch-32):"���ڴ� �ҹ��� �ƴ�"));
	}
}

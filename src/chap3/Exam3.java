package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� 3�ڸ� ������ �Է¹޾� 
 * [��1]
 * ���ڸ� ������ �Է��ϼ���
 * 321
 * 301 
 * [��2]
 * ���ڸ� ������ �Է��ϼ���
 * 100
 * 101 
 * [��3]
 * ���ڸ� ������ �Է��ϼ���
 * 199
 * 101 
 */
public class Exam3 {
	public static void main(String[] args) {
		int num;
		System.out.println("���ڸ� ������ �Է��ϼ���");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println((num / 100) * 100 + 1);
	}
}

package chap3;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾Ƽ� ����� ���, ������ ������ 0�� 0�� ����ϱ� : ������
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է¹޾Ƽ� ����� ���, ������ ������ 0�� 0�� ����ϱ�");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("�Էµ� ���� : "  + ((num1>0)?"���":(num1<0)?"����":"0"));
	}
}

package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� ������ �Է¹޾Ƽ� 90���̻��̸� A����, 80���̻��̸� B����,70���̻��̸� C����,60���̻��̸� D����,
 *  60�� �̸��̸� F���� �� ����ϱ�
 *  
 *   [��1]
 *   ������ �Է��ϼ���
 *   88
 *   B�����Դϴ�.
 */
public class Exam9 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade = (score>=90)?"A":
			           (score>=80)?"B":
			           (score>=70)?"C":
			           (score>=60)?"D":"F";
		System.out.println(grade + "�����Դϴ�.");

	}
}

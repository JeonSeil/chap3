package chap3;

import java.util.Scanner;

//12345 �ʰ� ��ð� ��� �������� ����ϱ�
//���
// ??�ð� ??�� ??��
public class Exam1 {
	public static void main(String[] args) {
		int num = 12345;
		System.out.println("����� �ʸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println(num/3600 + "�ð�" + ((num%3600)/60) + "��" + (num%60) + "��");	
	}
}

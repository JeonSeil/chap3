package chap3;

import java.util.Scanner;

/*
 * ����� ��� ���ڿ� ��� ���� ������ ������ ����ϱ�
 * �� ���ڿ��� ����� 10���� ���� �� �ִ�.  ������
 * 
 * [��1]
 * ����� ������ �Է��ϼ���
 * 22
 * �ʿ��� ������ ���� : 3
 * [��2]
 * ����� ������ �Է��ϼ���
 * 30
 * �ʿ��� ������ ���� : 3
 */
public class Exam7 {
	public static void main(String[] args) {
		System.out.println("����� ������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int apple = scan.nextInt();
		String result = "�ʿ��� ������ ���� : " + ((apple%10 == 0)?(apple/10):(apple/10)+1) +"�ڽ�";
		System.out.println(result);
		int box = (apple/10) + ((apple%10==0)?0:1);
		System.out.println("�ʿ��� ������ ���� :" + box);		
	}
}

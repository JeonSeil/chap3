package chap3;

import java.util.Scanner;

/*
 * ���� ������ ����
 * �ΰ��� ���ڸ� �Է¹޾Ƽ� �� ū���� ����ϱ�
 */
public class OpEx8 {
	public static void main(String[] args) {
		System.out.println("���� �ΰ��� �Է��ϼ���");
		//System.in : ǥ���Է�. Ű���� �Է�
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt(); //10
		int num2 = scan.nextInt(); //20
		
		int result = (num1>num2)?num1:num2;
		System.out.println("�Էµ� �� �� �� �� ū�� : " + result);
		System.out.println("�Էµ� �� �� �� �� ū�� : " 
		   + ((num1>num2)?num1:(num1<num2)?num2:"�μ��� ����"));
		
	}
}

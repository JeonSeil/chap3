package chap3;
/*
 * ���� ������ : ����������  ++,--
 *   ������ : ++�ǿ����� :
 *          ���������ڸ� ���� ������. ���Ŀ� �ٸ� ����� ó����.
 *   ������ : �ǿ�����++ :
 *          ���� ������ ������ �ٸ� ����� �����ϰ�, ���������ڸ� ���߿� ������. 
 */
public class OpEx1 {
	public static void main(String[] args) {
		int x=5,y=5;
		x = x + 1; 
		System.out.println("x=" + x); //x=6
		x++; 
		System.out.println("x=" + x); //x=7
		y++;
		System.out.println("y=" + y); //x=6
		++x; 
		System.out.println("x=" + x); //x=8
		++y;
		System.out.println("y=" + y); //y=7
		y = x++;
		System.out.println("x="+x + ",y=" + y); //x=9,y=8
		y = ++x;
		System.out.println("x="+x + ",y=" + y); //x=10,y=10
		y = x--;
		System.out.println("x="+x + ",y=" + y); //x=9,y=10
		y = --x;
		System.out.println("x="+x + ",y=" + y); //x=8,y=8
		System.out.println("x="+ x++); //x=8
		System.out.println("x="+ x); //x=9
		System.out.println("x="+ ++x); //x=10
	}
}
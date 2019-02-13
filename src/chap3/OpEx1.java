package chap3;
/*
 * 단항 연산자 : 증감연산자  ++,--
 *   전위형 : ++피연산자 :
 *          증감연산자를 먼저 실행함. 이후에 다른 기능을 처리함.
 *   후위형 : 피연산자++ :
 *          증감 연산자 이전에 다른 기능을 수행하고, 증감연산자를 나중에 실행함. 
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

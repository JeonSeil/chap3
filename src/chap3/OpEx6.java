package chap3;
/*
 * 이항연산자 : 대입연산자. 연산의 방향 <-----
 *   int a = 10;
 *    a = 10;
 *       lvalue = rvalue;
 *       lvalue : 반드시 변수,상수 여야함.
 *       rvalue : 값, 변수, 상수, 수식     가능
 *       a + 10 = 100; (x)
 *       a = 100 + 10; (0)
 */
public class OpEx6 {
	public static void main(String[] args) {
		int num = 100;
		System.out.println(num); //100
		num += 10;    //num = num + 10;
		System.out.println(num); //110
		num /= 10;
		System.out.println(num); //11
		num += 2 + 3;
		System.out.println(num); //16
		
		byte b = 1;
		b *= 2;
		//b = b * 2;
		System.out.println(b); //2
		b *= 2;
		System.out.println(b); //4
		b *= 2;
		System.out.println(b); //8
	}
}

package chap3;
/*
 * 이항연산자 : shift 연산자 >> << >>>
 *   << n : 왼쪽으로 n 비트 이동하기. 기장 오른쪽의 비트는 0으로 채움
 *   >> n : 오른쪽으로 n비트 이동하기. 가장 왼쪽비트는 부호비트로 채움 
 *   >>> n : 오른쪽으로 n비트 이동하기. 가장 왼쪽비트는 0으로 채움 
 */
public class OpEx5 {
	public static void main(String[] args) {
		System.out.println("8 << 2 : " + (8 << 2));
		/*
		 * 8   : 00001000
		 * <<2 : 00100000  : 32
		 */
		System.out.println("8 >> 2 : " + (8 >> 2));
		/*
		 * 8   : 00001000
		 * >>2 : 00000010   : 2
		 */
		System.out.println("8 >>> 2 : " + (8 >>> 2));
		/*
		 * 8    : 00001000
		 * >>>2 : 00000010  : 2
		 */
		System.out.println("-8 << 2 : " + (-8 << 2));
		/*
		 * -8 : 1111000
		 * <<2 :1100000 : -32 
		 */
		System.out.println("-8 >> 2 : " + (-8 >> 2));
		/*
		 * -8 : 1111000
		 * >>2 :1111110  : -2 
		 */
		System.out.println("-8 >>> 2 : " + (-8 >>> 2));
		/*
		 * -8   : 1111000
		 * >>>2 : 0011110  :  xxx
		 */
		System.out.println("8의 이진수 :" + Integer.toBinaryString(8));
		System.out.println("-8의 이진수 :" + Integer.toBinaryString(-8));
	}
}

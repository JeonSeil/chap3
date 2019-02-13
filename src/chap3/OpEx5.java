package chap3;
/*
 * ���׿����� : shift ������ >> << >>>
 *   << n : �������� n ��Ʈ �̵��ϱ�. ���� �������� ��Ʈ�� 0���� ä��
 *   >> n : ���������� n��Ʈ �̵��ϱ�. ���� ���ʺ�Ʈ�� ��ȣ��Ʈ�� ä�� 
 *   >>> n : ���������� n��Ʈ �̵��ϱ�. ���� ���ʺ�Ʈ�� 0���� ä�� 
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
		System.out.println("8�� ������ :" + Integer.toBinaryString(8));
		System.out.println("-8�� ������ :" + Integer.toBinaryString(-8));
	}
}

package test;

/*
 °á°ú :
      c=30
      ch=C
      f=1.5
      l=27000000000
      result=true 
*/
public class OpEx04 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
//		byte c = a + b;
		byte c = (byte) (a + b);
		char ch = 'A';
//		ch = ch + 2;  //67
		ch = (char) (ch + 2);  //67
//		float f = 3 / 2;
		float f = 3 / 2f;
//		long l = 3000 * 3000 * 3000;
		long l = 3000L * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
//		boolean result = d == f2;
		boolean result = (float)d == f2;
		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);
		System.out.printf("float : %.20f\ndouble : %.20f",0.1f,0.1);
	}
}

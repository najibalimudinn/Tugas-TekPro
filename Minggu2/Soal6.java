import java.util.Scanner;
import java.math.BigInteger;

public class Soal6 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		BigInteger a = inp.nextBigInteger();
		BigInteger b = inp.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
	}
}
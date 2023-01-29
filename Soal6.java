import java.util.Scanner;
import java.math.BigInteger;

public class Soal6 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		BigInteger a = new BigInteger((String)inp.nextLine());
		BigInteger b = new BigInteger((String)inp.nextLine());
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
	}
}
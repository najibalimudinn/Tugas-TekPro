import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String[] s = new String[3];
		int[] n = new int[3];
		
		for(int i=0;i<3;i++) {
			s[i] = inp.next();
			n[i] = inp.nextInt();
		}
		
		System.out.println("===============================");
		for(int i=0;i<3;i++){
			System.out.printf("%s%03d\n",String.format("%0$-15s", s[i]),n[i]);
		}
		System.out.println("===============================");
	}
}

import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int hasil = 0;
		while(true){
			boolean valid = true;
			int A = inp.nextInt();
			String Opr = inp.next();
			int B = inp.nextInt();
			if(A>10000 || A<1 || B>10000 || B<1 || Opr.length()>1) valid = false;
			switch(Opr){
				case "+":
					hasil = A+B;
					break;
				case "-":
					hasil = A-B;
					break;
				case "*":
					hasil = A*B;
					break;
				case "/":
					hasil = A/B;
					break;
				case "%":
					hasil = A%B;
					break;
				default:
					valid = false;
					break;
			}
			if(valid == true) break;
		}
		System.out.println(hasil);
	}
}
import java.util.Scanner;

public class Soal5 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String plat = inp.nextLine();
		long platInt = Long.parseLong(plat.replaceAll(" ",""));
		if((platInt-999999)%5 == 0) System.out.println("berhenti");
		else System.out.println("jalan");
	}
}
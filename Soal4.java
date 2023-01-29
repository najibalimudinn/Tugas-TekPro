import java.util.Scanner;

public class Soal4 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int gaji;
		int gajiPokok = 500000;
		int hargaItem = 50000;
		int jmlPenjualan = inp.nextInt();
		
		if(jmlPenjualan >= 15){
			if(jmlPenjualan >= 40){
				if(jmlPenjualan >=80) gaji = gajiPokok + (jmlPenjualan*hargaItem*35/100);
				else gaji = gajiPokok + (jmlPenjualan*hargaItem*25/100);
			}
			else gaji = gajiPokok + ((hargaItem*10/100)*jmlPenjualan);
		}
		else gaji = gajiPokok - ((15-jmlPenjualan)*hargaItem*15/100);
		
		System.out.println(gaji);
	}
}
import java.util.Scanner;

public class PraktikumNo1 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int a;
			int i;
			int u;
			int e;
			int o;

			try {
				System.out.println("Masukkan 5 Angka!");
				a = input.nextInt();
				i = input.nextInt();
				u = input.nextInt();
				e = input.nextInt();
				o = input.nextInt();

				int genap = 0;
				int ganjil = 0;
				int positif = 0;
				int negatif = 0;

				//============ A
				if(a % 2 == 0){
					genap++;
				} else {
					ganjil++;
				}
				if(a > 0){
					positif++;
				} else {
					negatif++;
				}
				//============= B
				if(i % 2 == 0){
					genap++;
				} else {
					ganjil++;
				}
				if(i > 0){
					positif++;
				} else {
					negatif++;
				}
				//============= C
				if(u % 2 == 0){
					genap++;
				} else {
					ganjil++;
				}
				if(u > 0){
					positif++;
				} else {
					negatif++;
				}
				//============= D
				if(e % 2 == 0){
					genap++;
				} else {
					ganjil++;
				}
				if(e > 0){
					positif++;
				} else {
					negatif++;
				}
				//============= E
				if(o % 2 == 0){
					genap++;
				} else {
					ganjil++;
				}
				if(o > 0){
					positif++;
				} else {
					negatif++;
				}

				System.out.println(genap + " Angka Genap");
				System.out.println(ganjil + " Angka Ganjil");
				System.out.println(positif + " Angka Positif");
				System.out.println(negatif + " Angka Negatif");
			} catch (Exception E) {
				System.out.println("Inputan tidak Valid!");
			}
		}
}

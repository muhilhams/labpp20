import java.util.Scanner;
class Nomor4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int harga = sc.nextInt();
		int bayar = sc.nextInt();
		int uang1;
		int uang2;
		int uang3;
		int uang4;
		int uang5;
		int uang6;
		int uang7;
		int hasil = bayar - harga;
		uang1 = hasil / 100000;
		System.out.println(uang1 + " Uang Rp. 100.000" );
		if (hasil % 100000 < 100000 && hasil % 100000 >= 50000) {
				uang2 = hasil % 100000 / 50000;
				System.out.println(uang2 + " Uang Rp. 50.000");
				
			}
			else{
				System.out.println("0" + " Uang Rp. 50.000");
			}
			if (hasil % 50000 < 50000 && hasil % 50000 >= 20000) {
				uang3 = hasil % 50000 / 20000;
				System.out.println(uang3 + " Uang Rp. 20.000");
			}
			else{
				System.out.println("0" + " Uang Rp. 20.000");
			}
			if (hasil % 20000 < 20000 && hasil % 20000 >= 10000) {
				uang4 = hasil % 20000 / 10000;
				System.out.println(uang4 + " Uang Rp. 10.000");
			}
			else{
				System.out.println("0" + " Uang Rp. 10.000");
			}
			if (hasil % 10000 < 10000 && hasil % 10000 >= 5000) {
				uang5 = hasil % 10000 / 5000;
				System.out.println(uang5 + " Uang Rp. 5.000");
			}
			else{
				System.out.println("0" + " Uang Rp. 5.000");
			}
			if (hasil % 5000 < 5000 && hasil % 5000 >= 2000) {
				uang6 = hasil % 5000 / 2000;
				System.out.println(uang6 + " Uang Rp. 2.000");
			}
			else{
				System.out.println("0" + " Uang Rp. 2.000");
			}
			if (hasil % 2000 < 2000 && hasil % 2000 >= 1000) {
				uang7 = hasil % 2000 / 1000;
				System.out.println(uang7 + " Uang Rp. 1.000");
			}
			else{
				System.out.println("0" + " Uang Rp. 1.000");
			}


		}

	}

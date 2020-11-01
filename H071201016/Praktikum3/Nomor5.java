import java.util.Scanner;
class Nomor5{
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);

		// 15 derajat = 1 jam
		// 0.25 derajat = 1 menit
		// 0.00416666 = 1 detik
		float derajat = obj.nextFloat();

		
		float detik = derajat / 0.004166667f;
		detik++;
		int jam = (int)detik / 3600;
		int menit = ((int)detik % 3600)/60;
		int detik2 = ((int)detik % 3600 )%60;
		jam = jam + 6;

		if (jam >= 24){
			jam = jam - 24;
		}
		if (jam >= 6 && jam < 12) {
			System.out.println("Selamat Pagi");
		}
		else if (jam >= 12 && jam < 15) {
			System.out.println("Selamat Siang");
		}
		else if (jam >= 15 && jam <= 18) {
			System.out.println("Selamat Sore");
		}
		else if (jam > 18 && jam <= 23) {
			System.out.println("Selamat Malam");
		}
		else if (jam >= 0 && jam < 3) {
			System.out.println("Selamat Tengah Malam");
		}
		else if (jam >= 3 && jam < 6) {
			System.out.println("Selamat Subuh");
		}
		System.out.printf("%02d:%02d:%02d", jam, menit, detik2);


	}
}
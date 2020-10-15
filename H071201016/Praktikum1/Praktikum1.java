import java.util.Scanner;
class Praktikum1{
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("masukkan waktu :");
		int waktuTempuh = x.nextInt();
		System.out.print("masukkan kecepatan rata rata :");
		int kecepatanRatarata = x.nextInt();
		double bensin = (float)(waktuTempuh * kecepatanRatarata) / 14;
		
		System.out.printf("bensin yang digunakan %.3f" + "L", bensin);

	}
}


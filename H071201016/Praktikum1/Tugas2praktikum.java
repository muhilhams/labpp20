import java.util.Scanner;
class Tugas2praktikum{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = a / 3600;
		int c = (a % 3600)/60;
		int d = (a % 3600)%60;

		System.out.printf("%02d:%02d:%02d", b, c, d);
	}

}
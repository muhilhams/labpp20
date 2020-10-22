import java.util.Scanner;
class Tugas3praktikum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Tinggi Menara : ");
		int h = scan.nextInt();
		System.out.print("Sudut elevasi terhadap ujung depan kapal : ");
		int a = scan.nextInt();
		System.out.print("Sudut elevasi terhadap ujung belakang kapal :");
		int b = scan.nextInt();
		double sa, sb, panjangkapal;

		sa = Math.tan(Math.toRadians(a)) * h;
		sb = Math.tan(Math.toRadians(b)) * h;
		panjangkapal = sa - sb;
		System.out.printf("Panjang Kapal : %.1f" + "m", panjangkapal);

	}
}
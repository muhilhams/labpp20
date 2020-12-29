import java.util.Scanner;

class Nomor3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		myDay(n);
	}
	public static void myDay(int n){
		int tahun= 0;
		int bulan= 0;
		int hari= 0;
		while (n>0){
			if (n>=365){
				n = n-365;
				tahun++;
			}
			else if ((n<365)&&(n>30)){
				n = n-30;
				bulan++;
			}
			else if (n<30){
				n= n-1;
				hari++;
			}
		}
		System.out.println(tahun + " tahun");
		System.out.println(bulan + " bulan");
		System.out.println(hari + " hari");		
		
		

		
	}
}
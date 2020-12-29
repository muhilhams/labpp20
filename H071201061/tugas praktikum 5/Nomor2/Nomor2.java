import java.util.Scanner;

class Nomor2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan banyaknya blok!");
		int n = scanner.nextInt();
		System.out.println("Masukkan jumlah digit setiap blok!");
		int m = scanner.nextInt();
		String serialNumber = generateSerial(n,m);
		System.out.println(serialNumber);

	}
	public static String generateSerial (int n, int m){
		int arrayy [] = new int[n];String str= "";
			for (int i=0; i<n; i++){
				arrayy[i] = (int) (Math.random()*(Math.pow(10,m))) ;
				if (arrayy[i]>(Math.pow(10,m-1)-1)){
					if (i<n-1){
						str = str + arrayy[i]+ "-";}
					else { 
						str = str + arrayy[i]; }
				}
				else if ((arrayy[i]>Math.pow(10,m-2)-1)&&(arrayy[i]<(Math.pow(10,m-1)))){
					String strr = "0" + arrayy[i];
					if (i<n-1){
						str = str + strr+ "-";
					}
					else { 
						str = str + strr; 
					}
				}
			}
			
		
		

		return str;
	}
}
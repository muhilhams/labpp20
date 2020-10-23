import java.util.Scanner;
class Nomor1{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		try{
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		int d = obj.nextInt();
		int e = obj.nextInt();
		int ganjil = 0;
		int genap = 0;
		int negatif = 0;
		int positif = 0;
		
		
		int [] angka = {a, b, c, d, e};

		for (int i: angka){
			if(i %2==0){	
			genap++;

				if(i > 0)
					positif++;
			} 
			if(i %2==1){
				ganjil++;

				if(i > 0)
					positif++;
			}
			if(i < 0){
				negatif++;
			}
		}
			System.out.println(genap + " angka genap");
			System.out.println(ganjil + " angka ganjil");
			System.out.println(positif + " angka positif");
			System.out.println(negatif + " angka negatif");

		} catch (Exception e){
			System.out.println("Inputan Tidak Valid!!");
			}
		}
		}
	
	                                         
		

	

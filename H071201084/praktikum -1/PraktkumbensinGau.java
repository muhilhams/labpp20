import java.util.Scanner;

public class PraktkumbensinGau{

	public static void main(String[] args) {
		    Scanner x = new Scanner(System.in);
		    double Jam , Kecepatan , efisiensi = 14;

		    System.out.println("isi jam dan kecepatan");
		 
		 double jam= x.nextDouble();
		 double kecepatan= x.nextDouble();
		 
		    double bensin=((jam*kecepatan)/14);
		
		    System.out.println("Bensin yang terpakai:");
		    System.out.printf("%.3f Liter", +bensin);
	
	
	
	}
}
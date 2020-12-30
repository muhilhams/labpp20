import java.util.Scanner;
class Nomor1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x > y) {
			int temp = x;
			x = y;
			y = temp;
		}
		for(int i = x; i<=y; i++){
			if(i<0 && i%2==0){
				System.out.println(i + " genap negatif");
			}
			else if(i<0){
				System.out.println(i + " ganjil negatif");
			}
			else if(i==0){
				System.out.println(i + " nol");
			}
			else if(i>0 && i%2==0){
				System.out.println(i + " genap positif");
			}
			else if(i>0 && i%2==1){
				System.out.println(i + " ganjil positif");
			}    
		// else if (x < y){
		// 	for(int j = y; j<=x; j--){
		// }
		// 	// if(i<0 && i%2==0){
		// 	// 	System.out.println(i + " genap negatif");
		// 	// }
		// 	// else if(i<0){
		// 	// 	System.out.println(i + " ganjil negatif");
		// 	// }
		// 	// else if(i==0){
		// 	// 	System.out.println(i + " nol");
		// 	// }
		// 	// else if(i>0 && i%2==0){
		// 	// 	System.out.println(i + " genap positif");
		// 	// }
		// 	// else if(i>0 && i%2==1){
		// 	// 	System.out.println(i + " ganjil positif");
		// 	// }    
		// }
		// }
		}
	}

}

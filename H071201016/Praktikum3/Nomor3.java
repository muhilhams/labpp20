import java.util.Scanner;
class Nomor3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;

		if (n == 1) {
			System.out.print(0);
		} else if (n == 2) {
			System.out.printf("%d, %d",a, b);
		} else{

		System.out.printf("%d, %d",a, b);
		System.out.print(", ");
		
		for (int i = 3;i <= n ;i++ ) {
			int next = a + b;  
			System.out.print(next + ", ");
			a = b; 
			b = next;
			count++;
		}
		}

	}
}
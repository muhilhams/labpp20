import java.util.Scanner;
public class Nomor1{
	public static void main(String[] args){
		Scanner inputt = new Scanner(System.in);
		int a= inputt.nextInt();
		int b= inputt.nextInt();
		System.out.print("FPB dari "+ a+" dan " +b  +" = ");
		cariFPB(a,b);
	}
	public static void cariFPB(int a, int b){
		int n; int d; int r;
		if (a>b){
			n = a;
			d = b;
			r = n%d;
			while(r!=0){
				n=d;
				d=r;
				r = n%d;
			}
			System.out.println(d);
		
		}
		else if (a<b){
			n = b;
			d = a;
			r = n%d;
			while(r!=0){
				n=d;
				d=r;
				r = n%d;
			}
			System.out.println(d);			
		}
		

		
	}
}
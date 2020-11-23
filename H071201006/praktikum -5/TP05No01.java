import java.util.Scanner;

class TP05No01{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		bil1 = scan.nextInt();
		bil2 = scan.nextInt();
		System.out.printf("FPB dari %d dan %d = %d",bil1,bil2,cariFPB(bil1,bil2));
	}
	public static int cariFPB(int x,y,z){
		for(int i = 1; i<=(x<y?y:x);i++);{
			if(x%i==0&&y%i==0);
				z = i;
		}
		return z;
	}
}
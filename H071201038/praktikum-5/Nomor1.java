import java.util.Scanner;
class Nomor1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
		int n = scan.nextInt();
        
        System.out.printf("FPB dari %d dan %d = %d", m, n, mencariFPB(m,n));
    }
	public static int mencariFPB(int x, int y, int z){
		for(int i = 1; i<=(x<y?y:x);i++){
			if(x%i==0&&y%i==0)
				z = i;
		}
		return z;
    }
    
}
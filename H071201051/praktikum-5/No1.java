import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 2 Nilai Integer:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int gcd = 1;
        int c = fpb(a, b, gcd);
        System.out.println("FPB dari " + a + " dan " + b + " adalah = " + c);
        scan.close();
    }
    static int fpb(int a, int b, int gcd) {
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;                    
            }
        }
        return gcd;
    }
}
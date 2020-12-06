import java.util.Scanner;
public class Putri1{
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int x = p.nextInt();
        int y = p.nextInt();
        if (x < y) {
            for (; x <= y; x++) {
                System.out.print(x);
                if(x % 2 == 0) System.out.print(" genap "); else System.out.print(" ganjil ");
                if(x < 0) System.out.println(" negatif"); else System.out.println(" positif");
            }
        }
        else {
            for (; x >= y; x--) {
                System.out.print(x);
                if(x % 2 == 0) System.out.print(" genap "); else System.out.print(" ganjil ");
                if(x < 0) System.out.println(" negatif"); else System.out.println(" positif");
            }
        }
    }
    
}
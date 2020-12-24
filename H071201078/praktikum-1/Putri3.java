import java.util.Scanner;
public class Putri3 {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int himpunanA = t.nextInt();
        int a = 0;
        int b = 1;
        int next = 0;
        System.out.print(a);
        System.out.printf(" " + b);
        for (int count = 2; count<himpunanA; count++){
            next = a+b;
            System.out.printf(" " + next);
            a = b;
            b =next;
        }
    }
    
}

import java.util.Scanner;
public class Nomor3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input nilai elemen ke-n :");
        int n = inp.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.printf("%d %d", num1, num2 );
        int i;
        
        for (i = 3; i <= n; i++) {
            int next = num1 + num2;
            System.out.printf(" %d", next);
            num1 = num2;
            num2 = next;
            inp.close();
        }
    }
}

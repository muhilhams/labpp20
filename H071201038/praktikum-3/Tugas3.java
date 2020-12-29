import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n, A=0, b=1, next;
        n = obj.nextInt();

        System.out.print(A+" "+b);
        for(int count = 2; count<n; count++){
            next = A+b;
            System.out.print(" "+next);
            A = b;
            b = next;
        }
        
    }
}

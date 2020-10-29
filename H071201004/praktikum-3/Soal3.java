import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner cx = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int next;
        int n = cx.nextInt();
        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++){
            next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        cx.close();
    }
}

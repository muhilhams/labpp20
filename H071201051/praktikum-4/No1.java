import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input nilai N:");
        int n = scan.nextInt();
        int[] a = new int[n];
        int sum = 1;
        System.out.println("Input elemennya:");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 1; k <= Math.min(a[i], a[j]); k++) {
                if (a[i] % k == 0 && a[j] % k == 0) {
                    sum = k;
                }
            } if (sum == 1) {
                System.out.println(a[i] + " " + a[j]);
                } 
            }
        }
        scan.close();
    }
}


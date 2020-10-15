import java.util.Scanner;
    public class No2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            int j = a / 3600;
            int m = ( a % 3600) / 60;
            int d = a % 60;

            System.out.printf("%02d:%02d:%02d", j, m, d);
            
        }
    }
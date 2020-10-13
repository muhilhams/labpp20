import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double h = in.nextDouble();
        double a = in.nextDouble();
        double b = in.nextDouble();
        

        double sudut1 = Math.tan(Math.toRadians(a))*(double)h;
        double sudut2 = Math.tan(Math.toRadians(b))*(double)h;
        double panjang = sudut1-sudut2;

        System.out.printf("%.1f meter",panjang);
    }
}
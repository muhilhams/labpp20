import java.util.Scanner;

class nomor1 {
public static void main(String[] args) {
    Scanner user = new Scanner (System.in);
    System.out.println("Input Time");
    int t = user.nextInt();
    System.out.println("Input Speed");
    int s = user.nextInt();
    double d =t*s;
    double f = d / 14.0;

    System.out.printf("Input liter of fuel : %.3f", f);
    System.out.println(" L");



    }

}

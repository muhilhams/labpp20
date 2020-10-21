import java.util.Scanner;
public class Praktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        int v = input.nextInt();

        int e = 14;
        float jB = (float)(v*t)/e;
        System.out.printf("jB = %.3f", jB);
        System.out.println("L");

    }
}
import java.util.Scanner;
public class Soal01 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Time;
        Time = input.nextFloat();
        float Velocity;
        Velocity = input.nextFloat();
        float Bensin = (Time * Velocity) / 14.0f;
        System.out.printf("Bensin Yang Digunakan : " + "%.3f L", Bensin);
    }
}
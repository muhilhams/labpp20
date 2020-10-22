import java.util.Scanner;
public class Soal02 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int second;
        System.out.println("Masukkan second:");
        second = input.nextInt();
        int minute;
        int hour;
        hour = second / (60 * 60);
        second = second - ((60 * 60) * hour);
        minute = second / 60;
        second = second - (60* minute);
        
        System.out.printf("%d:%d:%d", hour, minute, second);
    }
}
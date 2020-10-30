package tugas1;
import java.util.Scanner;

public class Ptrzky1 {

    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        double j = 10;
        double k = 85;
        double jam = ((j*k)/14) ;
        float s= 8;
        float t = 10;
        double kecepatan = ((s*t)/14);
        System.out.printf("bensin = "+" %.3f L%n", jam);
        System.out.printf("bensin = "+" %.3f L", kecepatan);
        

    }
}

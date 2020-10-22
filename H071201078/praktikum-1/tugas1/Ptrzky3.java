package tugas1;
import java.util.Scanner;
public class Ptrzky3 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        double h=  input.nextDouble();
        double a = input.nextDouble();
        double b = input.nextDouble();

        double panjangT = Math.tan(Math.toRadians(a))*h;  
        double panjangS = Math.tan(Math.toRadians(b))*h;
        double panjangK = panjangT - panjangS;
        System.out.printf("%.1f m", panjangK);
        input.close();
    }
    
}

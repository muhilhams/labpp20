import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
       
       
        int secon = 140153;

        System.out.printf("%02d:",secon/3600);
        secon = secon % 3600;
        
        System.out.printf("%02d:",secon/60);
        secon = secon % 60;
        
        System.out.printf("%02d \n",secon);
    }
}

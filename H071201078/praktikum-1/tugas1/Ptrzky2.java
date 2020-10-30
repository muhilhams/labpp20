package tugas1;
import java.util.Scanner;

public class Ptrzky2 {
    public static void main (String [] args){
        Scanner i =new Scanner (System.in);
        int j = i.nextInt();
        int w = 3600;
        int jam = j/w;
        int menit = (j%w)/60;
        int detik = j%60;
        System.out.println( jam +":" + menit + ":" + detik );

    }
    
}

import java.util.Scanner;

public class  Tugas1 {
    
    public static void main(String[] args) {
        int K, N;
        float persentase;

        Scanner o = new Scanner(System.in);

        System.out.println("Masukkan Kehadiran = ");
        K = o.nextInt();

        System.out.println("Masukkan Banyaknya Pertemuan");
        N = o.nextInt();

        persentase = (float) K/N*100;
        
        System.out.println("Persentase Kehadiran =" +persentase+ "%");



       
       

    }


 } 
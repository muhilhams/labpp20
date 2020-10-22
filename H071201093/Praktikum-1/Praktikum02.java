import java.util.Scanner;

public class Praktikum02 {
    
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       
       int detik, menit, jam, sisax, sisay;

       System.out.println("Masukkan angka detik: ");
       detik = x.nextInt();
       jam = detik/3600;
       sisax = detik % 3600;

       menit= (int) sisax / 60;
       sisay= sisax % 60;
       
       System.out.printf("%02d:%02d:%02d", jam,menit,sisay);
    }
}

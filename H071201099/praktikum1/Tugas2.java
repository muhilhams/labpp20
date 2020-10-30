import java.util.Scanner;


public class  Tugas2 {
    

    public static void main(String[] args) {
       
       
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan angka: ");
        int detik = in.nextInt();
        System.out.println(detik/3600);
        detik = detik % 3600;

        System.out.println(detik/60);
        detik = detik % 60;
        
        System.out.println(detik);
    }

}

        
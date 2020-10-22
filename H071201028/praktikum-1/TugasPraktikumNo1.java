import java.util.Scanner;

public class TugasPraktikumNo1 {
    public static void main (String[] args) { 
        
        //efiensi bensin 14Km/Liter
        Scanner kmh = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Masukkan Waktu Perjalanan (dalam Jam): ");
        double waktu = kmh.nextDouble();
        System.out.println("Masukkan Kecepatan Perjalanan : ");
        double kecepatan = kmh.nextDouble();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        double bensin = (kecepatan * waktu)/14;     //Rumus efisiensi : efisiensi = jarak/bensin, bensin = jarak/efisiensi.
                                                    //Jarak = kecepatan * waktu, maka bensin = (kecepatan * waktu)/efisiensi.

        System.out.printf("Total Bensin yang Digunakan : %.3f liter", bensin);



    }
}
import java.util.Scanner;
public class Tugas3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**Menu** :\n 1. Mencari Luas Bangun Datar \n 2. Mencari Volume Bangun Ruang");
        System.out.println("Masukkan Pilihan :");
        int pilih = input.nextInt();
        System.out.println("................");
        switch (pilih){
            case 1:
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
        break;
            case 2:
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Bola");
        }
        System.out.println("Masukkan Pilihan :");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1: 
            System.out.println("Input sisi");
            int sisi = input.nextInt();
            double luasPersegi = sisi*sisi;
            System.out.println("Luas persegi : " +luasPersegi);
        break;
            case 2:
            System.out.println("Input panjang");
            int panjang = input.nextInt();
            System.out.println("Input lebar");
            int lebar = input.nextInt();
            double luasPersegiPanjang = panjang*lebar;
            System.out.println("Luas persegi panjang : " +luasPersegiPanjang);
        break;
            case 3:
            System.out.println("Input alas");
            int alas = input.nextInt();
            System.out.println("Input tinggi");
            int tinggi = input.nextInt();
            double luasSegitiga = 0.5*alas*tinggi;
            System.out.println("Luas segitiga : " +luasSegitiga);
        break;
            case 4:
            int r;
            double luas, phi = 3.14;
            System.out.println("Input jari-jari");
            r = input.nextInt();
            double luasLingkaran = phi*r*r;
            System.out.println("Luas lingkaran :" +luasLingkaran);
        }
        switch (pilihan) {
            case 1:
            System.out.println("Input sisi");
            int s = input.nextInt();
            double volumeKubus = s*s*s;
            System.out.println("volume kubus : " +volumeKubus);
        break;
            case 2:
            System.out.println("Input panjang");
            int p = input.nextInt();
            System.out.println("Input luas");
            int l = input.nextInt();
            System.out.println("Input tinggi");
            int t = input.nextInt();
            double volumeBalok = p*l*t;
            System.out.println("volume balok : "+ volumeBalok);
        break;
            case 3:
            System.out.println("Input alas");
            int a = input.nextInt();
            System.out.println("Input tinggi");
            int Tinggi = input.nextInt();
            double volumeTabung = a*Tinggi;
            System.out.println("volume tabung : " +volumeTabung);
        break;
            case 4:
            System.out.println("Input jari-jari");
            int R = input.nextInt();
            double pi = input.nextInt();
            double volumeBola = 4/3*pi*R*R*R;
            System.out.println("volume bola : " +volumeBola);
        }

        
    }
}
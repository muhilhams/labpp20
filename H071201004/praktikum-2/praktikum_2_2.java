import java.util.Scanner;

public class praktikum_2_2 {
    public static void main(String[] args) {
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang\n");
        Scanner ax = new Scanner(System.in);
        System.out.println("Input angka sesuai dengan menu yang diinginkan :");
        int choice = ax.nextInt();

        if (choice == 1){
            System.out.println("** Pilih Bangun Datar **");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran\n");
            System.out.println("Input bangun datar sesuai nomor yang diinginkan");
            int first = ax.nextInt();
            switch (first){
                case 1:
                    System.out.println("Input Panjang Sisi");
                    int sisi = ax.nextInt();
                    System.out.println("\nLuas Persegi = " + sisi * sisi);
                    break;
                case 2:
                    System.out.println("Input Panjang"); int panjang = ax.nextInt();
                    System.out.println("Input Lebar"); int lebar = ax.nextInt();
                    System.out.println("\nLuas Persegi Panjang = " + panjang * lebar);
                    break;
                case 3:
                    System.out.println("Input Alas"); int alas = ax.nextInt();
                    System.out.println("Input Tinggi"); int tinggi = ax.nextInt();
                    System.out.println("\nLuas Segitiga = " + (1/2 * alas * tinggi));
                    break;
                default:
                    if (first == 4){
                        System.out.println("Input Jari-jari"); 
                        double r = ax.nextInt();
                        double luasLingkaran = (double) 1/2 * 3.14 * Math.pow(r, 2);
                        System.out.printf("\nLuas Lingkaran = %.2f", luasLingkaran);
                    } else
                        System.out.println("\nTIDAK ADA DI PILIHAN");
                    break;
            }
        }
        if (choice == 2){
            System.out.println("** Pilih Bangun Ruang **");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Limas Segitiga");
            System.out.println("4. Bola");
            System.out.println("\nInput bangun ruang sesuai nomor yang diinginkan");
            int second = ax.nextInt();
            switch (second){
                case 1:
                    System.out.println("Input Panjang Sisi");
                    int sisi2 = ax.nextInt();
                    System.out.println("\nVolume Kubus = "+ sisi2 * sisi2 * sisi2);
                    break;
                case 2:
                    System.out.println("Input Panjang"); int panjang2 = ax.nextInt();
                    System.out.println("Input Lebar"); int lebar2 = ax.nextInt();
                    System.out.println("Input Tinggi"); int tinggi2 = ax.nextInt();
                    System.out.println("\nVolume Balok = " + (panjang2 * lebar2 * tinggi2));
                    break;
                case 3:
                    System.out.println("Input Luas Alas"); int luasAlas = ax.nextInt();
                    System.out.println("Input Tinggi"); int tinggi3 = ax.nextInt();
                    System.out.println("\nVolume Limas Segitiga = " + (1/3 * luasAlas * tinggi3));
                    break;
                default:
                    if (second == 4){
                        System.out.println("Input Jari-Jari"); double jarijari = ax.nextInt();
                        double volumeBola = (double) 4/3 * 3.14 * Math.pow(jarijari, 3);
                        System.out.printf("\nVolume Bola = %.2f", volumeBola );
                    } else
                        System.out.println("\nTIDAK ADA DI PILIHAN");
                    break;
            }
        ax.close();
        }
    }
}
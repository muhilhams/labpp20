<<<<<<< HEAD
import java.util.Scanner;
public class Nomor2 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("** MENU **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("");
        System.out.println("Input Angka Sesuai Dengan Menu Yang Diinginkan :");
        int c = num.nextInt();
        System.out.println("");
            if (c == 1) {
                System.out.println("** Pilih Bangun Datar **");
                System.out.printf("1.Persegi\n2.Persegi Panjang\n3.Segitiga\n4.Lingkaran\n");
                System.out.println("");
                System.out.println("Input Angka Sesuai Dengan Bangun Datar Yang Diinginkan :");
                int bd = num.nextInt();
                System.out.println("");
                if (bd == 1) {
                    System.out.println("Input Sisi Persegi");
                    double s = num.nextDouble();
                    double luasp = s*s;
                    System.out.printf("Luas Persegi = %.1f", luasp);
                } else if (bd == 2) {
                    System.out.println("Input Panjang");
                    double p = num.nextDouble();
                    System.out.println("Input Lebar");
                    double l = num.nextDouble();
                    double luaspp = (p*l);
                    System.out.printf("Luas persegi panjang = %.1f", luaspp);
                } else if (bd == 3) {
                    System.out.println("Input Alas");
                    double a = num.nextDouble();
                    System.out.println("Input Tinggi");
                    double t = num.nextDouble();
                    double luassgt = ((a*t)/2);
                    System.out.printf("Luas Segitiga = %.1f", luassgt);
                } else if (bd ==4) {
                    System.out.println("Input jari-jari lingkaran");
                    double r = num.nextDouble();
                    double luasl = ((Math.PI)*r*r);
                    System.out.printf("Luas Lingkaran = %.1f", luasl);
                } else {
                    System.out.println("Inputan Salah");
                }
            } else if (c == 2) {
                System.out.println("** Pilih Bangun Ruang **");
                System.out.printf("1.Kubus\n2.Balok\n3.Kerucut\n4.Bola\n");
                System.out.println(" ");
                System.out.println("Input Angka Sesuai Dengan Bangun Ruang Yang Diinginkan :");
                int br = num.nextInt();
                System.out.println("");
                if (br == 1) {
                    System.out.println("Input Sisi Kubus");
                    double sk = num.nextDouble();
                    double vk = Math.pow(sk, 3);
                    System.out.printf("Volume Persegi = %.1f", vk);
                } else if (br == 2) {
                    System.out.println("Input Panjang");
                    double pb = num.nextDouble();
                    System.out.println("Input Lebar");
                    double lb = num.nextDouble();
                    System.out.println("Input Tinggi");
                    double tb = num.nextDouble();
                    double vb = pb*lb*tb;
                    System.out.printf("Volume Balok = %.1f", vb);
                } else if (br == 3) {
                    System.out.println("Input Tinggi");
                    double tk = num.nextDouble();
                    System.out.println("Input Jari-Jari Lingkaran Alas");
                    double rk = num.nextDouble();
                    double vkc = ((Math.PI*tk*rk*tk)/3);
                    System.out.printf("Volume Kerucut = %.1f" ,vkc);
                } else if (br == 4) {
                    System.out.println("Input Jari-Jari Bola");
                    double rb = num.nextDouble();
                    double vb = ((4*(Math.PI)*(Math.pow(rb, 3)))/3);
                    System.out.printf("Volume Bola = %.1f", vb);
                } else {
                    System.out.println("Inputan Salah");
                }
            } else {
                System.out.println("Inputan Salah");
            }
    } 
}
=======
import java.util.Scanner;
public class Nomor2 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("** MENU **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("");
        System.out.println("Input Angka Sesuai Dengan Menu Yang Diinginkan :");
        int c = num.nextInt();
        System.out.println("");
            if (c == 1) {
                System.out.println("** Pilih Bangun Datar **");
                System.out.printf("1.Persegi\n2.Persegi Panjang\n3.Segitiga\n4.Lingkaran\n");
                System.out.println("");
                System.out.println("Input Angka Sesuai Dengan Bangun Datar Yang Diinginkan :");
                int bd = num.nextInt();
                System.out.println("");
                if (bd == 1) {
                    System.out.println("Input Sisi Persegi");
                    double s = num.nextDouble();
                    double luasp = s*s;
                    System.out.printf("Luas Persegi = %.1f", luasp);
                } else if (bd == 2) {
                    System.out.println("Input Panjang");
                    double p = num.nextDouble();
                    System.out.println("Input Lebar");
                    double l = num.nextDouble();
                    double luaspp = (p*l);
                    System.out.printf("Luas persegi panjang = %.1f", luaspp);
                } else if (bd == 3) {
                    System.out.println("Input Alas");
                    double a = num.nextDouble();
                    System.out.println("Input Tinggi");
                    double t = num.nextDouble();
                    double luassgt = ((a*t)/2);
                    System.out.printf("Luas Segitiga = %.1f", luassgt);
                } else if (bd ==4) {
                    System.out.println("Input jari-jari lingkaran");
                    double r = num.nextDouble();
                    double luasl = ((Math.PI)*r*r);
                    System.out.printf("Luas Lingkaran = %.1f", luasl);
                } else {
                    System.out.println("Inputan Salah");
                }
            } else if (c == 2) {
                System.out.println("** Pilih Bangun Ruang **");
                System.out.printf("1.Kubus\n2.Balok\n3.Kerucut\n4.Bola\n");
                System.out.println(" ");
                System.out.println("Input Angka Sesuai Dengan Bangun Ruang Yang Diinginkan :");
                int br = num.nextInt();
                System.out.println("");
                if (br == 1) {
                    System.out.println("Input Sisi Kubus");
                    double sk = num.nextDouble();
                    double vk = Math.pow(sk, 3);
                    System.out.printf("Volume Persegi = %.1f", vk);
                } else if (br == 2) {
                    System.out.println("Input Panjang");
                    double pb = num.nextDouble();
                    System.out.println("Input Lebar");
                    double lb = num.nextDouble();
                    System.out.println("Input Tinggi");
                    double tb = num.nextDouble();
                    double vb = pb*lb*tb;
                    System.out.printf("Volume Balok = %.1f", vb);
                } else if (br == 3) {
                    System.out.println("Input Tinggi");
                    double tk = num.nextDouble();
                    System.out.println("Input Jari-Jari Lingkaran Alas");
                    double rk = num.nextDouble();
                    double vkc = ((Math.PI*tk*rk*tk)/3);
                    System.out.printf("Volume Kerucut = %.1f" ,vkc);
                } else if (br == 4) {
                    System.out.println("Input Jari-Jari Bola");
                    double rb = num.nextDouble();
                    double vb = ((4*(Math.PI)*(Math.pow(rb, 3)))/3);
                    System.out.printf("Volume Bola = %.1f", vb);
                } else {
                    System.out.println("Inputan Salah");
                }
            } else {
                System.out.println("Inputan Salah");
            }
    } 
}
>>>>>>> b30e41d883900455aa2c350e3fd85a310a243334

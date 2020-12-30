import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // menghitung Luas bangun datar, Volume bangun ruang
        System.out.println("** Menu **");
        System.out.println("1. Mecari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("");
        System.out.println("Input angka sesuai dengan Menu yang diinginkan :");

        int k= read.nextInt();
        System.out.println("");

        if(k == 1) {
            System.out.println("** Pilih Bangun Datar **");
            System.out.printf(" 1. Persegi\n 2. Persegi Panjang\n 3. Lingkaran\n 4. Segitiga\n\n");
            System.out.println("Input angka sesui dengan nomor bangun datar yang diinginkan :");
            
            int ka= read.nextInt();
            System.out.println("");

            if(ka == 1) {
                System.out.println("Input Panjang");
                double pp= read.nextDouble();
                System.out.println("Input Lebar");
                double ll= read.nextDouble();
                double luasp= pp * ll;
                System.out.printf("Luas persegi panjang = %.1f", luasp);

            }else if (ka == 2) {
                System.out.println("Input Panjang");
                double pa= read.nextDouble();
                System.out.println("Input Lebar");
                double la= read.nextDouble();
                double luasa= pa * la;
                System.out.printf("Luas Persegi Panjang = %.1f", luasa);
            
            }else if (ka == 3) {
                System.out.println("Input jari-jari lingkaran");
                double r= read.nextDouble();
                double luas= (Math.PI*r *r);
                System.out.printf("Luas lingkaran = %.1f", luas);

            }else if (ka == 4) {
                System.out.println("Input alas");
                double a= read.nextDouble();
                System.out.println("Input tinggi");
                double t= read.nextDouble();
                double luasc= (a * t) / 2;
                System.out.printf("Luas Segitiga = %.1f", luasc);

            }else {
                System.out.println("Inputan salah");
                
            }
        }else if (k == 2){
            System.out.println("** Pilih Bangun Ruang **");
            System.out.printf(" 1. Kubus\n 2. Bola\n 3. Kerucut\n 4. Balok\n\n");
            System.out.println("Input Angka Sesuai Dengan Bangun Ruang Yang Diinginkan :");
            
            int kl = read.nextInt();
            System.out.println("");
            if (kl == 1){
                System.out.println("Masukkan sisi");
                double s= read.nextDouble();
                double v= Math.pow(s, 4);
                System.out.printf("Volume persegi = %.1f", v);

            }else if (kl == 2){
                System.out.println("Masukkan jari-jari Bola");
                double rr= read.nextDouble();
                double va= (4*(Math.PI) * (Math.pow(rr, 3))) / 3;
                System.out.printf("Volume Bola = %.1f", va);

            }else if (kl == 3){
                System.out.println("Masukan tinggi");
                double ta= read.nextDouble();
                System.out.println("Masukkan jari-jari lingkaran alas");
                double rb= read.nextDouble();
                double vz= (Math.PI*rb*rb*ta) / 3;
                System.out.printf("Volume kerucut = %1.f", vz);
                
            }else if (kl == 4) {
                System.out.println("Masukkan tinggi");
                double ti= read.nextDouble();
                System.out.println("Masukkan panjang");
                double pl= read.nextDouble();
                System.out.println("Masukkan lebar");
                double li= read.nextDouble();
                double vn= pl * li * ti;
                System.out.printf("Volume balok = %.1f", vn);

            }else {
                System.out.println("Inputan salah");
            }
        }else {
            System.out.println("Inputan salah");       
    }
    read.close();
    }
}
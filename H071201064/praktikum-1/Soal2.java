import java.util.Scanner;
class Soal2 {
    public static void main(String [] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan Total detik=");
        int detik = x.nextInt();
        int jam_a = detik/3600; 
        int jam_A = detik%3600;
        int menit = jam_A/60;
        int menit_A = detik%60;
        int detik_A = menit_A;
        System.out.printf("%d : %02d : %d", jam_a,menit,detik_A);
    }
}
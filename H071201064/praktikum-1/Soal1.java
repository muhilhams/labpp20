import java.util.Scanner;
class Soal1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan Total Waktu=");
        int t = x.nextInt();
        System.out.print("Masukkan Total Kecepatan=");
        int v = x.nextInt();
        System.out.print("Masukkan Total Efesiensi=");
        int e = x.nextInt();
        float JB = ((float)t*v/(float)e);
        System.out.printf("JB = %.3f", JB);
        System.out.print("L");
        

    }
}

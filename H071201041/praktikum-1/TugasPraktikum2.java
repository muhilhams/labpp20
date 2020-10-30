import java.util.Scanner;
public class TugasPraktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah detik");
        int jumlahDetik = input.nextInt();
        int jam = jumlahDetik/3600;
        int menit = (jumlahDetik%3600)/60;
        int detik = jumlahDetik-(jam*3600+menit*60);
        System.out.printf("%d:%02d:%02d", jam,menit,detik);
    }
    
}

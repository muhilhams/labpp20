import java.util.Scanner;
public class Tugas5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
            float M = scan.nextFloat();
            int jam = 0, menit = 0, detik = 0;
            int derajat = (int) (M * 240);

            if (M >= 0 && M < 360) {
                while (derajat > 0) {
                    if (derajat - 3600 >= 0) {
                        derajat -= 3600;
                        jam++;
                    } else if (derajat - 60 >= 0) {
                        derajat -= 60;
                        menit++;
                    } else {
                        derajat -= 1;
                        detik++;
                    }
                }jam += 6;


                if (jam > 24)
                    jam -= 24;


                if (jam <= 10) {
                    System.out.println("selamat pagi");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else if (jam <= 2) {
                    System.out.println("selamat siang");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else if (jam <= 6) {
                    System.out.println("selamat sore");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else {
                    System.out.println("selamat malam");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                }
            } else
                System.out.println("harap masukkan 0<=nilai<360");
    }
}

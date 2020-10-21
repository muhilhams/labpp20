import java.util.Scanner;

class praktikum_1_2 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        System.out.println("Masukkan detik:");
        int detik = ax.nextInt();           
        int dd = detik % 60;                        //jj = jam
        int mm = (detik / 60) % 60;                 //mm = menit
        int jj = detik / (60 * 60);                   //dd = detik

        System.out.printf("%02d:%02d:%02d", jj, mm, dd);  
    }
}
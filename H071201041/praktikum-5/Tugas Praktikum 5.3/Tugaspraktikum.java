import java.util.Scanner;
public class Tugaspraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah hari");
        int hari = input.nextInt();
        myDay(hari);
    }

    public static void myDay(int a) {
        System.out.println(a/365 +" tahun");
        a%=365;
        System.out.println(a/30 +" bulan");
        a%=30;
        System.out.println(a+" hari");
    }
}

import java.util.Scanner;
public class No3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Usia Dalam Jumlah Hari:");
        int usia = scan.nextInt();
        myDay(usia);
        scan.close();
    }
    public static void myDay(int usia) {
        int tahun = usia / 365;
        int bulan = (usia % 365) / 30;
        int hari = ((usia % 365) % 30);
        
        System.out.println(tahun + " tahun");
        System.out.println(bulan + " bulan");
        System.out.println(hari + " hari");
    }

    
}

import java.util.Scanner;
class Tp03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
         int usia = read.nextInt();
         myDay(usia);
  }
    public static void myDay(int usiaHari){
        int tahun = usiaHari / 365;
        System.out.println(tahun + " tahun");
        int bulan = (usiaHari % 365) / 30;
        System.out.println(bulan + " bulan");
        int hari = (usiaHari % 365) % 30;
        System.out.println(hari + " hari");
    }
}
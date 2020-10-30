import java.util.Scanner;
public class Nomor4 {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("Masukkan harga barang :");
        try {
        int harga = money.nextInt();
        System.out.println("Masukkan nilai uang yang dibayarkan :");
        int uang = money.nextInt();
        
        if (uang == harga) {
            System.out.println("Tidak ada kembalian");
        } else if (uang >= harga) {
            int kembalian = uang - harga;
            int uang100rb = kembalian/100000; 
            System.out.println(uang100rb + " uang Rp. 100.000");
            int uang50rb = (kembalian % 100000)/50000; 
            System.out.println(uang50rb + " uang Rp. 50.000");
            int uang20rb = (kembalian - (100000*uang100rb + 50000*uang50rb))/20000; 
            System.out.println(uang20rb + " uang Rp. 20.000");
            int uang10rb = (kembalian - (100000*uang100rb + 50000*uang50rb + 20000*uang20rb))/10000;
            System.out.println(uang10rb + " uang Rp. 10.000");
            int uang5rb = (kembalian - (100000*uang100rb + 50000*uang50rb + 20000*uang20rb + 10000*uang10rb))/5000;
            System.out.println(uang5rb + " uang Rp. 5.000");
            int uang2rb = (kembalian - (100000*uang100rb + 50000*uang50rb + 20000*uang20rb + 10000*uang10rb + 5000*uang5rb))/2000;
            System.out.println(uang2rb + " uang Rp. 2.000");
            int uang1rb = (kembalian - (100000*uang100rb + 50000*uang50rb + 20000*uang20rb + 10000*uang10rb + 5000*uang5rb + 2000*uang2rb))/1000;
            System.out.println(uang1rb + " uang Rp. 1.000");
        } else {
            System.out.println("Uang kamu tidak cukup"); 
        } 
            } catch (Exception e) {
                System.out.println("Masukkan nominal angka!");
            } money.close(); 
    }
}

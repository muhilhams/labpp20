import java.util.Scanner;
public class Tugaspraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan harga barang");
        long harga = input.nextLong();
        System.out.println("Masukkan uang yanng akan dibayarkan");
        long uang = input.nextLong();
        while ( uang >= harga){
            long kembalian = uang-harga;
            long uangSeratus = kembalian/100000; 
            System.out.println(uangSeratus+" uang Rp. 100.000");
            long uangLimapuluh = (kembalian%100000)/50000; 
            System.out.println(uangLimapuluh+" uang Rp. 50.000");
            long uangDuapuluh = (kembalian-(100000*uangSeratus+50000*uangLimapuluh))/20000; 
            System.out.println(uangDuapuluh+" uang Rp. 20.000");
            long uangSepuluh = (kembalian-(100000*uangSeratus+50000*uangLimapuluh+20000*uangDuapuluh))/10000;
            System.out.println(uangSepuluh+" uang Rp. 10.000");
            long uangLima = (kembalian-(100000*uangSeratus+50000*uangLimapuluh+20000*uangDuapuluh+10000*uangSepuluh))/5000;
            System.out.println(uangLima+" uang Rp. 5.000");
            long uangDua = (kembalian-(100000*uangSeratus+50000*uangLimapuluh+20000*uangDuapuluh+10000*uangSepuluh+5000*uangLima))/2000;
            System.out.println(uangDua+" uang Rp. 2.000");
            long uangSatu = (kembalian-(100000*uangSeratus+50000*uangLimapuluh+20000*uangDuapuluh+10000*uangSepuluh+5000*uangLima+2000*uangDua))/1000;
            System.out.println(uangSatu+" uang Rp. 1.000");
            break;
        }
        while ( uang < harga){
            System.out.println("Uang kamu belum cukup");
            break;
        }
    }
}

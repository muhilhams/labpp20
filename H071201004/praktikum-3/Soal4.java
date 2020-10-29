import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner dx = new Scanner(System.in);
        int barang = dx.nextInt();
        int uang = dx.nextInt();
        int seratus=0, limaPuluh=0, duaPuluh=0, sepuluh=0, limaRibu=0, duaRibu=0, seribu=0;
        
        if (barang < uang){
            int kembalian = uang - barang;
            while (kembalian > 0){
                if (kembalian - 100000 >= 0){
                    kembalian -= 100000;
                    seratus++;
                } else if (kembalian - 50000 >= 0){
                    kembalian -= 50000;
                    limaPuluh++;
                } else if (kembalian - 20000 >= 0){
                    kembalian -= 20000;
                    duaPuluh++;
                } else if (kembalian - 10000 >= 0){
                    kembalian -= 10000;
                    sepuluh++;
                } else if (kembalian - 5000 >= 0){
                    kembalian -= 5000;
                    limaRibu++;
                } else if (kembalian - 2000 >= 0){
                    kembalian -= 2000;
                    duaRibu++;
                } else {
                    kembalian -= 1000;
                    if (kembalian == 0)
                        seribu++;
                }
            }
            System.out.println(seratus + " uang Rp. 100.000");
            System.out.println(limaPuluh + " uang Rp. 50.000");
            System.out.println(duaPuluh + " uang Rp. 20.000");
            System.out.println(sepuluh + " uang Rp. 10.000");
            System.out.println(limaRibu + " uang Rp. 5.000");
            System.out.println(duaRibu + " uang Rp. 2.000");
            System.out.println(seribu + " uang Rp. 1.000");
        } else if (barang == uang){
            System.out.println("uang anda pas");
        } else {
            System.out.println("uang anda tidak cukup");
        }
        dx.close();
    }
}

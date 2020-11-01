//Nama:Siskanti
//Nim:H071201064
import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.print("harga barang=");
        int hargaBarang = user.nextInt();
        System.out.print("jumlah uang=");
        int jumlahUang = user.nextInt();
        //ju=jumlah uang
        int ju100=0;
        int ju50=0;
        int ju20=0;
        int ju10=0;
        int ju5=0;
        int ju2=0;
        int ju1=0;
        int sisaUang=jumlahUang - hargaBarang;


        while (sisaUang >= 1000){
            if (sisaUang >=100000){
                sisaUang -= 100000;
            ju100++;
            }
            else if (sisaUang >= 50000){
                sisaUang -= 50000;
                ju50++;
            } 
            else if (sisaUang >= 20000){
                sisaUang -= 20000;
                ju20++;
            }
            else if (sisaUang >= 10000){
                sisaUang -=10000;
                ju10++;
            }
            else if (sisaUang >= 5000){
                sisaUang -= 5000;
                ju5++;
            }
            else if (sisaUang >= 2000){
                sisaUang -= 2000;
                ju2++;
            }
            else if (sisaUang >= 1000) {
                sisaUang-= 1000;
                ju1++;
            }


        } 
        System.out.printf("%d uang Rp 100.000\n", ju100);
        System.out.printf("%d uang Rp 50.000\n", ju50);
        System.out.printf("%d uang Rp 20.0000\n", ju20);
        System.out.printf("%d uang Rp 10.000\n",ju10);
        System.out.printf("%d uang Rp 5.000\n", ju5);
        System.out.printf("%d uang Rp 2.000\n", ju2);
        System.out.printf("%d uang Rp 1.000\n", ju1);




    }
}

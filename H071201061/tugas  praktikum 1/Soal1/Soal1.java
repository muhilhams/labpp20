import java.util.Scanner;
public class Soal1 {
    

    public static void main(String[] args) {

        Scanner cetak = new Scanner(System.in);

        int jam = cetak.nextInt();
        int kecepatanRataRata = cetak.nextInt();
        int jarakyangditempuh = ( jam *  kecepatanratarata);
        
        float jumlahbensinyangdipakai = (jarakyangditempuh / 14);

      
        System.out.printf("jumlah bensin yang dipakai = "+"%.3f" ,    jumlahbensinyangdipakai  ) ;
        System.out.print(" L");


    
               
    }

}

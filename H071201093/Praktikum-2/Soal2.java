import java.util.InputMismatchException;
import java.util.Scanner;

class Soal2 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");

        try {
            int a, b, c, d, e;
            a= x.nextInt();
            b= x.nextInt();
            c= x.nextInt();
            d= x.nextInt();
            e= x.nextInt();

        int jumlahgenapA= 0;
        int jumlahgenapB= 0;
        int jumlahgenapC= 0;
        int jumlahgenapD= 0;
        int jumlahgenapE= 0;

        int jumlahganjilA= 0;
        int jumlahganjilB= 0;
        int jumlahganjilC= 0;
        int jumlahganjilD= 0;
        int jumlahganjilE= 0;

            if (a % 2==0){
                jumlahganjilA= 1;
                jumlahganjilA= 0;
            }else{
                jumlahgenapA= 0;
                jumlahganjilA= 0;
            }

            if (b % 2==0){
                jumlahganjilB= 1;
                jumlahganjilB= 0;
            }else{
                jumlahgenapB= 0;
                jumlahganjilB= 1;
            }

            if (c % 2==0){
                jumlahganjilC= 1;
                jumlahganjilC= 0;
            }else{
                jumlahgenapC= 0;
                jumlahganjilC= 1;
            }
            if(d % 2 == 0){
                jumlahgenapD= 1;
                jumlahganjilD= 0;
            } else{
                jumlahgenapD= 0;
                jumlahganjilD= 1;
            }

            if(e % 2 == 0){
                jumlahgenapE= 1;
                jumlahganjilE= 0;
            } 
            else{
                jumlahgenapE= 0;
                jumlahganjilE= 1;
            }

        int totalgenap = jumlahgenapA + jumlahgenapB + jumlahgenapC + jumlahgenapD + jumlahgenapE;
        int totalganjil = jumlahganjilA + jumlahganjilB + jumlahganjilC + jumlahganjilD + jumlahganjilE;
    
            int jumlahpositifA= 0;
            int jumlahpositifB= 0;
            int jumlahpositifC= 0;
            int jumlahpositifD= 0;
            int jumlahpositifE= 0;
  
            int jumlahnegatifA= 0;
            int jumlahnegatifB= 0;
            int jumlahnegatifC= 0;
            int jumlahnegatifD= 0;
            int jumlahnegatifE= 0;

          if(a > 0) {
            jumlahpositifA= 1;
            jumlahnegatifA= 0;
        } else if(a == 0) {
                jumlahpositifA= 0;
                jumlahnegatifA= 0;
            } else{
                jumlahpositifA= 0;
                jumlahnegatifA= 1;
            }

        if(b > 0) {
            jumlahpositifB= 1;
            jumlahnegatifB= 0;
        } else if(b == 0) {
                jumlahpositifB= 0;
                jumlahnegatifB= 0;
            } else{
                jumlahpositifB= 0;
                jumlahnegatifB= 1;
            }

        if(c > 0) {
            jumlahpositifC= 1;
            jumlahnegatifC= 0;
        } else if(c == 0) {
                jumlahpositifC= 0;
                jumlahnegatifC= 0;
            } else{
                jumlahpositifC= 0;
                jumlahnegatifC= 1;
            }

        if(d > 0) {
            jumlahpositifD= 1;
            jumlahnegatifD= 0;
        } else if(d == 0) {
                jumlahpositifD= 0;
                jumlahnegatifD= 0;
            } else{
                jumlahpositifD= 0;
                jumlahnegatifD= 1;
            }

        if(e > 0){
            jumlahpositifE= 1;
            jumlahnegatifE= 0;
        } else if(e == 0) {
                jumlahpositifE= 0;
                jumlahnegatifE= 0;
            } else{
                jumlahpositifE= 0;
                jumlahnegatifE= 1;
            } 

            int totalpositif = jumlahpositifA + jumlahpositifB + jumlahpositifC + jumlahpositifD + jumlahpositifE;
            int totalnegatif = jumlahnegatifA + jumlahnegatifB + jumlahnegatifC + jumlahnegatifD + jumlahnegatifE;
    
            System.out.println(totalgenap+ " Angka Genap");
            System.out.println(totalganjil+ " Angka Ganjil");
            System.out.println(totalpositif+ " Angka Positif");
            System.out.println(totalnegatif+ " Angka Negatif");
    
        } catch(InputMismatchException ime) {
            System.out.println("Inputan Tidak Valid");    
        } finally {
            x.close();
    }
}
}
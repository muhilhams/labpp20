import java.util.InputMismatchException;
import java.util.Scanner;
public class TugasPraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan 5 macam angka bulat");
        try {
        int angka1; int angka2; int angka3; int angka4; int angka5;
        angka1 = input.nextInt(); angka2 = input.nextInt(); 
        angka3 = input.nextInt(); angka4 = input.nextInt(); angka5 = input.nextInt();
        int jumlahgenap, jumlahganjil, jumlahpositif, jumlahnegatif;
        jumlahgenap = 0; jumlahganjil = 0; jumlahpositif = 0; jumlahnegatif = 0;
            if (angka1%2 ==0 ){
                jumlahgenap++;
                if (angka1 > 0){
                    jumlahpositif = jumlahpositif+1;
                }else if(angka1 < 0){
                    jumlahnegatif++;
                }
            }else{
                jumlahganjil++;
                if (angka1 > 0){
                    jumlahpositif++;
                }else if(angka1 < 0){
                    jumlahnegatif++;
                }
            }
            if (angka2%2 ==0 ){
                jumlahgenap++;
                if (angka2 > 0){
                    jumlahpositif++;
                }else if(angka2 < 0){
                    jumlahnegatif++;
                }
            }else{
                jumlahganjil++;
                if (angka2 > 0){
                    jumlahpositif++;
                }else if(angka2 < 0){
                    jumlahnegatif++;
                }
            }
            if (angka3%2 ==0 ){
                jumlahgenap++;
                if (angka3 > 0){
                    jumlahpositif++;
                }else if(angka3 < 0){
                    jumlahnegatif++;
                }
            }else{
                jumlahganjil++;
                if (angka3 > 0){
                    jumlahpositif++;
                }else if(angka3 < 0){
                    jumlahnegatif++;
                }
            }
            if (angka4%2 ==0 ){
                jumlahgenap++;
                if (angka4 > 0){
                    jumlahpositif++;
                }else if(angka4 < 0){
                    jumlahnegatif++;
                }
            }else{
                jumlahganjil++;
                if (angka4 > 0){
                    jumlahpositif++;
                }else if(angka4 < 0){
                    jumlahnegatif++;
                }
            }
            if (angka5%2 ==0 ){
                jumlahgenap++;
                if (angka5 > 0){
                    jumlahpositif++;
                }else if(angka5 < 0){
                    jumlahnegatif++;
                }
            }else{
                jumlahganjil++;
                if (angka5 > 0){
                    jumlahpositif++;
                }else if(angka5 < 0){
                    jumlahnegatif++;
                }
            }
            System.out.println(jumlahgenap+" Angka Genap");
            System.out.println(jumlahganjil+" Angka Ganjil");
            System.out.println(jumlahpositif+" Angka Positif");
            System.out.println(jumlahnegatif+" Angka Negatif");
        } catch (InputMismatchException e){
            System.out.println("Inputan Tidak Valid");
        }   finally {
            input.close();
        }
    }
}

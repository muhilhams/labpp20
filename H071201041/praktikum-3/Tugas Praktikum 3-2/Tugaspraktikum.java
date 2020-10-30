import java.util.InputMismatchException;
import java.util.Scanner;
public class Tugaspraktikum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah kolom");
        try{
        int kolom = input.nextInt();
        System.out.println("Masukkan angka terakhir");
        int terakhir = input.nextInt();
        int angka;
        int hitung;
            if (terakhir>kolom){
                if (kolom > 0){
                    for (angka = 1, hitung = 1; angka<=terakhir; angka++, hitung++){
                        if ( hitung%kolom == 0){
                            System.out.println(angka+" ");
                        }else {
                            System.out.print(angka+" ");
                        }
                    }
                } else{
                    System.out.println("Kolomnya harus lebih besar dari 0");
                }    
            }else{
                System.out.println("Angka terakhir harus lebih besar dari kolom");
            }
        } catch (InputMismatchException ime){
            System.out.println("Input yang dimasukkan harus bilangan bulat");
        } finally{
            input.close();
        }
    }
}

import java.util.Scanner;
public class Tugaspraktikum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan dua nilai batas");
        int batas1 = input.nextInt();
        int batas2 = input.nextInt();
        int i;
        String keluaran;
        if (batas1 > batas2){
            for (i = batas2; i<=batas1; i++){
                if(i<0){
                    keluaran = (i%2 == 0) ? " genap negatif" : " ganjil negatif" ;
                    System.out.println(i+keluaran);
                }else if(i == 0){
                    System.out.println(i+" nol");
                }else {
                    keluaran = (i%2 == 0) ? " genap positif" : " ganjil positif" ;
                    System.out.println(i+keluaran);
                }
            }
        }else{
            int temp = batas1; 
            batas1 = batas2; 
            batas2 = temp;
            for (i = batas2; i<=batas1; i++){
                if(i<0){
                    keluaran = (i%2 == 0) ? " genap negatif" : " ganjil negatif" ;
                    System.out.println(i+keluaran);
                }else if(i == 0){
                    System.out.println(i+" nol");
                }else {
                    keluaran = (i%2 == 0) ? " genap positif" : " ganjil positif" ;
                    System.out.println(i+keluaran);
                }
            }
        }
    }
}

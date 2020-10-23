import java.util.Scanner;
public class Tugas1{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();
        int d = x.nextInt();
        int e = x.nextInt();

        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;

        //int a
        if (a>0){
            positif++;
        }else{
            negatif++;
        }
        if (a%2==0){
            genap++;
        }else{
            ganjil++;
        }
        // int b
        if (b>0){
            positif++;
        }else{
            negatif++;
        }
        if (b%2==0){
            genap++;
        }else{
            ganjil++;
        }
        // int c
        if (c>0){
            positif++;
        }else{
            negatif++;
        }
        if (c%2==0){
            genap++;
        }else{
            ganjil++;
        }
        //int d
        if (d>0){
            positif++;
        }else{
            negatif++;
        }
        if (d%2==0){
            genap++;
        }else{
            ganjil++;
        }
        //int e
        if (e>0){
            positif++;
        }else{
            negatif++;
        }
        if (e%2==0){
            genap++;
        }else{
            ganjil++;
        }

        System.out.println(genap + " Angka genap");
        System.out.println(ganjil + " Angka ganjil");
        System.out.println(positif + " Angka positif");
        System.out.println(negatif + " Angka negatif");
        
        

    }
}
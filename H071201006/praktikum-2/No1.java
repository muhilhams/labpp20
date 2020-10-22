import java.util.Scanner;

public class No1{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        try{
            int a = x.nextInt();
            int b = x.nextInt();
            int c = x.nextInt();
            int d = x.nextInt();
            int e = x.nextInt();

            int genap = 0;
            int ganjil = 0;
            int negatif = 0;
            int positif = 0;

            // a
            if(a <= 0){
                if(a<0)
                negatif ++;
            }else{
                positif ++;
            }
            if (a % 2 == 0)
            genap ++;
            else
            ganjil ++;
            // b
            if(b <= 0){
                if(b<0)
                negatif ++;
            }else{
                positif ++;
            }
            if (b % 2 == 0)
            genap ++;
            else
            ganjil ++;
            // c
            if(c <= 0){
                if(c<0)
                negatif ++;
            }else{
                positif ++;
            }
            if (c % 2 == 0)
            genap ++;
            else
            ganjil ++;
            // d
            if(d <= 0){
                if(d<0)
                negatif ++;
            }else{
                positif ++;
            }
            if (d % 2 == 0)
            genap ++;
            else
            ganjil ++;
            // e
            if(e <= 0){
                if(e<0)
                negatif ++;
            }else{
                positif ++;
            }
            if (e % 2 == 0)
            genap ++;
            else
            ganjil ++;

            System.out.println(genap + "Angka genap");
            System.out.println(ganjil + "Angka ganjil");
            System.out.println(positif + "Angka positif");
            System.out.println(negatif + "Angka negatif");
        }
        catch (Exception e){
            System.out.println("Inputan Tidak Valid");
        }
    }
}
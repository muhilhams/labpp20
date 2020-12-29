import java.util.InputMismatchException;
import java.util.Scanner;

public class praktikum_2_1 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        System.out.println("Input ANGKA 1, 2, 3, 4, DAN 5: ");
        int even = 0; int odd = 0; int pos = 0; int neg = 0;
        try {
            int a = ax.nextInt(); int b = ax.nextInt(); int c = ax.nextInt(); int d = ax.nextInt(); int e = ax.nextInt();
            if (a % 2 == 0){
                even++;
            } else
                odd++;
            if (b % 2 == 0){
                even++;
            } else
                odd++; 
            if (c % 2 == 0){
                even++;
            } else
                odd++; 
            if (d % 2 == 0){
                even++;
            } else
                odd++; 
            if (e % 2 == 0){
                even++;
            } else
                odd++;
                        
            if (a > 0){
                pos++;
            } else if (a < 0)
                neg++;
            if (b > 0){
                pos++;
            } else if (b < 0)
                neg++;
            if (c > 0){
                pos++;
            } else if (c < 0)
                neg++;
            if (d > 0){
                pos++;
            } else if (d < 0)
                neg++;
            if (e > 0){
                pos++;
            } else if (e < 0)
                neg++;
            System.out.println("----------------");
            System.out.println(even + " Angka Genap");
            System.out.println(odd + " Angka Ganjil");
            System.out.println(pos + " Angka Positif");
            System.out.println(neg + " Angka Negatif"); 
        } catch (InputMismatchException j){
            System.out.println("-------------------");
            System.out.println("Inputan tidak valid");
        } finally{
            ax.close();
        }
    }
}
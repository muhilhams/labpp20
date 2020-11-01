//Nama:Siskanti
//Nim:H071201064
import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.print("masukkan nilai n = ");
        int n = user.nextInt();
        int a=0;
        int b=1;
        int count=2;
        System.out.print(a+" ");
        System.out.print(b);
        while (count < n){
            int next= a+b;
            System.out.print(" "+next);
            a=b;
            b=next;
            count= count+1;
}
         }
    
    }

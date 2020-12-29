import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){
        Scanner o = new Scanner(System.in);

        int a = o.nextInt();
        int b = o.nextInt();
        if (a<b){
            for (int i=a;i<=b; i++){
                if (i>0) {
                    if (i%2==0){
                        System.out.println(i + " genap positif");
                    } else {
                        System.out.println(i + " ganjil positif");}
                } else if (i==0){
                    System.out.println(i+ " nol");
                } else if (i<0){
                    if (i%2==0){
                        System.out.println(i + " genap negatif");
                    } else {
                        System.out.println(i + " ganjil negatif");}
                }

                
            }
        } else if (b<a){
            for (int i=b;i<=a; i++){
                if (i>0) {
                    if (i%2==0){
                        System.out.println(i + " genap positif");
                    } else {
                        System.out.println(i + " ganjil positif");}
                } else if (i==0){
                    System.out.println(i+ " nol");
                } else if (i<0){
                    if (i%2==0){
                        System.out.println(i + " genap negatif");
                    } else {
                        System.out.println(i + " ganjil negatif");}
                }

                
            }
        } else if (a==b){
            for (int i = a; i<=b; i++){
                if (i>0) {
                    if (i%2==0){
                        System.out.println(i + " genap positif");
                    } else {
                        System.out.println(i + " ganjil positif");}
                } else if (i==0){
                    System.out.println(i+ " nol");
                } else if (i<0){
                    if (i%2==0){
                        System.out.println(i + " genap negatif");
                    } else {
                        System.out.println(i + " ganjil negatif");
                    }
                }
            }
        }
    }
}
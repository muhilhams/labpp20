// Nama: Siskanti 
// Nim: H0712064
import java.util.Scanner;
class Soal1{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
    int x = user.nextInt();
    int y = user.nextInt();
    int min= x<0 ? x : x*-1;
    int max= Math.abs(y); //mengubah nilai mutlak
    for (int i = min; i<=max; i++){  
        if (i%2 ==0) {
            if (i>0) {
                System.out.println(i+ " bilangan genap positif");

            } else if (i<0) {
                System.out.println(i+ " bilangan genap negatif");

            }            

        } else {

        
            if (i>0){
                System.out.println(i+ " bilangan ganjil positif");
            } else if (i<0){
                System.out.println(i+ " bilangan ganjil negatif");
            }
        
        } if (i==0){
            System.out.println(i+ " bilangan nol");
        }

    }

    }
}
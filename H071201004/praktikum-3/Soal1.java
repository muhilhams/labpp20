import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        int x = ax.nextInt();
        
        for (int y = ax.nextInt(); x <= y; x++){
            if (x > 0){
                if (x % 2 == 0){
                    System.out.println(x + " genap positif");
                } else{
                    System.out.println(x + " ganjil positif");
                }
            } else if (x < 0){
                if (x % 2 == 0){
                    System.out.println(x + " genap negatif");
                } else {
                    System.out.println(x + " ganjil negatif");
                }
            } else {
                System.out.println(x + " nol");
            }
        }
        ax.close();
    }
}
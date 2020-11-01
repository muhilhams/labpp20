 // Nama: Siskanti
// Nim: H071201064
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int x = user.nextInt();
        int y = user.nextInt();
        
        for (int i=1; i<y; i+=x) {
            for (int j=i; j<i+x; j++){

            System.out.printf("%03d ",j);
            if (j==y){

            break;
        }

    }
    System.out.println();
               }
        }
    }
        
    
    
        

    

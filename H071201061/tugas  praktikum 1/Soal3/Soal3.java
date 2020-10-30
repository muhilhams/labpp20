import java.util.Scanner;
public class Soal3{
    public static void main(String[] args){
        
        Scanner x = new Scanner(System.in);

    int h = x.nextInt();
    int a = x.nextInt();
    int b = x.nextInt();

    double A = Math.toRadians(a);
    double B = Math.toRadians(b);

    double tanA = Math.tan (A);
    double tanB = Math.tan (B);


    // c = panjang kapal 
    // d = jarak bagian depan kapal ke dasar gedung (bagian paling bawah dari gedung)
    // e = c + d

    double e = (tanA * h);
    double d = (tanB * h);
    double c = (e - d);

    System.out.printf("%.1f", c);

    }
    
    
    
}
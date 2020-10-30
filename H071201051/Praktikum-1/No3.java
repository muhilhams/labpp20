import java.util.Scanner;
public class No3 {
    public static void main(String[] args) {
        Scanner Myn = new Scanner(System.in);
        System.out.println("Masukkan Ketinggian menara (m) :");
        double t = Myn.nextDouble();
        System.out.println("Masukkan nilai sudut elevasi pengamat terhadap ujung depan kapal :");
        double a = Myn.nextDouble();
        System.out.println("Masukkan nilai sudut elevasi pengamat terhadap ujung belakang kapal :");
        double b = Myn.nextDouble();

        double x = Math.tan(Math.toRadians(a))*(double)t;
        double y = Math.tan(Math.toRadians(b))*(double)t;
        double e = x - y;

        System.out.printf("%.1f %s", e, "m");
        
    }
    
}

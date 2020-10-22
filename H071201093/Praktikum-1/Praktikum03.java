import java.util.Scanner;

class Praktikum03 {

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        // sudut elevasi ujung depan kapal dan ujung belakang kapal (90 > a >b).

        double h, b, a;
        h = 90;
        b = Math.tan(Math.toRadians(b));
        a = Math.tan(Math.toRadians(a));
        
        double panjangkapal = h * (a - b) ;
        System.out.printf("%.1f", panjangkapal, "m");

    }
}

import java.util.Scanner;

class praktikum_1_3 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in); System.out.print("Masukkan tinggi: ");
        double h = ax.nextInt();
        Scanner bx = new Scanner(System.in); System.out.print("Masukkan sudut a: ");
        double a = bx.nextDouble();
        Scanner cx = new Scanner(System.in); System.out.print("Masukkan sudut b: ");
        double b = cx.nextDouble();
        
        double belakangKapal = h * Math.tan (Math.toRadians(a));
        double depanKapal = h * Math.tan (Math.toRadians(b));

        double panjangKapal = belakangKapal - depanKapal;

        if (90 > a && a > b)
        {
            System.out.printf("%.1f m", panjangKapal);
        }
        else 
        {
            System.out.println("-----------------------");
            System.out.println("Input harus: 90 > a > b");
        }
    }
}    
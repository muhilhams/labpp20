import java.util.Scanner;
public class Tugaspraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan dua angka yang diinginkan");
        int a = input.nextInt();
        int b = input.nextInt();
        int fpb = carifpb(a,b);
        System.out.printf("FPB dari %d dan %d = %d",a , b, fpb);
    }

    public static int carifpb(int d, int e) {
        int hasil = 1;
        for (int i = 2; i<= d; i++){
            if (d%i == 0 && e%i == 0){
                hasil = i;
            }
        }
        return hasil;
    
    }
}

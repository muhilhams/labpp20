import java.util.Scanner;
public class Tugaspraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah angka fibonacci");
        int batas = input.nextInt();
        int angka1 = 0; int angka2 = 1;
        System.out.printf("%d %d ", angka1, angka2);
        int urutan; 
        for (urutan = 3; urutan<=batas; urutan++ ){
            int selanjutnya = angka1+angka2;
            System.out.print(selanjutnya+" ");
            angka1 = angka2;
            angka2 = selanjutnya;

        }
    }
}

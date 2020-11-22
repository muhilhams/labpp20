import java.util.Scanner;
import java.util.Random;
public class Tugaspraktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah blok dan jumlah angka tiap blok");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generateSerial(int n, int m) {
        String str = "";
        Random acak = new Random();
        for (int i = 0; i<n-1; i++){
            for (int j = 0; j<m; j++){
                str = str + acak.nextInt(10);
            }
                str = str +"-";
        }
        for(int j = 0; j<m; j++){
            str = str+acak.nextInt(10);
        }
        return str;
        
    }
}

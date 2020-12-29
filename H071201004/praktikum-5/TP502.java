import java.util.Scanner;
import java.util.Random;
class TP502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generateSerial (int n, int m) {
        int max = (int) Math.pow(10, m);
        int min = (int) Math.pow(10, m - 1);
        Random angka = new Random();
        String str = String.format("%d", angka.nextInt(max-min) + min);
        for (int i = 1; i < n; i++){
            String serialNum = String.format("%d", angka.nextInt(max-min) + min);
            System.out.print(serialNum);
            System.out.print("-");
        }
        return str;

    }
}

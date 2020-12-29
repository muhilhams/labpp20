import java.util.Scanner;

public class No2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println("get your serial number");
        System.out.println(serialNumber);

        scanner.close();
    }
    public static String generateSerial (int n, int m) {
    String str = "";
    int range = (10-1)+1;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
        int rand = (int)(Math.random() * range);
        str += rand;
        }
        if (i < n - 1) {
            str += "-";
        } else {
            str += " ";
        }
        
        
    }
    return str;
    }
}
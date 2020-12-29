import java.util.Scanner;

public class TP501 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        int a = ax.nextInt(), b = ax.nextInt();
        System.out.printf("FPB dari %d dan %d = %d", a, b, cariFPB(a, b));
        ax.close();
    }
    public static int cariFPB(int a, int b) {
        int fpb = 0, i = 1;
        if (a > b){
            while (a - b >= i){
                if (a % i == 0 && b % i == 0){
                    fpb = i;
                }
                i++;
            }
        } else {
            while (b - a >= i){
                if (a % i == 0 && b % i == 0){
                    fpb = i;
                }
                i++;
            }
        }
        return fpb;
    }
}
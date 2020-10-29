import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner bx = new Scanner(System.in);
        int x = bx.nextInt();
        int y = bx.nextInt();

        for (int i = 1; i <= y; i++){
            if (i % x != 0){
                System.out.print(i + " ");
            } else {
                System.out.println(i + " ");
            }
        }
        bx.close();
    }
}

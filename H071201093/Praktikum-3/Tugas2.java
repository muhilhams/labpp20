import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner rhm = new Scanner(System.in);
        System.out.println("Masukkan X = ");
        int x = rhm.nextInt();
        System.out.println("Masukkan Y = ");
        int y = rhm.nextInt();
        System.out.println(" ");

        int i = 0;
        while(i < y){
            i++;
            if(i % x == 0){
                System.out.println(i);
                }
            else if(i % x !=0){
                System.out.print(i + " ");
                }
        }
        rhm.close();
    }
}

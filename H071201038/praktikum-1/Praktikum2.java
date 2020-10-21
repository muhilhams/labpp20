import java.util.Scanner;
public class Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int detik = input.nextInt();
        
        System.out.print(detik/3600);
        System.out.print(":");
        detik = detik % 3600;
  

        System.out.print(detik/60);
        System.out.print(":");
        detik = detik % 60;
    

        System.out.print(detik);
        

    }
}

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);
        System.out.println("Input posisi matahari:");
        while (ex.hasNext()){
            if (ex.hasNextFloat()){
                float m = ex.nextFloat();
                float detik = m * 240;
                if (m >= 0 && m < 360){
                    int dd = (int) detik % 60;
                    int mm = (int) (detik / 60) % 60;
                    int jj = (int) detik / 3600; 
                    jj += 6;
                    System.out.println("--------------");

                    if (jj >= 0 && jj < 12){
                        System.out.println("Selamat pagi!");
                    } else if (jj >= 12 && jj < 15){
                        System.out.println("Selamat siang!");
                    } else if (jj >= 15 && jj < 18){
                        System.out.println("Selamat sore!");
                    } else if (jj >= 18 && jj < 24){
                        System.out.println("Selamat malam!");
                    } else {
                        jj -= 24;
                        System.out.println("Selamat pagi!");
                    }
                    System.out.printf("  %02d:%02d:%02d\n", jj, mm, dd);
                    System.out.println("--------------");
                } else {
                    System.out.println("Inputan tidak valid");
                }  
            } else {
                String stop = ex.next();
                if (stop.equalsIgnoreCase("stop")){
                    System.out.println("Thank you, Sir :)");
                    ex.close();
                    return;
                }
            }
        }
        ex.close();
    }
}
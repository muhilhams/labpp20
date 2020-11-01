//Nama:Siskanti
//Nim:H071201064
import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.print("masukkan nilai =");
        while (user.hasNextFloat()){
            float derajat = user.nextFloat();

            if (0<=derajat && derajat < 360){
                //scd= second, 360 = total derajat, 24 jam= 1 hari, 3600 detik = 1 jam
          
             int scd = Math.round((derajat / 360) * (24 * 3600)); // math round pembulatan ke terdekatan
            // System.out.println(second);

            int minute = 0;
            int hour = 0;
            int x = 0;
            int y = 0;
        
             for (x= scd; x >= 3600; x -= 3600) {
            hour++;
            }

            for (y = x; y >= 60; y -= 60) {
            minute++;
            }

             hour = (hour + 6) % 24;

             if (hour >= 6 && hour < 12) {
                System.out.print("Selamat Pagi");
             } else if (hour >= 12 && hour < 15) {
                System.out.print("Selamat Siang");
            } else if (hour >= 15 && hour < 18) {
                System.out.print("Selamat Sore");
            } else {
                System.out.print("Selamat Malam");
            }

             System.out.printf("\n%02d:%02d:%02d\n", hour, minute, y);
        
            }else  {
             System.out.println(" maaf inputan yang anda masukkan tidak terdeteksi");}
    
              
        }
         
    
          user.close();
     }

}
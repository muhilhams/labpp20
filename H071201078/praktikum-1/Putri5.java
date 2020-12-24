import java.util.Scanner;
public class Putri5 {
    public static void main(String[] args) {
       Scanner i =new Scanner(System.in);
       System.out.print("masukkan waktu : ");
       int h=0;
       int m=0;
       int s=0;
        while(i.hasNextFloat()){
           float j = i.nextFloat();// j untuk jam 
            //int HariKeDetik=86400;
            //int HariKeDerajat=360;
        if (j >= 0 && j < 360){
            float d = j*240;
            int x = (int)d;

            h=(x/3600);
            h = h+6;
            if (h>23){
                h=h-24;
            }
            else {
                h +=0;
            }
                m = (x%3600);
                m = m/60;

                s = (x%3600);
                s = s%60;
            System.out.printf("%02d: %02d: %02d \n" ,h,m,s);
            

        if (x> 0&&x <=14400){
            System.out.println("Selamat Pagi");
        }
        if (x> 14400&&x <=32400){
            System.out.println("Selamat Siang");
        }
        if (x > 32400&&x <=46800){
            System.out.println("Selamat Sore");
        }
        if (x > 46800&&x <=86900){
            System.out.println("Selamat Malam");
        
        }
        
         else {
           System.out.println("Perhatikan besaran inputan derajat");

        }
        }

        } 
    }
    
}

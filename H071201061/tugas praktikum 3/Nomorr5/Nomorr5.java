import java.util.Scanner;
public class Nomorr5 {
    public static void main(String[] args) {
        
    
        Scanner o = new Scanner(System.in);
        while (o.hasNextInt()) {
        float a = o.nextFloat();
        // s = jumlah detik dari konversi derajat ke waktu
        // 1 hari = 24 jam = 24 jam x 60 menit x 60 detik = 86400 detik
            float s = a*(86400/360);
            float scd = s + 6*3600;
            System.out.println(scd);
            float scdbaru;
            scdbaru=scd;
            int jam = 0;
            while (scd>=3600){
                scd = scd-3600;
                jam++;
            }
        

            int menit = 0;
            while (scd>=60){
                scd = scd-60;
                menit++;
            } 
            
            int detik = 0;
            while (scd>=1){
                scd = scd-3600;
                detik++;
            }
                    


            if ((scdbaru>=21600) && (scdbaru<=43199)){
                System.out.println("Selamat Pagi");
                System.out.printf("%02d:%02d:%02d", jam, menit, detik);


            } else if ((scdbaru>=43200) && (scdbaru<=53999)){
                System.out.println("Selamat Siang");
                System.out.printf("%02d:%02d:%02d", jam, menit, detik);


            } else if ((scdbaru>=54000) && (scdbaru<=64799)){
                System.out.println("Selamat Sore");
                System.out.printf("%02d:%02d:%02d", jam, menit, detik);


            } else if ((scdbaru>=64800) && (scdbaru<=86400) && (scdbaru>=1) && (scdbaru<=21599)){
                System.out.println("Selamat Malam");
                System.out.printf("%02d:%02d:%02d", jam, menit, detik);

            } 
            System.out.print("\n\n\n");
        }
    }    
}

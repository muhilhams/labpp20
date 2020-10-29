import java.util.Scanner;
public class Nomor2{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in); 
        System.out.println(" **Menu** ");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");

        System.out.println("Input angka sesuai dengan Menu yang diinginkan :");
        int m = x.nextInt();
        if (m==1){
            System.out.println(" ** Pilih Bangun Datar ** ");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Jajar Genjang");
            
            System.out.println("Input angka sesuai dengan Menu yang diinginkan : ");
            
            int n = x.nextInt();
            if (n==1){
                System.out.println("Input sisi");
                int s = x.nextInt();
                float luas = s*s ;
                System.out.print("Luas = ");
                System.out.printf("%.1f" , luas );
                
            } else if (n==2){
                System.out.println("Input Panjang");
                int p = x.nextInt();
                System.out.println("Input Lebar");
                int l = x.nextInt();
                float luas = p*l ;
                System.out.print("Luas = ");
                System.out.printf("%.1f" , luas);
            } else if (n==3){
                System.out.println("Input Alas");
                int a = x.nextInt();
                System.out.println("Input Tinggi");
                int t = x.nextInt();
                float luas = 0.5f * a * t ;
                System.out.print("Luas = ");
                System.out.printf("%.1f" , luas);                
            } else if (n==4){
                System.out.println("Input Alas");
                int a = x.nextInt();
                System.out.println("Input Tinggi");
                int t = x.nextInt();
                float luas =  a * t ;
                System.out.print("Luas = ");
                System.out.printf("%.1f" , luas);                
            }
            
        } else if (m==2){
            System.out.println(" ** Pilih Bangun Ruang ** ");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Bola");
            System.out.println("Input angka sesuai dengan Menu yang diinginkan :");

            int n = x.nextInt();
            if (n==1){
                System.out.println("Input rusuk");
                int r = x.nextInt();
                float volume = r*r*r ;
                System.out.print("Volume = ");
                System.out.printf("%.1f" , volume );
                
            } else if (n==2){
                System.out.println("Input Panjang");
                int p = x.nextInt();
                System.out.println("Input Lebar");
                int l = x.nextInt();
                System.out.println("Input Tinggi");
                int t = x.nextInt();
                float volume = p*l*t;
                System.out.print("Volume = ");
                System.out.printf("%.1f" , volume);
            } else if (n==3){
                double phi = 3.14;
                System.out.println("Input Jari-Jari");
                int r = x.nextInt();
                System.out.println("Input Tinggi");
                int t = x.nextInt();
                double rp2 = Math.pow(r,2);
                double volume  = phi *rp2 *t ;
                System.out.print("volume = ");
                System.out.printf("%.1f" , volume);                
            } else if (n==4){
                double phi = 3.14;
                System.out.println("Input Jari-Jari");
                int r = x.nextInt();
                double rp3 = Math.pow(r, 3);
                double volume =  phi * rp3 ;
                System.out.print("volume = ");
                System.out.printf("%.1f" , volume);                
            }

        }
        
    }

}
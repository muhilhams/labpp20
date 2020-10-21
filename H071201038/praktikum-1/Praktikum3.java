import java.util.Scanner;
class Praktikum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        int h = input.nextInt(); //tinggi menara
        
        int a = input.nextInt(); //sudut elevasi terhadap ujung depan kapal 

        int b = input.nextInt(); //sudut elevasi terhadap ujung belakang kapal 
        System.out.println();

        double tanA = Math.tan(Math.toRadians(a));      //Melakukan operasi tangen ke setiap nilai sudut. Nilai sudut dirubah
        double tanB = Math.tan(Math.toRadians(b));      //menjadi dalam bentuk radian terlebih dahulu.
        
        double rumus = (h * tanA) - (h * tanB);   //Rumus mencari panjang kapal.

        if (90 > a && a > b){           //Sudut pengamat pada belakang kapal tentu lebih besar dari sudut
                                        //pengamat pada depan kapal. Panjang kapal tidak bisa negatif.
            System.out.printf("Panjang kapal : %.1f m", rumus);
        }
        else {
            System.out.printf("Error : Data yang anda input salah. Jalankan ulang program.");
        }
    }
    
}

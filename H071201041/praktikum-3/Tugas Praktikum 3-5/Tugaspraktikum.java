import java.util.Scanner;
public class Tugaspraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sudut matahari");
        while (input.hasNext()){
            if (input.hasNextFloat()){
                float sudut = input.nextFloat();
                if (sudut >= 0 && sudut < 360){
                    int jumlahdetik = Math.round((sudut/360)*86400);
                    int jam = jumlahdetik/3600; int jamWaktu = jam+6;
                    int menit = (jumlahdetik-(jam*3600))/60;
                    int detik = jumlahdetik-(3600*jam+60*menit);
                    if (jamWaktu > 23){
                        jamWaktu = jamWaktu-24;
                    }
                    if (jamWaktu < 11 && 5<= jamWaktu){
                        System.out.println("Selamat pagi");
                    }else if(jamWaktu >= 11 && 15>jamWaktu){
                        System.out.println("Selamat siang");
                    }else if(jamWaktu >= 15 && 18>jamWaktu){
                        System.out.println("Selamat sore");
                    }else{
                        System.out.println("Selamat malam");
                    }
                    System.out.printf("%02d:%02d:%02d\n", jamWaktu, menit, detik);
                }
                else {
                    System.out.println("Sudut yang dimasukkan harus 0 >= sudut < 360");
                }
            } else{
                String stop = input.next();
                if( stop.equalsIgnoreCase("berhenti")){
                    input.close();
                    System.out.println("Terima kasih telah mencoba");
                    return;
                }
            }
        } input.close();
    }
}

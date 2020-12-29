import java.util.Scanner;
public class Nomor5 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.println("Masukkan sudut posisi matahari :");
	    while (inp.hasNext()) {
	        if (inp.hasNextFloat()) {
	            float sudut = inp.nextFloat();
	            if (sudut >= 0 && sudut < 360) {
	                int jumlahdetik = Math.round((sudut/360)*86400);
                    int hour = jumlahdetik/3600; 
                    int jam = hour + 6;
	                int menit = (jumlahdetik - (hour*3600))/60;
	                int detik = jumlahdetik - (3600*hour + 60*menit);
	                if (jam > 23) {
	                    jam = jam - 24;
	                }
	                if (jam < 11 && 5 <= jam) {
	                    System.out.println("Selamat pagi");
	                } else if (jam >= 11 && 15 > jam) {
	                    System.out.println("Selamat siang");
	                } else if (jam >= 15 && 18 > jam) {
	                    System.out.println("Selamat sore");
	                } else {
	                    System.out.println("Selamat malam");
	                }
	                System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
	            }
	            else {
	                System.out.println("Sudut yang dimasukkan harus sudut >= 0 dan < 360");
	            }
	        } else {
	            String stop = inp.next();
	            if (stop.equalsIgnoreCase("Stop")){
	                inp.close();
	                return;
	            }
	        }
	    } inp.close();
	}
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
		
public class Favoritemovie {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		ArrayList<String> judul = new ArrayList<String> (Arrays.asList(
        "Demon Slayer: Kimetsu no Yaiba: Mugen Train", 
        "The Hobbit: The Battle of the Five Armies", 
        "King Arthur: Legend of the Sword", 
        "Avenger: Endgame"));
		ArrayList<String> rilis = new ArrayList<String> (Arrays.asList(
        "16 Oktober 2020 (Jepang), 6 Januari 2021 (Indonesia)", 
        "17 Desember 2014", 
        "9 Mei 2017", 
        "24 April 2019"));
		ArrayList<String> durasi = new ArrayList<String> (Arrays.asList(
        "1 jam 57 menit", 
        "2 jam 24 menit", 
        "2 jam 6 menit", 
        "3 jam 1 menit"));
        ArrayList<String> genre = new ArrayList<String> (Arrays.asList(
        "Anime, Action, Fantasy",
        "Action, Adventure, Fantasy",
        "Action, Adventure, Fantasy",
        "Adventure, Sci-Fi, Action"));
		ArrayList<String> sinopsis = new ArrayList<String> (Arrays.asList(
        "Jatuh lebih dalam ke mimpi tanpa akhir. Tanjiro dan kelompoknya telah menyelesaikan pelatihan rehabilitasi mereka di Butterfly Mansion, dan mereka tiba di misi berikutnya dengan Kereta Mugen, di mana lebih dari 40 orang telah menghilang dalam waktu yang sangat singkat. Tanjiro dan Nezuko, bersama dengan Zenitsu dan Inosuke, bergabung dengan salah satu pendekar pedang terkuat di dalam Korps Pembunuh Iblis, Flame Hashira Kyojuro Rengoku, untuk menghadapi iblis di atas Kereta Mugen di jalur menuju keputusasaan.",
        "Bilbo dan teman-teman seperjalanannya harus terlibat perang melawan musuh-musuh berbahaya dan menjaga Lonely Mountain agar tak jatuh ke tangan Sauron. Kini takdir Middle Earth pun dipertaruhkan.",
        "Setelah berhasil menarik pedang Excalibur, Arthur baru mengetahui bahwa ia merupakan keturunan raja. Bersama Sir Bedivere, Arthur berjuang untuk menjatuhkan Raja Vortigern yang telah membunuh ayahnya.",
		"Melanjutkan Avengers Infinity War, dimana kejadian setelah Thanos berhasil mendapatkan semua infinity stones dan memusnahkan 50% semua mahluk hidup di alam semesta. Akankah para Avengers berhasil mengalahkan Thanos?"));
		ArrayList<String> cast = new ArrayList<String> (Arrays.asList(
        "Natsuki Hanea, Akari Kito, Hiro Shimono, Yoshitsugu Matsuoka", 
        "Ian McKellen, Martin Freeman, Richard Armitage",
        "Charlie Hunnam, Astrid Bergès-Frisbey, Jude Law",
		"Robert Downey Jr., Chris Evan, Mark Ruffalo"));
		    while(true){
		        System.out.println("Favorite Movie");
		        for(int i = 0; i < judul.size(); i++){
		            System.out.printf("%d. ",(i+1));
		            System.out.println(judul.get(i));
		        }
		        System.out.println("(d)detail (s)search (a)add (r)remove (stop)stop the program");
		        String perintah = scan.next();
		        if (perintah.equals("d") ){
		            int angka = scan.nextInt();
		            judul(perintah, angka, judul);
                    rilis(perintah, angka, rilis);
		            durasi(perintah, angka, durasi);
		            genre(perintah, angka, genre);
		            sinopsis(perintah, angka, sinopsis);
		            cast(perintah, angka, cast);
		            } else if(perintah.equals("r")){
		                int angka = scan.nextInt();
		                judul = judul(perintah, angka, judul);
		                rilis = rilis(perintah, angka, rilis);
                        durasi = durasi(perintah, angka, durasi);
                        genre = genre(perintah, angka, genre);
		                sinopsis = sinopsis(perintah, angka, sinopsis);
		                cast = cast(perintah, angka, cast);
		            } else if(perintah.equals("a")){
		                System.out.println("Silahkan masukkan data yang ingin ditambahkan");
		                judul = judul(perintah, 0, judul);
                        rilis = rilis(perintah, 0, rilis);
		                durasi = durasi(perintah, 0, durasi);
		                genre = genre(perintah, 0, genre);
		                sinopsis = sinopsis(perintah, 0, sinopsis);
		                cast = cast(perintah, 0, cast);
		            } else if(perintah.equals("s")){
		                String keyword = scan.next();
		                String cari = search(keyword, judul);
		                if(cari.equals("")){
		                    System.out.println("Hasil Pencarian tidak ada");
		                }else{
		                    for(int i = 0; i<judul.size();i++){
		                        if(cari.equals(judul.get(i))){
		                            perintah = "d";
		                            judul(perintah, i+1, judul);
                                    rilis(perintah, i+1, rilis);
		                            durasi(perintah, i+1, durasi);
		                            genre(perintah, i+1, genre);
		                            sinopsis(perintah, i+1, sinopsis);
		                            cast(perintah, i+1, cast);
		                        }
		                    }
		                }
		            } else if(perintah.equals("stop")){
		                return;
		            }
		        }
		    }
		    public static ArrayList<String> judul(String b, int a, ArrayList<String> c) {
		        Scanner scan = new Scanner(System.in);
		        ArrayList<String> judul = c;
		        if(b.equals("d")){
		            System.out.println("Judul    : "+judul.get(a-1));
		        }else if(b.equals("r")){
		            judul.remove(a-1);
		        }else{
		            System.out.print("Judul    : ");
		            String baru = scan.nextLine();
		            judul.add(baru);
		        }
		        return judul;
		    }
		    public static ArrayList<String> rilis(String b, int a, ArrayList<String> c) {
		        Scanner scan = new Scanner(System.in);
		        ArrayList<String> rilis = c;
		        if(b.equals("d")){
		            System.out.println("Rilis    : "+rilis.get(a-1));
		        }else if(b.equals("r")){
		            rilis.remove(a-1);
		        }else{
		            System.out.print("Rilis    : ");
		            String baru = scan.nextLine();
		            rilis.add(baru);
		        }
		        return rilis;
            }
		    public static ArrayList<String> durasi(String b, int a, ArrayList<String> c) {
		        Scanner scan = new Scanner(System.in);
		        ArrayList<String> durasi = c;
		        if(b.equals("d")){
		            System.out.println("Durasi   : "+durasi.get(a-1));
		        }else if(b.equals("r")){
		            durasi.remove(a-1);
		        }else{
		            System.out.print("Durasi   : ");
		            String baru = scan.nextLine();
		            durasi.add(baru);
		        }
		        return durasi;
		    }
		    public static ArrayList<String> genre(String b, int a, ArrayList<String> c) {
		        Scanner scan = new Scanner(System.in);
		        ArrayList<String> genre = c;
		        if(b.equals("d")){
		            System.out.println("Genre    : "+genre.get(a-1));
		        }else if(b.equals("r")){
		            genre.remove(a-1);
		        }else{
		            System.out.print("Genre     : ");
		            String baru = scan.nextLine();
		            genre.add(baru);
		        }
		        return genre;
		    }
		    public static ArrayList<String> sinopsis(String b, int a, ArrayList<String> c) {
		        Scanner scan = new Scanner(System.in);
		        ArrayList<String> sinopsis = c;
		        if(b.equals("d")){
		            System.out.println("Sinopsis : "+sinopsis.get(a-1));
		        }else if(b.equals("r")){
		            sinopsis.remove(a-1);
		        }else{
		            System.out.print("Sinopsis : ");
		            String baru = scan.nextLine();
		            sinopsis.add(baru);
		        } 
		        return sinopsis;
		    }
		    public static ArrayList<String> cast(String b, int a, ArrayList<String> c) {
		        Scanner scan = new Scanner(System.in);
		        ArrayList<String> cast = c;
		        if(b.equals("d")){
		            System.out.println("Cast     : "+cast.get(a-1));
		        }else if(b.equals("r")){
		            cast.remove(a-1);
		        } else{
		            System.out.print("Cast     : ");
		            String baru = scan.nextLine();
		            cast.add(baru);
		        }
		        return cast;
		    }
		    public static String search(String b, ArrayList<String> c) {
		        Scanner scan = new Scanner(System.in);
		        ArrayList<String> cek = c;
		        ArrayList<String> sementara = new ArrayList<>();
		        int count = 0;
		        for(String Ulang : cek){
		            if(Ulang.contains(b)){
		               sementara.add(Ulang);
		               System.out.printf("%d. %s\n", count+1, sementara.get(count));
		               count++;
		            }
		        }
		        String s = "";
		        if(sementara.size() > 0){
		            System.out.println("Masukkan angka film yang dipilih untuk melihat detail");
		            int pilih = scan.nextInt();
		            s = sementara.get(pilih-1);
		        }
		        return s;
		    }
}

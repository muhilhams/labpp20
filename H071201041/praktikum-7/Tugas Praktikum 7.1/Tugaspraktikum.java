import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Tugaspraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> judul = new ArrayList<String>( Arrays.asList("Detective Pikachu", "Paddington", "Bohemian Rhapsody" ));
        ArrayList<String> rilis = new ArrayList<String> (Arrays.asList("8 Mei 2019", "20 Desember 2014", "27 Oktober 2018"));
        ArrayList<String> genre = new ArrayList<String> (Arrays.asList(
        "Action, Sci-fi, Kids, Comedy, Mystery",
        "Adventure, Kids, Fantasy, Comedy",
        "Drama, Musical"));
        ArrayList<String> sinopsis = new ArrayList<String> (Arrays.asList(
        "Ryme City, kota masa depan yang luas dan modern adalah salah satu kota unik yang pernah ada di dunia. Manusia hidup berdampingan dengan berbagai macam jenis Pokemon. Namun, hal itu tidak terjadi pada Tim Goodman (Justice Smith). Ia hidup tak berdampingan dengan Pokemon. Tim lebih banyak menghabiskan waktu untuk memecahkan misteri hilangnya sang Ayah. Namun, entah dari mana muncul satu Pokemon bernama Pikachu di apartemen Tim. Pikachu yang justru mencari Tim. Bermodalkan topi, Pikachu memang akhirnya bertemu dengan Tim. Namun, yang mengejutkan justru Tim kaget dengan fakta bahwa ia bisa berkomunikasi dengan Pikachu. Begitu juga sebaliknya, Pikachu pun kaget, Tim mengerti dengan apa yang diungkapkannya. Ternyata keduanya memiliki satu tujuan yang sama. Tujuan yang menggiring Tim bertemu dengan Pokemon lain yang lucu dan menggemaskan. Pokémon Detective Pikachu akan jadi bahan yang segar dan seru minggu ini. Apalagi, peran Pikachu akan diisi suaranya oleh Ryan Reynolds. Mendengar suaranya saja sudah terasa menyebalkan. Masih banyak lagi pengisi suara yang terlibat dan tentu saja akan membuat karakter pokemon di dalam film Pokémon Detective Pikachu akan jadi lebih menarik. Penasaran seperti apa filmnya?",
        "Seekor beruang Peru muda yang tengah mencari rumah - sampai ke London. Saat sendirian di Stasiun Paddington, ia tak sengaja bertemu keluarga baik hati, Brown, yang mengajaknya tinggal sementara.", 
        "BOHEMIAN RHAPSODY adalah film yang diangkat dari kisah nyata untuk merayakan musik band Rock legendaris QUEEN dan tentunya vokalis mereka yang luar biasa, FREDDIE MERCURY, yang dikenal menentang tradisi dan stereotip hingga menjadi salah satu penghibur yang paling dicintai di planet ini."));
        ArrayList<String> durasi = new ArrayList<String> (Arrays.asList("1 jam 45 menit", "1 jam 35 menit", "2 jam 13 menit"));
        ArrayList<String> cast = new ArrayList<String> (Arrays.asList(
        "Ryan Reynolds, Justice Smith, Kathyrn Newton", 
        "Ben Whishaw, Hugh Bonneville, Sally Hawkins", 
        "Rami Malek, Gwilym Lee, Brian May"));
        while(true){
            System.out.println("Film favorit");
            for(int i = 0;i<judul.size(); i++){
                System.out.printf("%d. ",(i+1));
                System.out.println(judul.get(i));
            }
            System.out.println("(d)detail (s)search (a)add (r)remove");
            String perintah = input.next();
            if (perintah.equals("d") ){
                int angka = input.nextInt();
                judul(perintah, angka, judul);
                rilis(perintah,angka, rilis);
                genre(perintah,angka, genre);
                sinopsis(perintah,angka, sinopsis);
                durasi(perintah, angka, durasi);
                cast(perintah, angka, cast);
            }else if(perintah.equals("r")){
                int angka = input.nextInt();
                judul = judul(perintah, angka, judul);
                rilis = rilis(perintah, angka, rilis);
                genre = genre(perintah, angka, genre);
                sinopsis = sinopsis(perintah, angka, sinopsis);
                durasi = durasi(perintah, angka, durasi);
                cast = cast(perintah, angka, cast);
            }else if(perintah.equals("a")){
                System.out.println("Silahkan masukkan data yang ingin ditambahkan");
                judul = judul(perintah, 0, judul);
                rilis = rilis(perintah, 0, rilis);
                genre = genre(perintah, 0, genre);
                sinopsis = sinopsis(perintah, 0, sinopsis);
                durasi = durasi(perintah, 0, durasi);
                cast = cast(perintah, 0, cast);
            }else if (perintah.equals("s")){
                String keyword = input.next();
                String cari = mencari(keyword, judul);
                if(cari.equals("")){
                    System.out.println("Hasil Pencarian tidak ada");
                }else{
                    for(int i = 0; i<judul.size();i++){
                        if(cari.equals(judul.get(i))){
                            perintah = "d";
                            judul(perintah, i+1, judul);
                            rilis(perintah, i+1, rilis);
                            genre(perintah, i+1, genre);
                            sinopsis(perintah, i+1, sinopsis);
                            durasi(perintah, i+1, durasi);
                            cast(perintah, i+1, cast);
                        }
                    }
                }
            }else if(perintah.equals("stop")){
                return;
            }
        }
        
    }
    public static ArrayList<String> judul(String b, int a, ArrayList<String> c) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> judul = c;
        if(b.equals("d")){
            System.out.println("Judul: "+judul.get(a-1));
        }else if(b.equals("r")){
            judul.remove(a-1);
        }else{
            System.out.print("Judul : ");
            String baru = input.nextLine();
            judul.add(baru);
        }
        return judul;
    }

    public static ArrayList<String> rilis(String b, int a, ArrayList<String> c) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> rilis = c;
        if(b.equals("d")){
            System.out.println("Rilis: "+rilis.get(a-1));
        }else if(b.equals("r")){
            rilis.remove(a-1);
        }else{
            System.out.print("Rilis : ");
            String baru = input.nextLine();
            rilis.add(baru);
        }
        return rilis;
    }

    public static ArrayList<String> genre(String b, int a, ArrayList<String> c) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> genre = c;
        if(b.equals("d")){
            System.out.println("Genre: "+genre.get(a-1));
        }else if(b.equals("r")){
            genre.remove(a-1);
        }else{
            System.out.print("Genre : ");
            String baru = input.nextLine();
            genre.add(baru);
        }
        return genre;
    }

    public static ArrayList<String> sinopsis(String b, int a, ArrayList<String> c) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> sinopsis = c;
        if(b.equals("d")){
            System.out.println("Sinopsis: "+sinopsis.get(a-1));
        }else if(b.equals("r")){
            sinopsis.remove(a-1);
        }else{
            System.out.print("Sinopsis : ");
            String baru = input.nextLine();
            sinopsis.add(baru);
        } 
        return sinopsis;
    }

    public static ArrayList<String> durasi(String b, int a, ArrayList<String> c) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> durasi = c;
        if(b.equals("d")){
            System.out.println("Durasi: "+durasi.get(a-1));
        }else if(b.equals("r")){
            durasi.remove(a-1);
        }else{
            System.out.print("Durasi : ");
            String baru = input.nextLine();
            durasi.add(baru);
        }
        return durasi;
    }

    public static ArrayList<String> cast(String b, int a, ArrayList<String> c) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> cast = c;
        if(b.equals("d")){
            System.out.println("Cast: "+cast.get(a-1));
        }else if(b.equals("r")){
            cast.remove(a-1);
        } else{
            System.out.print("Cast : ");
            String baru = input.nextLine();
            cast.add(baru);
        }
        return cast;
    }
    public static String mencari(String b, ArrayList<String> c) {
        Scanner input = new Scanner(System.in);
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
            int pilih = input.nextInt();
            s = sementara.get(pilih-1);
        }
        return s;
    }
}

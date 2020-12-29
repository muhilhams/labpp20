import java.util.Scanner;
import java.util.ArrayList;
public class Nomorrr1{
    public static void main(String [] args){
        Scanner inputt = new Scanner(System.in);
        ArrayList <String> judul = new ArrayList<>();
        judul.add("Avenger: Endgame");
        judul.add("Spiderman: Far From Home");
        judul.add("Venom");
        judul.add("Thor: Ragnarok");
	
		ArrayList<String> isi = new ArrayList<>();
		isi.add("Judul   : Avenger: Endgame \n" + "Rilis   : 24 April 2019 \n" + "Durasi  : 3 jam 1 menit \n" + "Genre   : Adventure, Sci-Fi, Action \n" + "Sinopsis: ini adalah sinopsis \n" +"Cast    : Robert Downey Jr., Chria Evan, Mark Ruffalo, etc \n");
    	isi.add("Judul   : Spiderman : Far From Home \n" + "Rilis   : 26 Juni 2019 \n" + "Durasi  : 2 jam 13 menit \n" + "Genre   : Adventure, Fantasy, Action \n" + "Sinopsis: ini adalah sinopsis \n" +"Cast    : Tom Holland, Samuel L.Jackson, Zendaya, Cobie Smulders, etc \n");
		isi.add("Judul   : Venom \n" + "Rilis   : 3 Oktober 2018 \n" + "Durasi  : 1 jam 52 menit \n" + "Genre   : Action, Fantasy, Sci-Fi, Adventure \n" + "Sinopsis: ini adalah sinopsis \n" +"Cast    : Tom Hardy, Michlle Williams, Woody Harrelson, Riz Ahmed, Jenny Slate etc \n");
		isi.add("Judul   : Thor : Ragnarok \n" + "Rilis   : 25 Oktober 2017 \n" + "Durasi  : 2 jam 10 menit \n" + "Genre   : Superhero, Fantasy, Action, Comedy \n" + "Sinopsis: ini adalah sinopsis \n" +"Cast    : Chris Hemsworth, Tom Hiddleston, Cate Blanchett, Idris Elba, Jeff Goldblum, Tessa Thompson, etc \n");
        
        for (int i = 0; i<judul.size(); i++ ){
            System.out.println(i + 1 + ". "+ judul.get(i));
        }
        System.out.println(">");
        String pilihan = inputt.next();
        String pilihann = pilihan.toLowerCase();

        if ( pilihann.equals("a")){
            System.out.print("Judul    : ");
	        String bb = inputt.next();
	        System.out.print("Rilis    : ");
	        String cc = inputt.next();
	        System.out.print("Durasi   : ");
	        String dd = inputt.next();
	        System.out.print("Genre    : ");
	        String ee = inputt.next();
	        System.out.print("Sinopsis : ");
	        String ff = inputt.next();
	        System.out.print("Cast     : ");
	        String gg = inputt.next();
	        String aa = String.format("Judul   : " + bb + "\nRilis   : " + cc + "\nDurasi   :" + dd + "\nGenre   : " + ee + "\nSinopsis : "+ ff +"\nCast    : " + gg);
            judul.add(bb);
			isi.add(aa);
			System.out.println("Daftar film sekarang");
			for (int l=0; l<judul.size(); l++){System.out.println(l + 1 +". " + judul.get(l));}
        }else if (pilihann.equals("r")){
	    	System.out.println("Masukkan urutan film yang ingin dihapus dalam bentuk angka (1 sampai " + judul.size()+ ")");
            int numR = inputt.nextInt();
	    	judul.remove(numR-1);
			isi.remove(numR-1);
			System.out.println();
			System.out.println("Daftar film sekarang");
			for (int k=0; k<judul.size(); k++){System.out.println(k + 1 +". " + judul.get(k));}
        }else if (pilihann.equals("d")){
			System.out.println("Masukkan urutan film yang ingin dilihat dalam bentuk angka (1 sampai " + judul.size()+ ")");
	    	int numD = inputt.nextInt();
	    	System.out.println(isi.get(numD-1));
		}else if (pilihann.equals("s")){
			System.out.println("Masukkan potongan judul film yang ingin dicari");
	    	String cari = inputt.next();
	    	boolean carii = false;
	    	boolean c =false;
			
			for (String film : judul ){
				c = film.toLowerCase().contains(cari.toLowerCase());
	    		if (c == true){
	    			carii = true;
	    			int n = judul.indexOf(film);
		   			System.out.print(n + 1 + ". "); System.out.println(judul.get(n));
		
				}
				
			}
			if (!carii) { System.out.println("Tidak ditemukan");} 
		}
		
 	
		inputt.close();
    }
}

import java.util.Scanner;
public class praktikumwaktu {

    public static void main(String[] args) {
	     Scanner x = new Scanner(System.in);
		 System.out.println("isi total waktu dengan detik");
		 int totalwaktu = x.nextInt();
		
		 int jam = totalwaktu/3600;
		 int menit	= ((totalwaktu%3600)/60);
		 int detik	= totalwaktu%60;
		 
		 System.out.println("Hasil konversi (jam:menit:detik)");
		 System.out.println(jam + ":" + menit + ":" + detik);
		 
		 
	 
	}

}	
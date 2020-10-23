import java.util.Scanner;
class Nomor2{
	public static void main(String[] args) {

		System.out.println("** Menu **");
		System.out.println("1. Mencari Luas Bangun Datar");
		System.out.println("2. Mencari Volume Bangun Ruang");
		System.out.println("");
		System.out.println("Input angka sesuai dengan Menu yang diinginkan");

		Scanner scan = new Scanner(System.in);

		int menu = scan.nextInt();
		
		if (menu ==1){
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("*** Pilih bangundatar ***");
			System.out.println("1. Persegi");
			System.out.println("2. Persegi Panjang");
			System.out.println("3. Segitiga");
			System.out.println("4. Lingkaran");
			System.out.println("5. Jajar Genjang");
			System.out.println("6. Trapesium");
			System.out.println("7. Belah Ketupat");
			System.out.println("8. Layang-Layang");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Input angka sesuai dengan bangun datar yang diinginkan");
			
			int bangundatar = scan.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			if(bangundatar == 1){
				System.out.println("Input sisi");
				int sisi = scan.nextInt();

				float luasP = 2*sisi;

				System.out.println("Luas Persegi = " + luasP);
			} else if (bangundatar == 2){
				System.out.println("Input Panjang");
				int panjang = scan.nextInt();
				System.out.println("Input Lebar");
				int lebar = scan.nextInt();

				float luasPP = panjang * lebar;

				System.out.println("Luas Persegi Panjang = " + luasPP);
			}
			else if (bangundatar == 3){
				System.out.println("Input alas");
				int alas = scan.nextInt();
				System.out.println("Input tinggi");
				int tinggi = scan.nextInt();

				float luasSG = 1/2f * alas * tinggi;

				System.out.println("Luas Segitiga = " + luasSG);	
			}
			else if ( bangundatar == 4){
				System.out.println("Input jari - jari");
				int r = scan.nextInt();
				double phi = 3.14;

				float luasL =(float) phi * r * r;

				System.out.println("Luas Lingkaran = " + luasL);
			}
			else if (bangundatar == 5){
				System.out.println("Input alas");
				int alas = scan.nextInt();
				System.out.println("Input tinggi");
				int tinggi = scan.nextInt();

				float luasJG = alas * tinggi;

				System.out.println("Luas Jajar Genjang = " + luasJG);
			}
			else if (bangundatar == 6){
				System.out.println("Input Sisi Sejajar 1");
				int sj1 = scan.nextInt();
				System.out.println("Input Sisi Sejajar 2");
				int sj2 = scan.nextInt();
				System.out.println("Input tinggi");
				int tinggi = scan.nextInt();

				float luastrapesium = sj1 + sj2 * tinggi / 2;

				System.out.println("Luas Trapesium = " + luastrapesium);
			}
			else if (bangundatar == 7){
				System.out.println("Input Diagonal 1");
				int d1 = scan.nextInt();
				System.out.println("Input Diagonal 2");
				int d2 = scan.nextInt();

				float luasBK = (float)1/2 * d1 * d2;

				System.out.println("Luas Belah Ketupat = " + luasBK);
			}
			else if (bangundatar == 8){
				System.out.println("Input Diagonal 1");
				int d1 = scan.nextInt();
				System.out.println("Input Diagonal 2");
				int d2 = scan.nextInt();

				float luasLL = (float)1/2 * d1 * d2;

				System.out.println("Luas Layang-Layang = " + luasLL);
			}


		}
		if (menu == 2 ){
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("*** Pilih Bangun Ruang ***");
			System.out.println("1. Kubus");
			System.out.println("2. Balok");
			System.out.println("3. Limas Segitiga");
			System.out.println("4. Limas Segi empat");
			System.out.println("5. Prisma");
			System.out.println("6. Tabung");
			System.out.println("7. Kerucut");
			System.out.println("8. Bola");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Input angka sesuai dengan bangun Ruang yang diinginkan");

			int bangunruang = scan.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			if (bangunruang == 1){
				System.out.println("Input Sisi");
				int sisi = scan.nextInt();
				float vKubus = sisi * sisi * sisi;

				System.out.println("Volume Kubus = " + vKubus);
			}
			else if (bangunruang == 2){
				System.out.println("Input Panjang");
				int panjang = scan.nextInt();
				System.out.println("Input Lebar");
				int lebar = scan.nextInt();
				System.out.println("Input Tinggi");
				int tinggi = scan.nextInt();

				float vbalok = panjang * lebar * tinggi;

				System.out.println("Volume Balok = " + vbalok);
			}
			else if (bangunruang == 3){
				System.out.println("Input Alas Segitiga");
				int alas = scan.nextInt();
				System.out.println("Input Tinggi Segitiga Alas");
				int tinggiSG = scan.nextInt();
				System.out.println("Input Tinggi Limas");
				int tinggiLimas = scan.nextInt();

				float vlimas = 1/3f * (1/2f * alas * tinggiSG) * tinggiLimas;

				System.out.println("Volume Limas Segitiga = " + vlimas);
			}
			else if (bangunruang == 4){
				System.out.println("Input Sisi Alas Segi Empat");
				int sisi = scan.nextInt();
				System.out.println("Input Tinggi Limas");
				int tinggiLimas = scan.nextInt();

				float vlimas = 1/3f * (sisi * sisi) * tinggiLimas;

				System.out.println("Volume Limas Segi Empat" + vlimas);
			}
			else if (bangunruang == 5){
				System.out.println("Input Luas Alas Prisma");
				int luasalas = scan.nextInt();
				System.out.println("Input Tinggi Prisma");
				int tinggiprisma = scan.nextInt();

				float vprisma = luasalas * tinggiprisma;

				System.out.println("Volume Prisma = " + vprisma);
			}
			else if (bangunruang == 6){
				System.out.println("Input Jari - Jari");
				int r = scan.nextInt();
				System.out.println("Input Tinggi Tabung");
				int tinggitabung = scan.nextInt();
				double phi = 3.14;

				float vtabung = 3.14f * r * r * tinggitabung;

				System.out.println("Volume Tabung = " + vtabung);
			}
			else if (bangunruang == 7){
				System.out.println("Input Jari Jari Alas");
				int r = scan.nextInt();
				System.out.println("Input Tinggi Kerucut");
				int tinggikerucut = scan.nextInt();

				float vkerucut = 1/3f * 3.14f * r * r * tinggikerucut;

				System.out.println("Volume Kerucut = " + vkerucut);
			}
			else if (bangunruang == 8){
				System.out.println("Input Jari Jari");
				int r = scan.nextInt();

				float vbola = 4/3f * 3.14f * r * r * r;

				System.out.println("Volume Bola = " + vbola);
			}
			
		}
		else {
			System.out.println("Inputan Salah");
		}
	}
}
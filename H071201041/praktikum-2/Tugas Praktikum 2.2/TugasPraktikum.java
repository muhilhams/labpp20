import java.util.Scanner;
public class TugasPraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*****Selamat datang*****");
        System.out.println();
        System.out.println("Silahkan memilih menu dibawah ini");
        System.out.println();
        System.out.println("**********menu**********");
        System.out.println("1. Mencari luas bangun datar");
        System.out.println("2. Mencari volume bangun ruang");
        System.out.println();
        System.out.println("Masukkan angka sesuai pilihan");
        int pilihan1 = input.nextInt();
        switch(pilihan1){
            case 1:
                System.out.println("**Pilihlah bangun datar dibawah ini**");
                System.out.println();
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Trapesium");
                System.out.println("7. Belah Ketupat");
                System.out.println("8. Layang-layang");
                System.out.println();
                System.out.println("Masukkan angka sesuai pilihan");
                int pilihan2 = input.nextInt();
                switch(pilihan2){
                    case 1:
                        System.out.println("Masukkan sisi persegi");
                        float sisi = input.nextFloat();
                        float luas = sisi*sisi;
                        System.out.printf("Luas persegi = %.1f", luas);
                        break;
                    case 2:
                        System.out.println("Masukkan panjang persegi panjang");
                        float panjangpersegi = input.nextFloat();
                        System.out.println("Masukkan lebar persegi panjang");
                        float lebarpersegi = input.nextFloat();
                        luas = panjangpersegi*lebarpersegi;
                        System.out.printf("Luas persegi panjang = %.1f", luas);
                        break;
                    case 3:
                        System.out.println("Masukkan alas segitiga");
                        float alas = input.nextFloat();
                        System.out.println("Masukkan tinggi segitiga");
                        float tinggi = input.nextFloat();
                        luas = alas*tinggi*1/2;
                        System.out.printf("Luas segitiga = %.1f", luas);
                        break;
                    case 4:
                        System.out.println("Masukkan jari-jari lingkaran");
                        float jari = input.nextFloat();
                        luas = jari*jari*22/7;
                        System.out.printf("Luas lingkaran = %.1f", luas);
                        break;
                    case 5:
                        System.out.println("Masukkan alas jajar genjang");
                        alas = input.nextFloat();
                        System.out.println("Masukkan tinggi jajar genjang");
                        tinggi = input.nextFloat();
                        luas = alas*tinggi;
                        System.out.printf("Luas persegi = %.1f", luas);
                        break;
                    case 6:
                        System.out.println("Masukkan salah satu sisi yang sejajar pada trapesium");
                        float sisisejajar1 = input.nextFloat();
                        System.out.println("Masukkan sisi sejajar lainnya");
                        float sisisejajar2 = input.nextFloat();
                        System.out.println("Masukkan tinggi trapesium");
                        tinggi = input.nextFloat();
                        luas = (sisisejajar1+sisisejajar2)*tinggi*1/2;
                        System.out.printf("Luas persegi = %.1f", luas);
                        break;
                    case 7:
                        System.out.println("Masukkan diagonal satu pada belah ketupat");
                        float d1 = input.nextFloat();
                        System.out.println("Masukkan diagonal dua pada belah ketupat");
                        float d2 = input.nextFloat();
                        luas = d1*d2*1/2;
                        System.out.printf("Luas persegi = %.1f", luas);
                        break;
                    case 8:
                        System.out.println("Masukkan diagonal satu pada belah ketupat");
                        d1 = input.nextFloat();
                        System.out.println("Masukkan diagonal dua pada belah ketupat");
                        d2 = input.nextFloat();
                        luas = d1*d2*1/2;
                        System.out.printf("Luas persegi = %.1f", luas);
                        break;
                    default:
                        System.out.println("Maaf, silahkan pilih angka sesuai yang ada di menu");
                        break;
                }
            break;
            case 2:
                System.out.println("**Pilihlah bangun ruang dibawah ini**");
                System.out.println();
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Prisma");
                System.out.println("4. Limas Segitiga");
                System.out.println("5. Limas Segiempat");
                System.out.println("6. Tabung");
                System.out.println("7. Kerucut");
                System.out.println("8. Bola");
                System.out.println();
                System.out.println("Masukkan angka sesuai pilihan");
                pilihan2 = input.nextInt();
                switch(pilihan2){
                    case 1:
                        System.out.println("Masukkan sisi kubus");
                        float sisi = input.nextFloat();
                        double volume = Math.pow(sisi, 3);
                        System.out.printf("Luas persegi = %.1f", volume);
                        break;
                    case 2:
                        System.out.println("Masukkan panjang balok");
                        float panjang = input.nextFloat();
                        System.out.println("Masukkan lebar balok");
                        float lebar = input.nextFloat();
                        System.out.println("Masukkan tinggi balok");
                        float tinggi = input.nextFloat();
                        volume = panjang*lebar*tinggi;
                        System.out.printf("Luas persegi = %.1f", volume);
                        break;
                    case 3:
                        System.out.println("Masukkan luas alas prisma");
                        float luasalas = input.nextFloat();
                        System.out.println("Masukkan tinggi prisma");
                        tinggi = input.nextFloat();
                        volume = luasalas*tinggi;
                        System.out.printf("Luas persegi = %.1f", volume);
                        break;
                    case 4:
                        System.out.println("Masukkan luas alas limas segitiga");
                        luasalas = input.nextFloat();
                        System.out.println("Masukkan tinggi limas segitiga");
                        tinggi = input.nextFloat();
                        volume = luasalas*tinggi*1/3;
                        System.out.printf("Luas persegi = %.1f", volume);
                        break;
                    case 5:
                        System.out.println("Masukkan panjang alas limas segiempat");
                        panjang = input.nextFloat();
                        System.out.println("Masukkan lebar alas limas segiempat");
                        lebar = input.nextFloat();
                        System.out.println("Masukkan tinggi limas segiempat");
                        tinggi = input.nextFloat();
                        volume = panjang*lebar*tinggi*1/3;
                        System.out.printf("Luas persegi = %.1f", volume);
                        break;
                    case 6:
                        System.out.println("Masukkan jari-jari tabung");
                        float jari = input.nextFloat();
                        System.out.println("Masukkan tinggi tabung");
                        tinggi = input.nextFloat();
                        volume = tinggi*jari*jari*22/7;
                        System.out.printf("Luas persegi = %.1f", volume);
                        break;
                    case 7:
                        System.out.println("Masukkan jari-jari tabung");
                        jari = input.nextFloat();
                        System.out.println("Masukkan tinggi tabung");
                        tinggi = input.nextFloat();
                        volume = tinggi*jari*jari*1/3*22/7;
                        System.out.printf("Luas persegi = %.1f", volume);
                        break;
                    case 8:
                        System.out.println("Masukkan jari-jari bola");
                        jari = input.nextFloat();
                        volume = Math.pow(jari, 3)*4/3*22/7;
                        System.out.printf("Luas persegi = %.1f", volume);
                        break;
                    default:
                        System.out.println("Maaf, silahkan pilih angka sesuai yang ada di menu");
                        break;
                    }
                break;
            default:
                    System.out.println("Maaf, silahkan pilih antara kedua pilihan tersebut");
                    break;
        }
    }
}

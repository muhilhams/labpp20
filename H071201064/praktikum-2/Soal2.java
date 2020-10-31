import java.util.Scanner;
class Soal2 {
    public static void  main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. mencari luas bangun datar");
        System.out.println("2. mencari volume bangun ruang");
        System.out.print("masukkan pilihan=");
        int p = X.nextInt();
        int x;
        int pa;
        int i;
        int r;
        int a;
        int t;
        int sa;
        int sb;
        int d1;
        int d2;
        int v;
        int la;
        int t1;
        int l;


        
        if (p == 1) {

            System.out.println("Pilih bangun datar");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang ");
            System.out.println("3. segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah ketupat");
            System.out.println("8. Layang-layang");

            System.out.print("masukkan pilihan=");
            int h = X.nextInt();
            switch (h) {
                //ket: untuk x = luas
            case 1 : //persegi
            System.out.print("masukkan sisi=");
            int s = X.nextInt();
            x = s*s; 
            System.out.print("luas persegi=" +x);
            break;

            case 2: //persegi panjang
            System.out.print("masukkan panjang=");
             pa = X.nextInt();
            System.out.print("masukkan lebar=");
             l = X.nextInt();
            x = pa*l;
            System.out.print("luas persegi panjang=" +x);
            break;

            case 3: // segitiga
            System.out.print("masukkan alas=");
            a = X.nextInt();
            System.out.print("masukkan tinggi=");
            t = X.nextInt();
            x = (a*t)/2;
            System.out.print("luas segitiga=" +x);
            break;

            case 4:
                       
            System.out.print("masukkan jari-jari=");
            r = X.nextInt();
            Double x1 = (Math.PI*r*r);
            System.out.print("luas lingkaran=" +x1);
            break;

            case 5: //jajar genjang 
            System.out.print("masukkan alas=");
            a = X.nextInt();
            System.out.print("masukkan tinggi=");
            t = X.nextInt();
            x = a*t;
            System.out.print("luas jajar genjang=" +x);
            break;

            case 6: //trapesium
            System.out.print("masukkan sisi atas=");
            sa = X.nextInt();
            System.out.print("masukkan sisi bawah atau alas=");
            sb = X.nextInt();
            System.out.print("masukkan tinggi=");
            t = X.nextInt();
            x = (sa + sb)*t/2;
            System.out.println("luas trapesium=" +x);
            break;

            case 7: //belah ketupat
            System.out.print("masukkan nilai d1=");
            d1 = X.nextInt();
            System.out.print("masukkan nilai d2=");
            d2 = X.nextInt();
            x = (d1*d2)/2;
            System.out.println("luas belas ketupat=" +x);
            break;

            case 8: // layang-layang
            System.out.print("masukkan nilai d1=");
            d1 = X.nextInt();
            System.out.print("masukkan nilai d2=");
            d2 = X.nextInt();
            x = (d1*d2)/2;
            System.out.println("luas layang-layang=" +x);
            break;
            default:
            System.out.println("eror");
        } 
    } else if (p == 2) {
            System.out.println("Pilih bangun ruang");
            System.out.println("1. Kubus");
            System.out.println("2. Balok ");
            System.out.println("3. Limas Segiempat ");
            System.out.println("4. Prisma Segitiga ");
            System.out.println("5. Limas Segitiga ");
            System.out.println("6. Tabung ");
            System.out.println("7. Kerucut ");
            System.out.println("8. Bola ");
            

            System.out.print("masukkan pilihan=");
            int k = X.nextInt();
            switch (k) {
                // ket: untuk v= volume
                case 1 : //kubus
                System.out.print("masukkan rusuk=");
                r = X.nextInt();
                v = r*r*r;
                System.out.println("volume kubus=" +v);
                break;

                case 2 : //balok
                System.out.print("masukkan  panjang=");
                pa = X.nextInt();
                System.out.print("masukkan lebar=");
                l = X.nextInt(); 
                System.out.print("masukkan tinggi=");
                t = X.nextInt();
                v = pa*l*t;
                System.out.println("volume balok=" +v);
                break;

                case 3 : //limas segiempat
                System.out.print("masukkan luas alas=");
                la = X.nextInt();
                System.out.print("masukkan tinggi=");
                t = X.nextInt();
                v = (la*t)/3;
                System.out.println("volume limas segiempat=" +v);
                break;

                case 4: //prisma segitiga
                System.out.print("masukkan alas=");
                a = X.nextInt();
                System.out.print("masukkan tinggi=");
                t = X.nextInt();
                v = (a*t)/2;
                System.out.println("volume prisma segitiga=" +v);
                break;

                case 5: //limas segitiga
                System.out.print("masukkan alas=");
                a = X.nextInt();
                System.out.print("masukkan tinggi=");
                t = X.nextInt();
                System.out.print("masukkan tinggi kedua=");
                t1 = X.nextInt();
                v = (a*t*t1)/6;
                System.out.println("volume limas segitiga=" +v);
                break;

                case 6: //Tabung
                System.out.print("masukkan jari-jari=");
                r = X.nextInt();
                System.out.print("masukkan tinggi=");
                t = X.nextInt();
                double v1 = Math.PI*r*r*t;
                System.out.println("volume tabung=" +v1);
                break;

                case 7: // Kerucut
                System.out.print("masukkan jari-jari=");
                r = X.nextInt();
                System.out.print("masukkan tinggi=");
                t = X.nextInt();
                double v2 = (Math.PI*r*r*t)/3;
                System.out.println("volume kerucut=" +v2);
                break;

                case 8: // Bola
                System.out.print("masukkan jari-jari=");
                r = X.nextInt();
                double v3 = 4*(Math.PI*r*r)/3;
                System.out.println("volume Bola=" +v3);
                break;
                default:
            System.out.println("eror");}
        } else {
            System.out.println("eror");

        }
    }
    }

        
        
                
    

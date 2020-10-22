import java.util.Scanner;
public class soal02 {
    
    public static void main(String[] args) {
        Scanner user = new Scanner (System.in);
        
        
         System.out.println("--------menu-------");
         System.out.println("1. Mencari luas bangun datar");
         System.out.println("2. mencari volume bangun ruang");
         System.out.println("______________________________________________");
         System.out.print("masukkan menu pilihan: ");
         
                  int pilihan = user.nextInt();
                  int luasPersegi;
                  int luasPersegiPanjang;
                  int luasSegitiga;
                  int luasTrapesium;
                  int volumeKubus;
                  int volumeBalok;
                  int volumePrismaSegitiga;
                  int volumeLimasSegitiga;

if (pilihan==1){
System.out.println("______________________________________________");
         System.out.println("----------bangun datar-----------");
         System.out.println("1. persegi");
         System.out.println("2. persegi panjang");
         System.out.println("3. segitiga");
         System.out.println("4. trapesium");
         
         System.out.print("masukkan angka pilihan: ");
         
        
         int pilihan1 = user.nextInt();
         if (pilihan1 == 1){
         System.out.println("__________________________________________");
         System.out.print("masukkan sisi: ");
         int s = user.nextInt();
         luasPersegi = s*s;
         System.out.print("luas bangun adalah: " + luasPersegi);
        }
        if (pilihan1== 2){
            System.out.println("__________________________________________");
            System.out.print("masukkan lebar: ");
         int l = user.nextInt();
         System.out.print("masukkan panjang: ");
        int p = user.nextInt();
        luasPersegiPanjang = p*l;
    
        System.out.print("luas bangun adalah: " + luasPersegiPanjang);
        }
    
       // int pilihan3= user.nextInt();
        if (pilihan1==3){
            System.out.println("__________________________________________");
            System.out.print("masukkan alas: ");
            int a = user.nextInt();
            System.out.print("masukkan tinggi: ");
            int t = user.nextInt();
            luasSegitiga = (a*t)/2;
            System.out.println("luas segitiga adalah: " + luasSegitiga);
        }
        if (pilihan1==4){
            System.out.println("__________________________________________");
            System.out.print("masukkan sisi1: ");
            int s1 = user.nextInt();
            System.out.print("masukkan sisi2: ");
            int s2 = user.nextInt();
            System.out.print("masukkan tinggi: ");
            int t = user.nextInt();
            luasTrapesium = ((s1+s2)*t)/2;
            System.out.println("luas trapesium: " + luasTrapesium);
        }
    
    }else if(pilihan==2){
        System.out.println("______________________________________");
        System.out.println("---------bangun ruang--------");
        System.out.println("1. kubus");
        System.out.println("2. balok");
        System.out.println("3. prisma segitiga ");
        System.out.println("4. limas segitiga");
        System.out.println("______________________________________");
        System.out.print("masukkan angka pilihan: ");
        

    
    int pilihan2 = user.nextInt();
    if (pilihan2==1){
        System.out.println("______________________________________");
        System.out.print("masukkan rusuk: ");
        int r = user.nextInt();
        volumeKubus= r*r*r;
        System.out.println("volume kubus: "+ volumeKubus);
    }
    if (pilihan2==2){
        System.out.println("__________________________________________");
        System.out.print("masukkan panjang: ");
        int p = user.nextInt();
        System.out.print("masukkan lebar: ");
        int l = user.nextInt();
        System.out.print("masukkan tinggi: ");
        int t = user.nextInt();
        volumeBalok = p*l*t;
        System.out.println("volume balok: " + volumeBalok);
        System.out.println("__________________________________________");
        
    }
    if (pilihan2==3){
        System.out.println("__________________________________________");
        System.out.println("masukkan alas; ");
        int a = user.nextInt();
        System.out.println("masukkan tinggi alas: ");
        int ta = user.nextInt();
        System.out.println("masukkan tinggi bangun: ");
        int tb = user.nextInt();
        volumePrismaSegitiga = ((a*ta)*tb)/2;
        System.out.println("volume prisma segitiga: " + volumePrismaSegitiga);
        System.out.println("________________________________________________");
    }
    if (pilihan2==4){
        System.out.println("__________________________________________");
        System.out.print("masukkan alas: ");
        int a = user.nextInt();
        System.out.print("masukkan tinggi alas: ");
        int ta = user.nextInt();
        System.out.print("masukkan tinggi bangun: ");
        int tb = user.nextInt();
        volumeLimasSegitiga = ((a*ta)*tb)/6;
        System.out.println("volume limas segitiga: "+ volumeLimasSegitiga);
        System.out.println("__________________________________________");
    }
    }
    }
}

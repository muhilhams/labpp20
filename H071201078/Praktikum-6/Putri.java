
//H071201078
import java.util.Scanner;
class Putri{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kalimat = sc.nextLine();
        
        String a = "";
        for (int i = 0; i < kalimat.length(); i++) {
            if (i % 2 == 0) {
               a += kalimat.charAt(i);
            } else {  
                a += Character.codePointAt(kalimat, i);
            }
        } 
        System.out.println(a);
        int panjangKalimat = a.length();
        System.out.println(a.length());
        // int jumlah = (panjangKalimat % 16 == 0 ? panjangKalimat / 16 : (panjangKalimat / 16) + 1);
        double jumlah = (double) Math.ceil(panjangKalimat / 16.0);
        int j = 0;
        for (int i = 0; i < 16; i++) {
            for (int k = 0; k < jumlah; k++) {
                if (j < panjangKalimat) {
                    System.out.print(a.charAt(j++));
                } else {
                    System.out.print("?");
                }
            }

            if (i % 4 == 3) {
                System.out.println();
            } else{
                System.out.print(' ');
            }
            
        }
    }
}
import java.util.Scanner;
public class Tugaspraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kalimat");
        String kalimat = input.nextLine();
        String hexa = String.format("%x", kalimat.length()*kalimat.length());
        String octa = String.format("%o", kalimat.length());
        char hexachar[] = hexa.toCharArray();
        kalimat = kalimat.toUpperCase(); 
        kalimat = kalimat.replaceAll("\\s", "");
        String ubah = "";
        char kalimatchar[] = kalimat.toCharArray();
        for (int i = 0; i<kalimat.length()/2;i++){
            ubah+=kalimatchar[i];
        }
        for (int i = (kalimat.length()/2)-2; i>= 0;i--){
            ubah+=kalimatchar[i];
        }
        if (Character.isDigit(hexachar[0])){
            System.out.printf("#%s%s%s!", hexa, ubah, octa);
        }else{
            System.out.printf("#%s%s%s?", hexa, ubah, octa);
        }
    }    
}

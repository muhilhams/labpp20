import java.util.Scanner;
public class Tugaspraktikum {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan kalimat");
    String kalimat = input.nextLine();
        char kalimatchar[] = kalimat.toCharArray();
        String perubahan = "";
        for (int i = 0; i<kalimatchar.length; i++){
            if(i%2 == 0){
                perubahan+=kalimatchar[i];
            } else{
                int code = kalimat.codePointAt(i);
                perubahan+=code;
            }
        }
        char perubahanarray[] = perubahan.toCharArray();
        int count = 0;
        for (int i = 0;i<4;i++){
            for (int j = 0;j<4; j++){
                for (int k = 0; k<(perubahanarray.length/16)+1; k++){
                    if(count >= perubahanarray.length){
                        System.out.print("?");
                    }else{
                        System.out.print(perubahanarray[count]);
                        count++;
                    }
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
    }
}

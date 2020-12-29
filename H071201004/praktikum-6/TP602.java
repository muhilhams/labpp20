import java.util.Scanner;

public class TP602 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        String kalimat = ax.nextLine();

        char charKalimat[] = kalimat.toCharArray();
        String change = "";
        for (int i = 0; i < charKalimat.length; i++){
            if (i % 2 != 0){
                int code = kalimat.codePointAt(i);
                change += code;
            } else {
                change += charKalimat[i];
            }
        }

        char array[] = change.toCharArray();
        int count = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                for (int k = 0; k < (array.length/16)+1; k++){
                    if (count >= array.length){
                        System.out.print("?");
                    } else {
                        System.out.print(array[count]);
                        count++;
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        ax.close();
    }
}

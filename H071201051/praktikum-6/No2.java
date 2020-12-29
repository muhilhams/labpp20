import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input: ");
        String inp = scan.nextLine();
        char[] arr = inp.toCharArray();
        String code = "";

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                code += arr[i];
            } else {
                int kode = inp.codePointAt(i);
                code += kode;
            }
        }
        char[] henshin = code.toCharArray();
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < (henshin.length/16)+1 ; k++) {
                    if (count >= henshin.length) {
                        System.out.print("?");
                    } else {
                        System.out.print(henshin[count]);
                        count++;
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        scan.close();
    }
}

import java.util.Scanner;

public class TP601 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);

        String kata = ax.nextLine().toUpperCase();
        System.out.print("#"+hexadecimal(kata)+palindrome(kata)+octal(kata));

        char hexChar = String.valueOf(hexadecimal(kata)).charAt(0);
        if (hexChar >= 'a' && hexChar <= 'z'){
            System.out.print("?");
        } else {
            System.out.print("!");
        }
        ax.close();
    }

    static String hexadecimal (String kata){
        int kataLength = kata.length();
        int decimal = kataLength * kataLength;
        String hex = String.format("%x", decimal);
        return hex;

    }

    static String palindrome (String kata){
        String newKata = kata.replaceAll(" ", "");
        int kataLength = newKata.length() / 2;
        newKata = newKata.substring(0, kataLength);

        String kataBaru = newKata;
        String palindrome = "";
        for (int i = kataBaru.length() - 2; i >= 0; i--){
            palindrome += kataBaru.charAt(i);
        }
        String palindrom = kataBaru.concat(palindrome);
        return palindrom;
    }

    static String octal (String kata) {
        int kataLength = kata.length();
        String octal = String.format("%o", kataLength);
        return octal;
    }
}

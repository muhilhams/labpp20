import java.util.Scanner;
    public class No1 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input kalimat:");
        String original = scan.nextLine();
        String reverse = "", mod = "", simbol = "";
        int length = original.length()/2;
        String octal = String.format("%o", original.length());
        String hexa = String.format("%x", original.length()*original.length());
        
        for (int i = length - 2; i>= 0; i--) {
            reverse = reverse + original.charAt(i);
            reverse = reverse.replace(" ", "");
        }
        for (int i = 0; i < length; i++) {
            mod = mod + original.charAt(i);
            mod = mod.replace(" ", "");
        }
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(hexa.charAt(0))) {
                simbol = "!";
            } else {
                simbol = "?";
            }
        }
        System.out.println("#" + hexa + mod.toUpperCase() + reverse.toUpperCase() + octal + simbol);
        scan.close();
    }
}
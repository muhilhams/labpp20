import java.util.Scanner;
public class Number1{
    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        String kalimat = main.nextLine();
       
        String sentence1 = kalimat.replaceAll(" ","").toUpperCase();
        int halfOf = sentence1.length()/2;
        String sentence2 = sentence1.substring(0,halfOf);
        int length = sentence2.length();
        char [] str = new char[length - 1];
        int i = length - 2;
       
        for(int j = 0;j<=length-2;j++){
           str [j] = sentence2.charAt(i);
           i--;
       }
       String sentence3 = new String(str);
       String sentence4 = sentence2 + sentence3;
       int panjangAwal = kalimat.length()*kalimat.length();
       String hexa = Integer.toHexString(panjangAwal);
       String octa = Integer.toOctalString(kalimat.length());


    try{
       char hexa1 = hexa.charAt(0);
       String hexa2 = String.format("%c",hexa1);
        double x = Double.parseDouble(hexa2);
        String symbol = "!";
        System.out.println("#"+hexa+sentence4+octa+symbol);
    }catch(Exception e){
        String symbol = "?";
        System.out.println("#"+hexa+sentence4+octa+symbol);
}

       


    
}
}

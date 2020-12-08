import java.util.Scanner;
public class Nomorr1{
    public static void main(String [] args) {
        Scanner inputt = new Scanner(System.in);
        String kata = inputt.nextLine();
	int k = kata.length();
        String gantiKata = kata.toUpperCase().replace(" ", "");
        int n = gantiKata.length();
        int m = k*k;
        String kataBaru = gantiKata.substring(0, n/2);
        int z = kataBaru.length();
        String kataBaruLagi = kataBaru.substring(0, z-1);
        StringBuilder invers1 = new StringBuilder(kataBaruLagi);
        StringBuilder invers2 = invers1.reverse();
        String hasilInvers = new String(invers2);
        String polindrom = kataBaru + hasilInvers;
	String hexaa = String.format("%x", m);
	String hexaaLagi = hexaa.substring(0,1);
	boolean cek = stringToInt(hexaaLagi);
	

	System.out.print("#");
        System.out.printf("%x" , m);
	System.out.print(polindrom);
	System.out.printf("%o" , k);
	if (cek == true){ System.out.print("!");}
	else {System.out.print("?"); }
        
        
        
    } public static boolean stringToInt(String hexaaLagi){
	boolean bisaDiUbah;
	try {
		int a = Integer.parseInt(hexaaLagi);
		bisaDiUbah = true;
	}
	catch(Exception e){ bisaDiUbah = false;}
	return bisaDiUbah;
    }
}
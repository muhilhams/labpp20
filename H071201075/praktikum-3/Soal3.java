import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Scanner main = new Scanner (System.in);




int angka3 = 0;
        int angka1 = 0;
        int angka2 = 1;
        int y = 0;

System.out.print(" Masukkan lenght = ");
int lenght = main.nextInt();

while (y <= lenght) {
y++;
//angka3 = angka1 + angka2;
//angka2 = angka1;
//angka1 = angka3;
//System.out.print(angka1);
angka1 = angka2;
angka2 = angka3;
System.out.print(angka3 + " ");
angka3 = angka1 + angka2;

if (y == lenght){
    break;
}
//System.out.print(" ");
}
System.out.println( " ");
    }
}












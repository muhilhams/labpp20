import java.util.InputMismatchException;
import java.util.Scanner;

class soal01 {

public static void main(String[] args) {
   Scanner user = new Scanner (System.in);
try {
int genap = 0;
int ganjil= 0;
int positif=0;
int  negatif=0;
int a = user.nextInt();
int b = user.nextInt();
int c = user.nextInt();
int d = user.nextInt();
int e = user.nextInt();
   
   
if (a % 2 == 0) {
    genap++;

    }else {
    ganjil++;
    }

if (a >= 0 && a != 0){
    positif++;
    }else if (a < 0 && a != 0) {
    negatif++;
    }
//variabel b

if (b % 2 == 0) {
    genap++;
 
    }else {
    ganjil++;
    }
 
if (b >= 0 && b != 0){
    positif++;
    }else if (b < 0 && b != 0){
    negatif++;
        }
//variabel c
if (c % 2 == 0) {
    genap++;

    }else {
    ganjil++;
}

if (c >= 0 && c != 0){
    positif++;
    }else if (c < 0 && c != 0) {
    negatif++;
    }
//variabel d
if (d % 2 == 0) {
    genap++;

    }else {
    ganjil++;
}

if (d > 0){
    positif++;
    }else if (d < 0 && d != 0) {
    negatif++;
    }

//variabel e
if (e % 2 == 0) {
    genap++;

    }else {
    ganjil++;
}

if (e >= 0 && e != 0){
    positif++;
    }else if (e < 0 && e != 0) {
    negatif++;
   }
   System.out.println("jumlah angka genap: " + genap );
   System.out.println("jumlah angka ganjil: " + ganjil );
   System.out.println("jumlah angka positif: " + positif );
   System.out.println("jumlah angka negatif: " + negatif );
}
catch (InputMismatchException yann) {

    System.out.println("inputan tidak valid");
}
}
}
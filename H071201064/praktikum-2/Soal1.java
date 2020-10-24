import java.util.InputMismatchException;
import java.util.Scanner;
public class Soal1 {

     public static void main(String[] args) {
        try {
        Scanner siska = new Scanner(System.in);
        
        int a = siska.nextInt();
        int b = siska.nextInt();
        int c = siska.nextInt();
        int d = siska.nextInt();
        int e = siska.nextInt();

        int genap =0;
        int ganjil =0;
        int positif =0;
        int negatif =0;
        


        if (a%2 == 0) {
           genap += 1;
           if (a >= 0 && a != 0) {
               positif += 1;
           } else if (a < 0 && a != 0) {
               negatif += 1;
           }
           } else {
               ganjil += 1;
               if (a >= 0 && a != 0) {
                   positif += 1;
               } else if (a < 0 && a != 0) {
                   negatif += 1;
               }
               }

        if (b%2 == 0) {
           genap += 1;
           if (b >= 0 && b != 0) {
               positif += 1;
           } else if (b < 0 && b != 0) {
               negatif += 1;
           }
           } else {
                ganjil += 1;
               if (b >= 0 && b != 0) {
                   positif += 1;
               } else if (b < 0 && b != 0) {
                   negatif += 1;
               }
               }
            

        if (c%2 == 0) {
               genap += 1;
           if (c >= 0 && c != 0) {
               positif += 1;
           } else if (c < 0 && c != 0) {
               negatif += 1;
           }
           } else {
               ganjil += 1;
               if (c >= 0 && c != 0) {
                   positif += 1;
               } else if (c < 0 && c != 0) {
                   negatif += 1;
               }
               }
        

            if (d%2 == 0) {
               genap += 1;
               if (d >= 0 && d != 0) {
                   positif += 1;
               } else if (d < 0 && d != 0) {
                   negatif += 1;
               }
               } else {
                   ganjil += 1;
                   if (d >= 0 && d != 0) {
                       positif += 1;
                   } else if (d < 0 && d != 0) {
                       negatif += 1;
                   }
                   }
                
            if (e%2 == 0) {
               genap += 1;
               if (e >= 0 && e != 0) {
                   positif += 1;
               } else if (e < 0 && e != 0) {
                   negatif += 1;
               }
               } else {
                   ganjil += 1;
                   if (e >= 0 && e != 0) {
                       positif += 1;
                   } else if (e < 0 && e != 0) {
                       negatif += 1;
                   }
                }
            
                   System.out.printf("terdapat %d bilangan genap\n", + genap);
                   System.out.printf("terdapat %d bilangan ganjil\n", + ganjil);
                   System.out.printf("terdapat %d bilangan positif\n", + positif);
                   System.out.printf("terdapat %d bilangan negatif\n", + negatif);  
            }
            catch(InputMismatchException ka) { 
                System.out.print("inputan tidak valid"); 
                return;
                
            }
        }
    }   
            
    


    


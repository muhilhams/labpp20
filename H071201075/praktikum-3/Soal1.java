import java.util.Scanner;
public class Soal1 {
   public static void main(String[] args) {
      Scanner main = new Scanner (System.in);
       int x,y;
       

      System.out.print("masukkan nilai awal = ");
      x = main.nextInt();
      System.out.print("masukkan nilai akhir = ");
      y = main.nextInt();

System.out.println("___________________________");
    
         for (int i = x ; i<=y; i++ ){
        if (i %2 == 0){
           
          if (i <0){
             System.out.println(i + " adalah genap negatif");
          }
          else if (i>0){
             System.out.println(i + " adalah genap positif");
          }
         
        }
         else if (i %2  != 0) {
            if (i <0){
                System.out.println(i + " adalah ganjil negatif");
            }
             else if (i>0){
                System.out.println(i + " adalah ganjil positif");
             }
            
             
         } if (i == 0){
             System.out.println(i + " adalah nol");
         }
   
         
      }
    
          
    }
}
      
   



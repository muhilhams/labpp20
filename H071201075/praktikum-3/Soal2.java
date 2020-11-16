import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner main = new Scanner (System.in);
       
      System.out.print(" input nilai x = ");
      int x = main.nextInt();
      System.out.print(" input nilai y = ");
      int y = main.nextInt();
    

      for ( int i =1; i<= y ; i++ ){
     String hasil = (i % x == 0) ? "\n" : " ";
      
     
      System.out.print(i + hasil);
  
      }
    }
    
}
       


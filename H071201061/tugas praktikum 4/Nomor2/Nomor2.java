import java.util.Scanner;

public class Nomor2 {
     public static void main(String[] args){
       Scanner inputan = new Scanner(System.in);
       int i = inputan.nextInt();
       int j = inputan.nextInt();
       int k = inputan.nextInt();
       int [][] matriksA = new int [i][j];
       int [][] matriksB = new int [j][k];
       int [][] matriksAxB= new int [i][k];
       //input matriksA
       for (int a1= 0; a1<i ; a1++){
         for (int b1= 0; b1<j; b1++){
           matriksA [a1][b1]= inputan.nextInt();
         }
       }
       
       //input matriksB
       for (int a2= 0; a2<j ; a2++){
         for (int b2= 0; b2<k; b2++){
            matriksB[a2][b2]= inputan.nextInt();
         }
       }
       
       // Perkalian matriksA dan matriksB
       // Ordi hasil perkalian dua matriks
       // jumlah baris hasil kali = jumlah baris matriks A = i
       // jumlah kolom hasil kali = jumlah kolom matriks B = k
       
       for (int a= 0; a<i ; a++){
         for (int b= 0; b<k; b++){
           matriksAxB[a][b] =0; 
           for (int c= 0; c<j; c++){
              matriksAxB[a][b] = matriksAxB[a][b] + (matriksA[a][c]*matriksB[c][b]);
             
           }
           
         }
       }
       int kolomMatriksAxB = k;
       for (int a3=0; a3<i;a3++){
         System.out.print("[");
         for (int b3=0;b3<k;b3++){
           System.out.print(matriksAxB[a3][b3]+ " ");
           int n= b3+1;
           if (n%kolomMatriksAxB==0){
             System.out.println("]");
           } else{
             System.out.print("," + " ");
           }
         }
       }
     }
     

}

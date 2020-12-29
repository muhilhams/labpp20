//Nama:Siskanti
//Nim :h071201064
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner user= new Scanner (System.in);
        int n = user.nextInt();
        int[] array=new int[n];

        for (int i=0; i<n; i++){
            array[i]= user.nextInt();
        }
        for (int i=0; i<n; i++){
            for (int j= i+1; j<n; j++){
                int a=0;
                for(int k=2; k<=(array[j]>array[i] ? array[i] : array[j]); k++){
                    if (array[j]%k==0 && array[i]%k==0)
                    
                    a=k;
                    
                }
                if (a==0)
                //akan mengeluarkan output berpasangan jika relatif dan jika tidak relatif tidak mengeluarkan output 
                //misal 2 dan 3 relatif maka outputnya 2 3
                //misal 8 dan 4 tidak relatif maka tidak ada outputnya atau langsung berakhir
                System.out.printf(" %d %d \n", array[i], array[j]);
                }
            }
        }
}

        
    
        
    


import java.util.Scanner;
public class Nomor1{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int [] arrayy = new int [n];

        for (int i =0; i<n; i++){
            arrayy [i] = input.nextInt();
        }
        //int d=n;
        //int c= 1;
        for (int j=0; j<n; j++){
            
            
            for (int k=0; k<n; k++){
                if ((j!=k) && (j<k)){
                    if (arrayy[j]!=arrayy[k]){
                        int b = 0;
                        for (int l=2; l<Math.max(arrayy[j], arrayy[k]); l++){
                            if (arrayy[j]%l==0){
                                if (arrayy[k]%l==0){
                                    b++;
    
                                }
                            }
                        }
                            
                            
                        if (b==0){
                                System.out.println(arrayy[j] + "  " + arrayy[k]);
                        } 
                        
                        
                        
                        
                        
                    }
                    
                    
                }
            }
        }

        
        
    }
}
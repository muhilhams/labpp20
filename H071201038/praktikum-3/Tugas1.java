import java.util.Scanner;
class Tugas1 {
    public static void main(String[] args)  {
        Scanner obj = new Scanner(System.in);
       
        int x = obj.nextInt();
        int y = obj.nextInt();

        for(int i = x<=y? x:y; i<=(x<=y? y:x); i++){
            if (i<=0){

                if(i==0){ 
                    System.out.printf("%d nol\n",i); 
                }
                else if(i%2==0){
                    System.out.printf("%d genap negatif\n",i);
                }
                else{
                    System.out.printf("%d ganjil negatif\n",i); 
                }
            }
            else{
                if(i%2==0){
                    System.out.printf("%d genap positif\n",i);
                }
                else{
                    System.out.printf("%d ganjil positif\n",i);
                }
        }
            

    }

}
}


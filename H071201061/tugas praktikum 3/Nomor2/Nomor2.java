import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args){
        Scanner o = new Scanner(System.in);
        int x = o.nextInt();
        int y = o.nextInt();
        int a=1;
          for (int i= 1 ; i<= y; i++){
            if (a%x==0){
              System.out.println(i +" ");
            } else{
              System.out.print( i + " ");
            }
            a++;
        }
    }
     
    

}
     
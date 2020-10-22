import java.util.Scanner;

public class  Tugas3{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int h,a,b;

        h = input.nextInt();
        a = input.nextInt();
        b = input.nextInt();
        
        a = (float)(Math.tan(Math.toRadians(a)) * h);
        b = (float)(Math.tan(Math.toRadians(b)) * h);

        float  panjangkapal = p2 - p1;
        
        System.out.printf("panjang kapal = " + "%.1f m" , panjangkapal);


        

    }


}
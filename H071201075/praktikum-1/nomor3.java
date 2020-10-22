import java.util.Scanner;
public class nomor3 {
    
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("tower height: "); 
        double h = data.nextInt();
        System.out.print("front elevation angle: "); 
        double b  = data.nextInt();
         System.out.print("rear elevation angle: " ); 
         double a = data.nextInt();
        
         
//rumus  dengan trigonometri
        double x = Math.tan(Math.toRadians(a))*(double)h;
        double y = Math.tan(Math.toRadians(b))*(double)h;
        double xy =  y - x;
//than
        System.out.printf("meter of ship: %.1f m \n",xy);
        
        

       
       
    }
}

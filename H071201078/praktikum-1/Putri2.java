import java.util.Scanner;
public class Putri2 {
    public static void main(String[] args) {
        Scanner u = new Scanner (System.in);
        int x = u.nextInt();
        int y = u.nextInt();
        int reset = 0;
        for (int i=1; i<=y; i++){
            if (i == 1){
                System.out.print(i);
            }
            else if(reset == x){
                System.out.printf("\n" + i);
                reset =0;
            }
            else{
                System.out.printf(" " + i);
            }
        reset++;
        }
    }
    
}

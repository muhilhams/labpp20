import java.util.Scanner;

import java.util.Scanner;
public class Tugas2 {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

            int x = obj.nextInt();
            int y = obj.nextInt();
            for(int i = 1; i<=y; i++)
            {
                if(i%x==0)
                    System.out.println(i+" ");
                else
                    System.out.print(i+" ");

            }
        

    
    }
}

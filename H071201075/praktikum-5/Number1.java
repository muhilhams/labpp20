import java.util.Scanner;
public class Number1 {
  public static void main(String[] args) {
    Scanner main = new Scanner(System.in);
    int a = main.nextInt();
    int b = main.nextInt();
    System.out.println(FPB(a,b));
}
  
  static int FPB(int x, int y){
      int nilai = 0;
      int maks = Math.max(x,y);
      int i = maks;
      while(i > 0){
       //than
        i--;
        if(x % i == 0 && y % i == 0){
          nilai += i;
          
          break;
        }
    }
    return nilai;
  }
}

  
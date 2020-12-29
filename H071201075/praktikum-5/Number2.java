import java.util.*;

public class Number2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   System.out.println("input nilai n: ");
    int n = scanner.nextInt();
   System.out.println("input nilai m: ");
    int m = scanner.nextInt();
    String serialNumber = generateSerial(n, m);
    System.out.println(serialNumber);

  }
  public static String generateSerial(int n,int m){
    String str = "";
    Random angka = new Random();

    for(int a = 1; a <= n; a++){
      for(int b = 1; b<= m; b++){

        int num = angka.nextInt(10);
        str += String.valueOf(num);
      }if(a == n){
        str += " ";
      }else{
        str += "-";
      }}
    return str;
  }
}

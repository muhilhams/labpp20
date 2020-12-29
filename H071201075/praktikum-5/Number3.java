import java.util.Scanner;
public class Number3{
  public static void main(String[] args) {
      Scanner main = new Scanner(System.in);
      System.out.print("input number of age: ");
      int age = main.nextInt();
      myDay(age);
  }
  public static void myDay(int ageOnDay){
    int y = ageOnDay / 365;
    int m = (ageOnDay % 365) / 30; 
    int d = (ageOnDay % 365) % 30;
   
  System.out.println(y + " tahun");
  System.out.println(m + " bulan");
  System.out.println(d + " hari");
}
  
 
}
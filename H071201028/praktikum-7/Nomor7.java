import java.util.Scanner;

public class Nomor7 {

  public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("Masukkan 10 angka : ");
      int a1 = scan.nextInt();
      int a2 = scan.nextInt();
      int a3 = scan.nextInt();
      int a4 = scan.nextInt();
      int a5 = scan.nextInt();
      int a6 = scan.nextInt();
      int a7 = scan.nextInt();
      int a8 = scan.nextInt();
      int a9 = scan.nextInt();
      int a10 = scan.nextInt();
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

      if (a10>a1 && a10>a2 && a10>a3 && a10>a4 && a10>a5 && a10>a6 && a10>a7 && a10>a8 && a10>a9) {
         System.out.println("Max = " + a10);
      }
      else if (a9>a1 && a9>a2 && a9>a3 && a9>a4 && a9>a5 && a9>a6 && a9>a7 && a9>a8) {
         System.out.println("Max = " + a9);
      }
      else if (a8>a1 && a8>a2 && a8>a3 && a8>a4 && a8>a5 && a8>a6 && a8>a7) {
         System.out.println("Max = " + a8);
      }
      else if (a7>a1 && a7>a2 && a7>a3 && a7>a4 && a7>a5 && a7>a6) {
         System.out.println("Max = " + a7);
      }
      else if (a6>a1 && a6>a2 && a6>a3 && a6>a4 && a6>a5) {
         System.out.println("Max = " + a6);
      }
      else if (a5>a1 && a5>a2 && a5>a3 && a5>a4) {
         System.out.println("Max = " + a5);
      }
      else if (a4>a1 && a4>a2 && a4>a3) {
         System.out.println("Max = " + a4);
      }
      else if (a3>a1 && a3>a2) {
         System.out.println("Max = " + a3);
      }
      else if (a2>a1) {
         System.out.println("Max = " + a2);
      }
      else {
         System.out.println("Max = " + a1);
      }

      if (a10<a1 && a10<a2 && a10<a3 && a10<a4 && a10<a5 && a10<a6 && a10<a7 && a10<a8 && a10<a9) {
         System.out.println("Min = " + a10);
      }
      else if (a9<a1 && a9<a2 && a9<a3 && a9<a4 && a9<a5 && a9<a6 && a9<a7 && a9<a8) {
         System.out.println("Min = " + a9);
      }
      else if (a8<a1 && a8<a2 && a8<a3 && a8<a4 && a8<a5 && a8<a6 && a8<a7) {
         System.out.println("Min = " + a8);
      }
      else if (a7<a1 && a7<a2 && a7<a3 && a7<a4 && a7<a5 && a7<a6) {
         System.out.println("Min = " + a7);
      }
      else if (a6<a1 && a6<a2 && a6<a3 && a6<a4 && a6<a5) {
         System.out.println("Min = " + a6);
      }
      else if (a5<a1 && a5<a2 && a5<a3 && a5<a4) {
         System.out.println("Min = " + a5);
      }
      else if (a4<a1 && a4<a2 && a4<a3) {
         System.out.println("Min = " + a4);
      }
      else if (a3<a1 && a3<a2) {
         System.out.println("Min = " + a3);
      }
      else if (a2<a1) {
         System.out.println("Min = " + a2);
      }
      else  {
         System.out.println("Min = " + a1);
      }
  }
}
      
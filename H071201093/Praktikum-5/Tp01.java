import java.util.Scanner;
class Tp01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
    int nilai1 = read.nextInt();
    int nilai2 = read.nextInt();
    System.out.println("FPB dari " + nilai1 + " dan " + nilai2 + " = " + nilaiFPB(nilai1,nilai2));
  }
  static int nilaiFPB(int nilaiX, int nilaiY){
      int nilaiZ = 0;
      int nilaiMax = Math.max(nilaiX, nilaiY);
      int i = nilaiMax;
      while(i > 0){
        i--;
        if(nilaiX % i == 0 && nilaiY % i == 0){
          nilaiZ += i;
          break;
        }
    }
    return nilaiZ;
    }
}
import java.util.Scanner;
public class P5N1 {
  public static void main(String[] args) {
    Scanner yuu = new Scanner(System.in);

    System.out.print("Masukkan Nilai Pertama: ");
    int nilaiPertama = yuu.nextInt();

    System.out.print("Masukkan Nilai Kedua: ");
    int nilaiKedua = yuu.nextInt();

    System.out.println("FPB dari " + nilaiPertama + " dan " + nilaiKedua + " = " + nilaiFPB(nilaiPertama,nilaiKedua));
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
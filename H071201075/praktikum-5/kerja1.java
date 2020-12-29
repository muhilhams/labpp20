import java.util.Scanner;
public class kerja1{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        if(n>0){
            if(n<=9){
                System.out.println("satuan");
            }else if(n<=99){
                System.out.println("puluhan");
            }else if(n<=999){
                System.out.println("ratusan");
            }else if(n<=9999) {
                System.out.println("ribuan");
            }else{
                System.out.println("puluhanribu");
            }
        }else{
            System.out.println("Bilangan Negatif");
        }
    }
}

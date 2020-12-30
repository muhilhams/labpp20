import java.util.Scanner;
class Tugas1 {

    public static void main(String[] args) {
        Scanner rhm = new Scanner(System.in);
        int x = rhm.nextInt();
        int y = rhm.nextInt();


        for(int i = x; i <= y; i++){
            if(i < 0 && i % 2 == 0){
                System.out.println(i + " genap negatif ");
            }
            else if(i < 0 && i % 2 == 1 || i % 2 == -1){
                System.out.println(i + " ganjil negatif");
            }
            else if(i == 0){
                System.out.println(i + " nol");
            }
            else if(i > 0 && i % 2 == 1 || i % 2 == -1){
                System.out.println(i + " ganjil positif");
            }
            else if(i > 0 && i % 2 == 0){
                System.out.println(i + " genap positif");
            }
            else{
                System.out.println(" Inputan Salah");
            }
        }

        for(int j = y; j <= x; j++){
            if(j < 0 && j % 2 == 0){
                System.out.println(j + " genap negatif ");
            }
            else if(j < 0 && j % 2 == 1 || j % 2 == -1){
                System.out.println(j + " ganjil negatif");
            }
            else if(j == 0){

                System.out.println(j + " nol");
            }
            else if(j > 0 && j % 2 == 1 || j % 2 == -1){

                System.out.println(j + " ganjil positif");
            }
            else if(j > 0 && j % 2 == 0){

                System.out.println(j + " genap positif");
            }
            else{
                System.out.println(" Inputan Salah");
            }
        }
        rhm.close();
    }
} 
import java.util.Scanner;
public class Tugaspraktikum{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan panjang array");
    int panjang = input.nextInt();
    System.out.println("Masukkan angka");
    int prima[] = new int[panjang];
    for(int i = 0; i<panjang;i++){
        prima[i] = input.nextInt();
    }
    int count;
    for (int i = 0; i< panjang;i++){
        for(int j = i+1; j<panjang; j++){
            count=0;
            for(int k =1; k<= prima[i]; k++){
                if(prima[i]%k == 0 && prima[j]%k == 0){
                    count++;
                }else{
                    continue;
                }
            }
            if(count == 1){
                System.out.println(prima[i]+" "+prima[j]);
            }

        }
    }
}
}
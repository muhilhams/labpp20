import java.util.Scanner;

public class TP401 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        int n = ax.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = ax.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (array[i] % array[j] != 0 && array[j] % array[i] != 0){
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }
        ax.close();
    }
}
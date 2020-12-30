import java.util.Scanner;
public class Tp01 {

    public static void main(String[] args) {
        Scanner rhm = new Scanner(System.in);
		int array = rhm.nextInt();
		int[] rahma = new int[array];

		for(int i = 0; i < array; i++){
			rahma[i] = rhm.nextInt();
		}
		for(int i = 0; i < array - 1; i++){
			for(int j = i + 1; j < array; j++){
			    int prima1 = rahma[i];
			    int prima2 = rahma[j];

			    while(prima1 != prima2){
			        if(prima1 > prima2){
			        prima1 = prima1 - prima2;
			        }else{
			        prima2 = prima2 - prima1;
			        }	
			    }
			    if(prima1 == 1){
			    System.out.println(rahma[i] + " " + rahma[j]);
	    	    }
			}
		}
    }
}
import java.util.Scanner;

public class Number1{
	public static void main(String[] args){
		Scanner main = new Scanner(System.in);

		int x = main.nextInt();
		int[] array = new int[x];
		for(int i = 0; i< x; i++){
			array[i] = main.nextInt();
		}
		for(int i = 0; i < x - 1; i++){
			for(int j = i + 1; j < x; j++){
			    int num1 = array[i];
			    int num2 = array[j];

			    while(num1 != num2){
			        if(num1 > num2){
			        num1 = num1 - num2;
			        }else{
			        num2 = num2 - num1;
			        }	
			    }if(num1 == 1){
			    System.out.println(array[i] + " " + array[j]);
	    	    }
			}
		}
	}
} 
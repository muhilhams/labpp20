import java.util.Scanner;
public class Nomor2{
	public static void main(String[] args){
		Scanner inputt = new Scanner(System.in);
		String kata = inputt.nextLine();
		
		char [] ubahKeChar = new char[kata.length()];
		for (int i=0; i<kata.length(); i++){
			ubahKeChar[i] = kata.charAt(i);
		}

    // for(char o : ubahKeChar) {
    //   System.out.println(o);
    // }

		String kodeTotal ="";
		String kode;
		//char [] cek = new char[kata.length()];
		String kata1 = kata;
		for (int k=0; k<kata1.length(); k++){
			if (k%2==0){
				kode = String.valueOf(ubahKeChar[k]);
				kodeTotal = kodeTotal+ kode;
			} else {
				int m = Character.codePointAt(kata1, k);
				kode = String.valueOf(m);
				kodeTotal = kodeTotal+ kode;
			}
		}
    
		while (kodeTotal.length()%16!=0){
			kodeTotal = kodeTotal + "?";
		}
		
		
		int angka = kodeTotal.length()/16;
		String[][] arrayBaru = new String[4][4];

    	for (int a = 0; a<4; a++){
      		for (int b = 0; b<4; b++){
        		arrayBaru[a][b]="";
      		}
    	}


    	int count = 0;
		for (int p = 0; p<4; p++){
			for (int q = 0; q<4; q++){
        		for (int r = 0; r<angka; r++){
          			arrayBaru[p][q] += String.valueOf(kodeTotal.charAt(count));
          			count++;
        		}
        		
			}
		} 
		
			for (int e = 0; e<4; e++){
				for (int f = 0; f<4; f++){
					System.out.print(arrayBaru[e][f] + " ");
				}
      			System.out.println();

			} 
				
		
	} 
}
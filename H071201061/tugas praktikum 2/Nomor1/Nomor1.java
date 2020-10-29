import java.util.Scanner;
public class Nomor1{

    public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        String outputt = "Valid"; 		

		try {
			a = x.nextInt();
		    b = x.nextInt();
		    c = x.nextInt();
		    d = x.nextInt();
            e = x.nextInt();
            x.close();           
           
		}catch(Exception ex){
            outputt = "Inputan Tidak Valid" ;
            System.out.println(outputt);
            return;
			
		}
       
        
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif= 0;


		
		if (a>0){
			if (a%2==0){
				genap++;
				positif++;
			} else {
				ganjil++;
				positif++; }
		} else if (a==0){
				genap++;
        } else if (a<0) {
			if (a%2==0){
				genap++;
				negatif++;
			}else {
				ganjil++;
				negatif++;}
		} else {
			
		}


        if (b>0){
		if (b%2==0){
			genap++;
			positif++;
		} else {
			ganjil++;
			positif++; }
		} else if (b==0){
		genap++;
        } else  {
		if (b%2==0){
			genap++;
			negatif++;
		}else {
			ganjil++;
			negatif++;}
	}
	
        if (c>0){
		if (c%2==0){
			genap++;
			positif++;
		} else {
			ganjil++;
			positif++; }
		} else if (c==0){
		genap++;
        } else  {
		if (c%2==0){
			genap++;
			negatif++;
		}else {
			ganjil++;
			negatif++;}
	}

        if (d>0){
		if (d%2==0){
			genap++;
			positif++;
		} else {
			ganjil++;
			positif++; }
		} else if (d==0){
		genap++;
        } else {
		if (d%2==0){
			genap++;
			negatif++;
		}else {
			ganjil++;
			negatif++;}
	}

        if (e>0){
		if (e%2==0){
			genap++;
			positif++;
		} else {
			ganjil++;
			positif++; }
		} else if (e==0){
			genap++;
        } else {
		if (e%2==0){
			genap++;
			negatif++;
		}else {
			ganjil++;
			negatif++;}
	} 
	
		System.out.println(ganjil + " ganjil");
		System.out.println(genap + "genap");
		System.out.println(negatif + "negatif");
		System.out.println(positif + "positif");   

	
	}
	
	
    }


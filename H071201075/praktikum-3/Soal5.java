import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args) {
        Scanner main = new Scanner (System.in);
        
        System.out.print("input time = ");
        int h = 0;
        int m = 0;
        int s= 0;
        
        
        
       
        while(main.hasNextFloat()){
             float t = main.nextFloat(); // t for time

            if(t >= 0 && t < 360){
                float d = t*240; //d for degree
                int x = (int)d;

                h = (x / 3600);
                h = h + 6;

                if(h > 23){
                    h -= 24;
                    
                }
                else{
                //for hour
                    h += 0;
                }
                // for minute
                    m = (x % 3600);
                    m = m / 60;
                // for secon
                    s = (x % 3600 ) ;
                    s = s % 60;
               
System.out.println("____________________________________________________________");
                if(x >= 0 && x < 14400){
                    System.out.println("Selamat Pagi");
                }
                else if( x >= 14400 && x < 32400){
                    System.out.println("Selamat Siang");
                }
                else if(x >= 32400 && x <46800){
                    System.out.println("Selamat Sore");
                }
                else if(x >= 46800 && x <79200){
                    System.out.println("Selamat Malam");
                }
                else{
                    System.out.println("Subuh");
                }


            System.out.printf("%02d: %02d: %02d \n" ,h,m,s);

            }else{
            System.out.println("Inputan Tidak Valid");
            }

            

        }

    
    }

    }


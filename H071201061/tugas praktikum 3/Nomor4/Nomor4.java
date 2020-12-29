import java.util.Scanner;
public class Nomor4{
    public static void main(String[] args){
        Scanner o = new Scanner(System.in);
        // u : uang , h : harga, s : sisa
        int u = o.nextInt();
        int h = o.nextInt();

        int s = u - h;
        int count1 = 0;
        while (s>=100000){
        s = s-100000;
        count1++;
        } System.out.println(count1 +" uang Rp. 100.000" );
        
        int count2 = 0;
        while (s>=50000){
        s = s-50000;
        count2++;
        } System.out.println(count2 +" uang Rp. 50.000" );

        int count3 = 0;
        while (s>=20000){
        s = s-20000;
        count3++;
        } System.out.println(count3 + " uang Rp. 20.000");

        int count4 = 0;
        while (s>=10000){
        s = s-10000;
        count4++;
        } System.out.println(count4 + " uang Rp. 10.000");

        int count5 = 0;
        while (s>=5000){
        s = s-5000;
        count5++;
        } System.out.println(count5 + " uang Rp. 5.000");

        int count6 = 0;
        while (s>=2000){
        s = s-2000;
        count6++;
        } System.out.println(count6 + " uang Rp. 2.000");

        int count7 = 0;
        while (s>=1000){
        s = s-1000;
        count7++;
        } System.out.println(count7+ " uang Rp. 1.000");





    }
       
    
}
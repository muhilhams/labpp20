import java.util.Scanner;
public class TP05No03 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int day = scan.nextInt();
            System.out.print(myDay(day));
    }    
    public static String myDay(int day){
            int tahun = day/365;
            day-=tahun*365;
            int bulan = day/30;
            day = day%30;
            String str = tahun+" tahun\n"+bulan+" bulan\n"+day+" hari";
            return str;
    }
}

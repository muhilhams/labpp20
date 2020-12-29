import java.util.Scanner;

public class TP503 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        int ageInDays = ax.nextInt();
        myDay(ageInDays);
        ax.close();
    }
    public static void myDay(int ageInDays) {
        int tahun = 0, bulan = 0, hari = 0;
        while (ageInDays > 0){
            if (ageInDays >= 365){
                ageInDays -= 365;
                tahun++;
            } else if (ageInDays >= 30){
                ageInDays -= 30;
                bulan++;
            } else if (ageInDays < 30 && ageInDays >= 1){
                ageInDays--;
                hari++;
            }
        }
        System.out.println(tahun + " tahun");
        System.out.println(bulan + " bulan");
        System.out.println(hari + " hari");
    }
}

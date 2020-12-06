import java.util.Scanner;
public class Putri4 {
    public static void main(String[] args) {
        Scanner r = new Scanner (System.in);
        int hargaBarang = r.nextInt();
        int nilaiUang = r.nextInt();
        int kembalian = nilaiUang-hargaBarang;
       
        for (int i =1; i<=7; i++){
            int countUang = 0;
            int jumlahUang = 0;
            String besaranUang = "";
            switch (i){
                case 1:
                jumlahUang = 100000;
                besaranUang = "100.000";
                break;
                case 2:
                jumlahUang = 50000;
                besaranUang = "50.000";
                break;
                case 3:
                jumlahUang = 20000;
                besaranUang = "20.000";
                break;
                case 4:
                jumlahUang = 10000;
                besaranUang = "10.000";
                break;
                case 5:
                jumlahUang = 5000;
                besaranUang = "5.000";
                break;
                case 6:
                jumlahUang = 2000;
                besaranUang = "2.000";
                break;
                case 7:
                jumlahUang = 1000;
                besaranUang = "1.000";
                break;
            }
            countUang = kembalian/jumlahUang;
            kembalian -=  countUang * jumlahUang;
            System.out.println(countUang + " uang Rp. " + besaranUang);
        }
    
        
    }
    
    

    
}
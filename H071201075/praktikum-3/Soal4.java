import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        
        Scanner main = new Scanner (System.in);
       
        
                System.out.print("Harga Barang = ");
                int hargaBarang = main.nextInt();
        
                System.out.print("Jumlah Pembayaran = ");
                int jumlahPembayaran = main.nextInt();
        
                System.out.println(" ");
        
                int change = jumlahPembayaran - hargaBarang;
                int x = 0;//uang
                int y = 0;// sisa pengurangan
                int i = 1;
        
        
                //for(int i = 1; i <= 7; i++){
                    switch(i){
                        case 1:
                        x = change / 100000;
                        System.out.println(x + " uang 100000");
                       // break;
        
                        
                        case 2:
                        y = change - (x * 100000);
                        x = y / 50000;
                        System.out.println(x + " uang 50.000");
                       // break;
        
                        case 3:
                        y = y - (x*50000);
                        x = y / 20000;
                        System.out.println(x + " uang 20.000");
                       // break;
        
        
        
                        case 4:
                        y = y - (x * 20000);
                        x = y / 10000;
                        System.out.println(x + " uang 10.000");
                        break;
        
                        case 5:
                        y = y - (x * 10000);
                        x = y / 5000;
                        System.out.println(x + " uang 5.000");
                      //  break;
        
                        case 6:
                        y = y - (x * 5000);
                        x = y / 2000;
                        System.out.println(x + " uang 2.000");
                      //  break;
        
                        case 7:
                        y = y - (x * 2000);
                        x = y / 1000;
                        System.out.println(x + " uang 1.000");
                       // break;
        
                    }
        
                }
                
            }
        
    
        
    
    
    
    
    
    


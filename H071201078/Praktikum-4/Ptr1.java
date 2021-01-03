import java.util.Scanner;
class Ptr1{
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Bilangan Jumlah Bilangan Yang Diinginkan : ");
        int jumlahBilangan = input.nextInt();
        input.nextLine();
        int targetBilangan[] = new int[jumlahBilangan];
        for (int a = 0; a < jumlahBilangan; a++) {
            //System.out.print("Masukan Bilangan : ");
            targetBilangan[a] = input.nextInt();
        }

        // Logic
        for (int a = 0; a < targetBilangan.length - 1; a++) {
            for (int o = a + 1; o <= targetBilangan.length - 1; o++) {
                int result = 0;
                // Menentukan Bilangan FPB
                for (int c = 1; c <= targetBilangan[a]; c++) {
                    if (targetBilangan[a] % c == 0 && targetBilangan[o] % c == 0) {
                        result = c;
                    }
                }
                // Cetak Jika Relatif Prima
                if (result == 1) {
                    System.out.println(targetBilangan[a] + "  " + targetBilangan[o]);
                }
            }
        }
    }
}  
            
            

        
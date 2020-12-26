import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class No3 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        FileWriter dataWriter = null;
        PrintWriter printWriter = null;

        try{
            System.out.print("Nama File = ");
            String data = user.nextLine() + ".txt";
            System.out.print("Input Jumlah Asistensi yang diinput = ");
            int jumlahAsisten = user.nextInt();
            ArrayList<String> nama = new ArrayList<>();
            ArrayList<String> nim = new ArrayList<>();
            ArrayList<String> angkatan = new ArrayList<>();
            user.nextLine();

            int i;
            for (i = 0; i < jumlahAsisten; i++) {
                System.out.print("Nama = ");
                nama.add(user.nextLine());
                System.out.print("NIM = ");
                nim.add(user.nextLine());
                System.out.print("Angkatan = ");
                angkatan.add(user.nextLine());
            }
            dataWriter = new FileWriter (data);
            printWriter = new PrintWriter(dataWriter);
            printWriter.print("+-------------------------------------+--------------------+-----------+\n");
            printWriter.print("|Nama                                 |NIM                 |Angkatan   |\n");
            printWriter.print("+-------------------------------------+--------------------+-----------+\n");
            int j;
            for (j = 0; j < jumlahAsisten; j++) {    
                printWriter.printf("| %-35s | %-18s | %-8s  |\n", nama.get(j), nim.get(j), angkatan.get(j));
            }
            printWriter.print("+-------------------------------------+--------------------+-----------+\n");

        } catch (IOException ioe){
            System.out.println("Gagal");
        } finally {
            try {
                if (printWriter != null) {
                    System.out.println("Berhasil");
                    printWriter.close();
                } 
                if (dataWriter != null) {
                    dataWriter.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
} 

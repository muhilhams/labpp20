import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class Numtiga {
    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        FileWriter fileWrite = null;
        PrintWriter printWrite = null;

        try{
            String file = main.nextLine() + ".txt";
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> idnum = new ArrayList<>(); //idnum for nomor induk mahasiswa
            ArrayList<String> angkatan = new ArrayList<>();

            System.out.print("jumlah : ");
            int numberOfAssistance = main.nextInt();
            main.nextLine();

            for (int i = 0; i < numberOfAssistance; i++) {
                System.out.print("Nama Asistensi: ");
                name.add(main.nextLine());

                System.out.print("Nim : ");
                idnum.add(main.nextLine());

                System.out.print("Angkatan : ");
                angkatan.add(main.nextLine());
            }

            fileWrite = new FileWriter (file);
            printWrite = new PrintWriter(fileWrite);

            printWrite.printf("____________________________________________________________________\n");
            printWrite.printf("|NAMA                            |NIM                 |ANGKATAN      |\n");
            printWrite.printf("|________________________________|___________________________________|\n");
            
            for (int k = 0; k < numberOfAssistance; k++) {    
                printWrite.printf("| %-30s | %-18s | %-8s  |\n", name.get(k), idnum.get(k), angkatan.get(k));
            }
            printWrite.printf("____________________________________________________________________\n");

        } catch (IOException ioe){
            System.out.println("Gagal");
        } finally {
            try {
                if (printWrite != null) {
                    System.out.println("Berhasil");
                    printWrite.close();
                } 
                if (fileWrite != null) {
                    fileWrite.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
} 
    


import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class Soal3 {
    public static void main(String[] args) {
        Scanner rhm = new Scanner(System.in);
        FileWriter fileWrite = null;
        PrintWriter printWrite = null;

        try{
            String fileName = rhm.nextLine() + ".txt";
            ArrayList<String> nameList = new ArrayList<>();
            ArrayList<String> nimList = new ArrayList<>();
            ArrayList<String> angkatanList = new ArrayList<>();
            int numberAssistance = rhm.nextInt();
            rhm.nextLine();

            for (int i = 0; i < numberAssistance; i++) {
                System.out.print("Nama = ");
                nameList.add(rhm.next());
                System.out.print("Nim = ");
                nimList.add(rhm.next());
                System.out.print("Angkatan = ");
                angkatanList.add(rhm.next());
            }

            fileWrite = new FileWriter(fileName);
            printWrite = new PrintWriter(fileWrite);
            printWrite.printf("+----------------------+------------+-----------+\n");
            printWrite.printf("|NAMA                  |NIM         |ANGKATAN   |\n");
            printWrite.printf("+----------------------+------------+-----------+\n");
            for (int j = 0; j < numberAssistance; j++) {    
                printWrite.printf("| %-20s | %-10s | %-8s  |\n", nameList.get(j), nimList.get(j), angkatanList.get(j));
            }
            printWrite.printf("+----------------------+------------+-----------+\n");

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
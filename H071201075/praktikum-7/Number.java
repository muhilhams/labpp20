import java.util.ArrayList;
import java.util.Scanner;

public class Number {
  Scanner main = new Scanner(System.in);
  ArrayList<String> moviesName = new ArrayList<String>();
  ArrayList<String> rilisArray = new ArrayList<String>();
  ArrayList<String> timeArray = new ArrayList<String>();
  ArrayList<String> genreArray = new ArrayList<String>();
  ArrayList<String> sinopsisArray = new ArrayList<String>();
  ArrayList<String> castArray = new ArrayList<String>();

  public void deleteFilm(int i) {
    System.out.println();
    moviesName.remove(i);
    sinopsisArray.remove(i);
    castArray.remove(i);
    genreArray.remove(i);
    timeArray.remove(i);
    rilisArray.remove(i);
  }

  public void addFilm() {
    String newString;

    System.out.println();

    System.out.print("Judul film: ");
    String nama = new String(main.nextLine());
    moviesName.add(nama);

    System.out.print("Tahun rilis: ");
    newString = main.nextLine();
    rilisArray.add(newString);

    System.out.print("Durasi: ");
    newString = main.nextLine();
    timeArray.add(newString);

    System.out.print("Genre: ");
    newString = main.nextLine();
    genreArray.add(newString);

    System.out.print("Sinopsis: ");
    newString = main.nextLine();
    sinopsisArray.add(newString);

    System.out.print("Cast: ");
    newString = main.nextLine();
    castArray.add(newString);

    System.out.println("\nadded successfully!");
  }


  public void searchFilm(String s) {
    boolean ada = false;
    System.out.println();
    for (int a = 0; a< rilisArray.size(); a++) {
      if (moviesName.get(a).indexOf(s) >= 0) {
        System.out.println("----Film ditemukan----\n movie that you search is :" + moviesName.get(a));
        ada = true;
        break;
      }
    }
    if (ada == false)
      System.out.println(" the movie  " + s + " not found!\n Please check your input!");
  }

  public void showFilmDetail(int i) {
    System.out.println();
    System.out.println("Judul    :" + moviesName.get(i));
    System.out.println("Rilis    :" + rilisArray.get(i));
    System.out.println("Durasi   :" + timeArray.get(i));
    System.out.println("Genre    :" + genreArray.get(i));
    System.out.println("Sinopsis :" + sinopsisArray.get(i));
    System.out.println("Cast     :" + castArray.get(i));
  }
  public void startProg() {

    while (true) {
      String command = "";
      System.out.println();
      System.out.println("------------------------");
      System.out.println("    Favourite Movie     ");
      System.out.println("------------------------");
      if (moviesName.isEmpty()) {
        System.out.println("empty\n\n");
      }
      for (int i = 0; i < moviesName.size(); i++) {
        System.out.println(i + 1 + ". " + moviesName.get(i));

      }

      System.out.println("\nMENU PILIHAN :");
      System.out.println("1. d(Detail) <spasi> number of movie");
      System.out.println("2. s(Search) <spasi> name of movie");
      System.out.println("3. a(Add)");
      System.out.println("4. r(Remove) <spasi> number of movie");
      System.out.println("5. e(Exit)");

      System.out.print("your input: ");
      command = main.nextLine();

      
      if (command.length() > 2 && command.substring(0, 2).equalsIgnoreCase("s ")) {
        searchFilm(command.substring(2));
      } else if (command.length() > 2 && command.substring(0, 2).equalsIgnoreCase("d ") && Character.isDigit(command.charAt(2))) {
        showFilmDetail(Character.getNumericValue(command.charAt(2) - 1));
      } else if (command.length() > 2 && command.substring(0, 2).equalsIgnoreCase("r ") && Character.isDigit(command.charAt(2))) {
        deleteFilm(Character.getNumericValue(command.charAt(2) - 1));
      } else if (command.length() == 1 && command.charAt(0) == 'a') {
        addFilm();
      }else if (command.equalsIgnoreCase("e")){
        return;
      }
      
    }
  }
    
  public static void main(String[] args) {
    Number test = new Number();
    test.startProg();
}

  
  }


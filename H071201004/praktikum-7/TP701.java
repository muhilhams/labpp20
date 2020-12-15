import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TP701 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        ArrayList<String> title = new ArrayList<String> (Arrays.asList("La La Land", "Wreck-It Ralph", "Architecture 101"));
        ArrayList<String> date = new ArrayList<String> (Arrays.asList("9 November 2016", "9 November 2012", "22 Maret 2012"));
        ArrayList<String> genre = new ArrayList<String> (Arrays.asList(
            "Romance, Musical, Drama",
            "Animation, Fantasy, Comedy",
            "Drama, Romance, Melodrama"
        ));
        ArrayList<String> sinopsis = new ArrayList<String> (Arrays.asList(
            "Berkisah tentang seorang musisi dan calon aktris yang bertemu dan jatuh cinta di LA",
            "Menceritakan penjahat di video game yang ingin menjadi pahlawan namun malah merusak dunia game lain",
            "Berkisah tentang bagaimana rasanya menemukan kembali cinta pertama yang hilang sekian lama"
        ));
        ArrayList<String> waktu = new ArrayList<String> (Arrays.asList("2 jam 8 menit", "1 jam 48 menit", "1 jam 58 menit"));
        ArrayList<String> cast = new ArrayList<String> (Arrays.asList(
            "Ryan Gosling, Emma Stone, John Legend",
            "John C. Reilly as 'Ralph', Sarah Silverman as 'Vanellope von Schweetz, Jack McBrayer as 'Fix-It Felix",
            "Bae Suzy, Han Ga-In, Lee Je-hoon"
        ));
        while(true){
            System.out.println("Film favorit");
            for (int i = 0; i < title.size(); i++){
                System.out.printf("%d. ", (i+1));
                System.out.println(title.get(i));
            }

            System.out.println("(d)detail (s)search (a)add (r)remove");
            String input = ax.next();
            if (input.equals("d")){
                int nomor = ax.nextInt();
                title(input, nomor, title);
                date(input, nomor, date);
                genre(input, nomor, genre);
                sinopsis(input, nomor, sinopsis);
                waktu(input, nomor, waktu);
                cast(input, nomor, cast);
            } else if (input.equals("r")){
                int nomor = ax.nextInt();
                title = title(input, nomor, title);
                date = date(input, nomor, date);
                genre = genre(input, nomor, genre);
                sinopsis = sinopsis(input, nomor, sinopsis);
                waktu = waktu(input, nomor, waktu);
                cast = cast(input, nomor, cast);
            } else if (input.equals("a")){
                System.out.println("Masukkan data");
                title = title(input, 0, title);
                date = date(input, 0, date);
                genre = genre(input, 0, genre);
                sinopsis = sinopsis(input, 0 ,sinopsis);
                waktu = waktu(input, 0, waktu);
                cast = cast(input, 0, cast);
            } else if (input.equals("s")){
                String keyword = ax.nextLine();
                String search = searching(keyword, title);
                if (search.equals("")){
                    System.out.println("404 not found");
                } else {
                    for (int i = 0; i <title.size(); i++){
                        if (search.equals(title.get(i))){
                            input = "d";
                            title(input, i+1, title);
                            date(input, i+1, date);
                            genre(input, i+1, genre);
                            sinopsis(input, i+1, sinopsis);
                            waktu(input, i+1, waktu);
                            cast(input, i+1, cast);
                        }
                    }
                }
            } else if (input.equals("stop")){
                return;
            }
        ax.close();
        }
    }

    static ArrayList<String> title(String b, int a, ArrayList<String> c) {
        Scanner ax = new Scanner(System.in);
        ArrayList<String> title = c;
        if (b.equals("d")){
            System.out.println("Judul: " + title.get(a-1));
        } else if (b.equals("r")){
            title.remove(a-1);
        } else {
            System.out.print("Judul: ");
            String add = ax.nextLine();
            title.add(add);
        }
        ax.close();
        return title;
    }

    static ArrayList<String> date(String b, int a, ArrayList<String> c) {
        Scanner ax = new Scanner(System.in);
        ArrayList<String> date = c;
        if (b.equals("d")){
            System.out.println("Rilis: " + date.get(a-1));
        } else if (b.equals("r")){
            date.remove(a-1);
        }  else {
            System.out.print("Rilis: ");
            String add = ax.nextLine();
            date.add(add);
        }
        ax.close();
        return date;
    }

    static ArrayList<String> genre(String b, int a, ArrayList<String> c) {
        Scanner ax = new Scanner(System.in);
        ArrayList<String> genre = c;
        if (b.equals("d")){
            System.out.println("Genre: " + genre.get(a-1));
        } else if (b.equals("r")){
            genre.remove(a-1);
        } else {
            System.out.print("Genre: ");
            String add = ax.nextLine();
            genre.add(add);
        }
        ax.close();
        return genre;
    }

    static ArrayList<String> sinopsis(String b, int a, ArrayList<String> c) {
        Scanner ax = new Scanner(System.in);
        ArrayList<String> sinopsis = c;
        if (b.equals("d")){
            System.out.println("Sinopsis: " + sinopsis.get(a-1));
        } else if (b.equals("r")){
            sinopsis.remove(a-1);
        } else {
            System.out.print("Sinopsis: ");
            String add = ax.nextLine();
            sinopsis.add(add);
        }
        ax.close();
        return sinopsis;
    }

    static ArrayList<String> waktu(String b, int a, ArrayList<String> c) {
        Scanner ax = new Scanner(System.in);
        ArrayList<String> waktu = c;
        if (b.equals("d")){
            System.out.println("Durasi: " + waktu.get(a-1));
        } else if (b.equals("r")){
            waktu.remove(a-1);
        } else {
            System.out.print("Durasi: ");
            String add = ax.nextLine();
            waktu.add(add);
        }
        ax.close();
        return waktu;
    }

    static ArrayList<String> cast(String b, int a, ArrayList<String> c) {
        Scanner ax = new Scanner(System.in);
        ArrayList<String> cast = c;
        if (b.equals("d")){
            System.out.println("Cast: " + cast.get(a-1));
        } else if (b.equals("r")){
            cast.remove(a-1);
        } else {
            System.out.print("Cast: ");
            String add = ax.nextLine();
            cast.add(add);
        }
        ax.close();
        return cast;
    }

    public static String searching(String b, ArrayList<String> c) {
        Scanner ax = new Scanner(System.in);
        ArrayList<String> check = c;
        ArrayList<String> xyz = new ArrayList<>();
        int count = 0;
        for(String o : check){
            if(o.contains(b)){
               xyz.add(o);
               System.out.printf("%d. %s\n", count + 1, xyz.get(count));
               count++;
            }
        }

        String s = "";
        if (xyz.size() > 0){
            System.out.println("Input angka untuk melihat detail");
            int choice = ax.nextInt();
            s = xyz.get(choice-1);
        }
        ax.close();
        return s;
    }
    
}
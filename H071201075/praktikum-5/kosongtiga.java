import java.util.ArrayList;
import java.util.Arrays;
public class kosongtiga {
    public static void main(String[] args) {
        ArrayList<String> aku = new ArrayList<>();
        aku.add("indah");
        aku.add("miko");
        aku.add("tenri");
        aku.add("nunu");

        System.out.println("access");
        for (int i = 0 ; i <aku.size(); i++){
            System.out.println(aku.get(i));
        }
        aku.add("yann");
        System.out.println("added");
        System.out.println(aku);

        aku.remove("Nunu");
        System.out.println("removed");
        System.out.println(aku);

        boolean find = aku.contains("yann");
        System.out.println("finded");
        System.out.println(find);
    }

    
}

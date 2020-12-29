import java.util.HashSet;
import java.util.Arrays;
import java.util.HashMap;
class kosongdua {
    public static void main(String[] args) {
        HashMap<String, String>  name = new HashMap<>();
        name.put("A", "Andri");
        name.put("Q", "Qila");
        name.put("M", "Mufti");
        name.put("I", "Indah");

        System.out.println(" access");
        for (String key : name.keySet()) {
            System.out.println(name.get(key));
        }
        name.put("Y", "yann");
        System.out.println(" added");
        System.out.println(name);

        name.remove("M");
        System.out.println("removed");
        System.out.println(name);

        boolean find = name.containsKey("Y");
        System.out.println("searching");
        System.out.println(find);
    }
}

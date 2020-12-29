import java.util.HashSet;
import java.util.Arrays;

 class kosongsatu {
    
    public static void main(String[] args) {
        HashSet<String> name = new HashSet();
        name.add("andri");
        name.add("Indah");
        name.add("Qila");
        name.add("Mufti");
        name.add("Nunu");

        System.out.println("accessed");
        System.out.println(name);

        name.add("yann");
        System.out.println("added");
        System.out.println(name);

        name.remove("Nunu");
        System.out.println("removed");
        System.out.println(name);

        boolean find = name.contains("yann");
        System.out.println("finded");
        System.out.println(find);

    }
}




package day_3;

public class removeSpacesStr {
    public static void main(String[] args) {
        System.out.println(spaceRemove("Timur      Sulaimanov"));
        System.out.println(spaceRemove("   Timur     21321 3  Sulaimanov"));
        System.out.println(spaceRemove("  Timur      Sulaimanov "));
        System.out.println(spaceRemove("T"));
    }


    private static String spaceRemove(String str){
        str = str.trim();
        while (str.contains("  ")){
            str=str.replace("  ", " ");
        }
        return str;
    }
}

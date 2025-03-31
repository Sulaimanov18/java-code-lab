package day_3;

public class removeSpacesStr {
    public static void main(String[] args) {
        System.out.println(spacceRemove("Timur      Sulaimanov"));
        System.out.println(spacceRemove("   Timur     21321 3  Sulaimanov"));
        System.out.println(spacceRemove("  Timur      Sulaimanov "));
        System.out.println(spacceRemove("T"));
    }


    private static String spacceRemove(String str){
        str = str.trim();
        while (str.contains("  ")){
            str=str.replace("  ", " ");
        }
        return str;
    }
}

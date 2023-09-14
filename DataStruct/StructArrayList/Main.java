package DataStruct.StructArrayList;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
        
        ArrayList<String> listName = new ArrayList<String>();

        listName.add("str1");
        listName.add("str2");

        String element = listName.get(0);
        System.out.println(element);

        for (String string : listName) {
           System.out.println(string);
        }

        listName.set(1, "str4");

        listName.remove(0);

        for (String string : listName) {
           System.out.println(string);
        }
    }
}

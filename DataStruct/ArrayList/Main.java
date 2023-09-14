package DataStruct.ArrayList;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();

    arrayList.add("arr1");
    arrayList.add("arr2");
    arrayList.add("arr3");

    for (String string : arrayList) {
      System.out.println(string);
    }
  }
}

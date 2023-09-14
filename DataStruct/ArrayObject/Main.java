package DataStruct.ArrayObject;

public class Main {
  public static void main(String[] args) {
    ObjectModel[] arr = new ObjectModel[5];

    arr[0] = new ObjectModel("A");
    arr[1] = new ObjectModel("B");
    arr[2] = new ObjectModel("C");

    // Enhanced (Modified) For Loop for Array Iteration in Java -> Foreach
    for (ObjectModel objectModel : arr) {
      if (objectModel != null) {
        System.out.println(objectModel.toString());
      }
    }
  }
}

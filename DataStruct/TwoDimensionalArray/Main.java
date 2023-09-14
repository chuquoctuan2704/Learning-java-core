package DataStruct.TwoDimensionalArray;

public class Main {
  public static void main(String[] args) {
    int[][] arr2Dim = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    for (int i = 0; i < arr2Dim.length; i++) {
      for (int j = 0; j < arr2Dim[i].length; j++) {
        System.out.print(arr2Dim[i][j] + "   ");
      }
      System.out.println();
    }

    System.out.println("-----------");

    int[][] arr2Dim2 = new int[2][3];

    arr2Dim2[0][0] = 1;
    arr2Dim2[0][1] = 2;
    arr2Dim2[0][2] = 3;
    arr2Dim2[1][0] = 4;
    arr2Dim2[1][1] = 5;
    arr2Dim2[1][2] = 6;

    for (int i = 0; i < arr2Dim2.length; i++) {
      for (int j = 0; j < arr2Dim2[i].length; j++) {
        System.out.print(arr2Dim2[i][j] + "   ");
      }
      System.out.println();
    }
  }
}

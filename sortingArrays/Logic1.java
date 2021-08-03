import java.util.Arrays;

class Logic1 {
  public static void main(String[] args) {
      int A[] = {20,30,60,0,10};
      System.out.println("Unsorted Array : " +Arrays.toString(A));
         Arrays.parallelSort(A);
         System.out.println("Sorted Array : " +Arrays.toString(A));
       }
  }    


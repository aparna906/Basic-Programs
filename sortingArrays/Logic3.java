import java.util.Arrays;
import java.util.Collections;

class Logic3 {
    public static void main(String[] args) {
        Integer Arr[] = {30,50,10,20,40}; 
        System.out.println("Unsorted Array : " +Arrays.toString(Arr));
        Arrays.sort(Arr,Collections.reverseOrder());
        System.out.println("Sorted Array : " +Arrays.toString(Arr));
    }
  
     
}

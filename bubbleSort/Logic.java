import java.util.Arrays;
class Logic {
 public static void main(String[] args) {
     int arr[] = {2,3,8,1,6,25};
     int num = arr.length-1;

     System.out.println("UnSorted Elements : " +Arrays.toString(arr));

     for(int i=0;i<num;i++){
         for(int j=0;j<num;j++){
                if(arr[j]>arr[j+1]){
                 int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
             }
         }
     }
     System.out.println("Sorted Elements : " +Arrays.toString(arr));
 }    
}

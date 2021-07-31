import java.util.Arrays;

class Logic1 {
 public static void main(String[] args) {
     int a[] = {1,2,3,4,5,6};
     int b[] = {1,2,3,4,5,6};
      
     boolean result = Arrays.equals(a,b);
     if(result == true){
       System.out.println("Arrays are Equal");
     }
     else{
         System.out.println("Arrays are Not Equal");
     }
 }
}

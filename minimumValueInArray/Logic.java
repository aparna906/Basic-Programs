class Logic {
 public static void main(String[] args) {
     int arr[] ={4,10,60,30,8};
     int min = arr[0];
     for(int i=1;i<arr.length;i++){
         if(arr[i]<min){
             min = arr[i];
         }
     }
     System.out.println("Minimum Array is : " +min);
 }    
}

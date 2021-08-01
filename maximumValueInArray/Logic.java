class Logic {
 public static void main(String[] args) {
     int a[] = {50,60,100,2,30,70};
     int max = a[0];
     for(int i=1;i<a.length;i++){
         if(a[i]>max){
           max = a[i];
         }
     }
     System.out.println("Maximum Value Is : " +max);
 }    
}

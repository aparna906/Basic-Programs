class Logic {
 public static void main(String[] args) {
     int a[] = {30,40,50,10,20};
     int search = 40;
     int sort = 0;
    System.out.println("Sorted Elements  : "); 
     for(int i=0;i<a.length;i++){
         for(int j=i+1;j<a.length;j++){
             if(a[i]>a[j]){
                 sort = a[i];
                 a[i] = a[j];
                 a[j] = sort;
                
             }
         }
         System.out.print(" " +a[i]); 
     }
     
    int l = 0;
    int h = a.length-1;
    boolean flag = false;

    while(l<=h){
       int m = (l+h)/2;

        if(a[m]==search){
            System.out.println(" "); 
          System.out.println("Element found of index Number : " +m);
          flag = true;
          break;
        }
   
         if(a[m]<search){
             l = m+1;
         }

         if(a[m]>search){
             h = m-1;
         }
   }
   if(flag==false){
       System.out.println("Element not found");
   }    
}
}
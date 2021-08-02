class Logic1 {
   public static void main(String[] args) {
       int Arr[] = {10,20,30,60,70};
       
       boolean flag =false;
       int l = 0;
       int h = Arr.length-1;
       int Search = 10;

       while(l<=h){
         int m = (l+h)/2;

          if(Arr[m]==Search){
              System.out.println(m+ " Position Element Found. ");
              flag = true;
              break;
          }

          if(Arr[m] < Search){
              l = m + 1;
          }

          if(Arr[m] > Search) {
              h = m - 1;
          }

       }

       if(flag == false){
           System.out.println("Element Not Found");
       }
   }    
}

class Logic1 {
   public static void main(String[] args) {
       int no = 3;
       int count =0;
       if(no>1){
           for(int i=1;i<=no;i++){
               if(no%i==0)
                 count++;
               }

               if(count==2){
                   System.out.println("Number is Prime");
               }
               else{
                   System.out.println("Number is Not Prime");
               }
           }
       
       else{
        System.out.println("Number is Not Prime");
       }
   }    
}

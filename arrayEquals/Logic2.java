class Logic2 {
   public static void main(String[] args) {
       int a[] = {1,2,3,4,5,6};
       int b[] = {1,2,3,4,55,6};
       boolean res = true;

       if(a.length == b.length)
       {
             
            for(int i=0; i<a.length;i++){
                  if(a[i] != b[i]){
                    res = false;
                  }
               }
        }

       else {
          res = false;
         }
       
        if(res == true){
            System.out.println("Array are Equal");
        }
        else{
            System.out.println("Arrays are Not Equal");
        }

       }

   }    

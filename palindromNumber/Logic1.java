class Logic1 {
   public static void main(String[] args) {
       int number = 121212;
       int temp = number;
       int Reverse = 0;
       while(number!=0){
           Reverse = Reverse*10 + number%10;
           number = number/10;
       }
       if(temp==Reverse){
           System.out.println("Palindrom");
           
       }
      else{
           System.out.println("Not Palindrom");
       }
   }    
}

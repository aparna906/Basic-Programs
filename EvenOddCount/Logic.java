
class Logic {
   public static void main(String[] args) {
       int number = 2145691;
       int Evencount = 0;
       int Oddcount = 0;
       while(number>0){
           int rem = number%10;
           if(rem%2==0){
            Evencount++;
           }
           else{
            Oddcount++;
           }
           number = number/10;
       }
       System.out.println("Even Number : " +Evencount);
       System.out.println("Odd Number : " +Oddcount);
   } 
}

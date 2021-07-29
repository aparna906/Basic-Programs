class Logic {
 public static void main(String[] args) {
     int No1 = 0;
     int No2 = 1;
     int Sum = 0;
     System.out.print(No1 +" " +No2);
     for(int i=1;i<=10;i++){
         Sum = No1 + No2;
         System.out.print(" " +Sum);
         No1 = No2;
         No2 = Sum;
     }
     
 }    
}

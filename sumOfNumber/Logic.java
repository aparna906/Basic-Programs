class Logic {
  public static void main(String[] args) {
      int Number = 123436;
      int sum = 0;
      while(Number>0){
          sum = sum + Number%10;
          Number = Number/10;
      }
      System.out.println("Sum of Digit : " +sum);
  }    
}

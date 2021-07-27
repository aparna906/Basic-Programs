class Logic1 {
  public static void main(String[] args) {
      int Number = 85641239;
      int count = 0;
      while(Number>0){
          Number = Number/10;
          count++;
      }
      System.out.println(count);
  }    
}

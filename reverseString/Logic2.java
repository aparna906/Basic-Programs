class Logic2 {
  public static void main(String[] args) {
      String Name = "ABCDEFG";
      String Reverse =" ";

      char array[] = Name.toCharArray();
      int length = array.length;
      System.out.println("String length : " +length );

      for(int i=length-1;i>=0;i--){
         Reverse = Reverse + array[i];
      }
    System.out.println(Reverse);

  }    
}

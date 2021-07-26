class Logic1 {
  public static void main(String[] args) {
      String Name = "MADAM";
      String Temp = Name;
      String rev =" ";
      int len = Name.length();
      for(int i=len-1;i>=0;i--){
          rev = rev + Name.charAt(i);
      }
      if(Temp.equals(rev)){
          System.out.println("String Palindrom");
      }
      else{
          System.out.println("String not Palindrom");
      }
  }    
}

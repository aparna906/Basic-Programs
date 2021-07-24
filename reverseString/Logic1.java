class Logic1 {
    public static void main(String[] args) {
        String Name= "ANEETA";
        String Reverse = " ";
        int length = Name.length();
       
        //If you want 
        System.out.println("String lenght : " +length);
          for(int i=length-1;i>=0;i--)
          {
            Reverse = Reverse + Name.charAt(i);
          }
            System.out.println(Reverse);
    }
}

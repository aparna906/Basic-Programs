class Logic {
   public static void main(String[] args) {
       String Str = "I $%%$@ am Aparna )(* Misar";
       String Str1 =  Str.replaceAll("[^a-zA-z0-9]", "");
       System.out.println(Str1);
   }    
}

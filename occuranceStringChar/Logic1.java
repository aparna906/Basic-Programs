class Logic1{
    public static void main(String[] args) {
        String S = "Hii aparna, What's going on";
        int Count = 0;
        int Total_String = S.length();
             int Replace =  S.replaceAll("a", "").length();
                   Count =  Total_String - Replace ;

                   System.out.println("a occursnce of " +Count + " times");
    }
} 
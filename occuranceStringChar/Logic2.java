class Logic2 {
   public static void main(String[] args) {
    char C;
    int count;
    String s = "Hii I am Aparna Misar";
    s = s.toLowerCase();
    for (C = 'a'; C <= 'z'; C++) {
        count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == C) {
                count++;
            }
        }
        System.out.println("Number of occurences of " + C + " is " + count);


    }
   }  
}  


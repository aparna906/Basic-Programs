class Logic2 {
    public static void main(String[] args) {
        // Using StringBuffer
        int Number = 87945;
           StringBuffer st = new StringBuffer(String.valueOf(Number));
           StringBuffer Reverse = st.reverse();
           System.out.println(Reverse);
 
        /* Direct print
             int Number = 87945;
             StringBuffer st = new StringBuffer(String.valueOf(Number));
             System.out.println(st.reverse());*/
    }
     

}

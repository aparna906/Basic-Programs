class Logic2 {
    public static void main(String[] args) {
        int A[] = {4,5,9,8,2,3};

        System.out.println("Even Numbers : ");

        for(int value:A){
            if(value % 2 == 0)
           System.out.println(value);
        }

        System.out.println("Odd Numbers : ");

        for(int value:A){
            if(value % 2 != 0)
           System.out.println(value);
        }
    }
}

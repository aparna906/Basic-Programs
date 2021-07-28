class Logic1 {
    public static void main(String[] args) {
        int a = 1063;
        int b = 2002;
        int c =30;
        if(a>b && a>c){
            System.out.println("a = " +a+ " is Largest Number");
        }
        else if(b>a && b>c){
            System.out.println("b = " +b+ " is Largest Number");
        }
        else{
            System.out.println("c = " +c+ " is Largest Number");
        }
    }    
}

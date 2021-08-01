class Logic1 {
public static void main(String[] args) {

    String a[] = {"Aparna" , "Arpan", "Akshita" ,"Aparna"};
    boolean flag = false;

    for(int i=0;i<a.length;i++){

        for(int j=i+1;j<a.length;j++){

            if(a[i] == a[j]){

                System.out.println("Duplicate String is  :  " +a[i]);
                flag = true;
            }
        }
    }

    if(flag==false){
        System.out.println("Not found Duplicate String "); 
    }
   
}    
}

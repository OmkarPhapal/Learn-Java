public class WhileLoop {
    
    public static void main(String args[]){

        // While loop
        // int i = 1;

        // while (i <= 4){
        //     System.out.println("Hii " + i);
        //     i++;
        // }


        // Nested while

        int i = 1;
        while (i <= 4){
            System.out.println("Hii " + i);

            int j = 1;
            while(j <= 3){
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }

        System.out.println("Bye " + i);

    }
}

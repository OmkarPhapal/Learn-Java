public class ForLoop {
    public static void main(String s[]){
        //For Loop

        // Print numbers from 0 to n 
        // int n = 10;
        // for (int i = 0; i < n; i++){
        //     System.out.println(i);
        // }

        
        // Print numbers from n to 0
        // int n = 10; 
        // for (int i = n; i > 0; i--){
        //     System.out.println("Hii " + i);
        // }


        // Nested For - Ex
        for (int i = 1; i <= 5; i++){
            System.out.println("Day :" + i);

            for (int j = 9; j <= 18; j++){
                System.out.println("Hour : " + j);
            }
        }

    }
}

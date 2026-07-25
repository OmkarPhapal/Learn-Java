public class ElseIf {

    public static void main(String[] args) {

        // max of three numbers
        int a = 60, b = 70, c = 80;

        if (a > b && a > c){
            System.out.println(a);
        }else if(b > c) {
            System.out.println(b);
        }else{
            System.out.println(c);
        }
        
    }
}

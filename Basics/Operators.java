public class Operators {
    
    public static void main(String args[]){

        // Arithmatic Operators (+, -, *, /, %, ++, --, **)

        // int num1 = 7;
        // int num2 = 5;

        // int add  = num1 + num2;         //Addition
        // int sub  = num1 - num2;         //Subtraction
        // int multi  = num1 * num2;       //Multiplication
        // int div  = num1 / num2;         //Division
        // int modularDiv  = num1 % num2;  //Modular Division
        
        // num1 = num1 + 1;
        // num1 += 1;
        // num1++;         //Post - increment
        // ++num1;         //Pre - increment

        // int res = num1++;   // Fetch the value and then increment
        // int res = ++num1;   // Increment and then fetch the value

        // System.out.println(res);


        // Relational operators (<, >, <=, >=, ==, !=)
        // int x = 5;
        // int y = 6;
        // System.out.println(x < y);
        // System.out.println(x > y);
        // System.out.println(x <= y);
        // System.out.println(x >= y);
        // System.out.println(x == y);
        // System.out.println(x != y);


        // Logical operators (&&, ||, !)
        // int x = 7;
        // int y = 5;
        // int a = 5;
        // int b = 9;

        // // boolean r = x > y && a > b;     //if both conditions are true then only output is true
        // boolean r = x > y || a > b;     //if any of the condition get true it will print true
        // System.out.println(r);
        // System.out.println(!r);


        // Ternary Operator (?:)
        int n = 8;
        int result = 0;

        // if (n % 2 == 0)
        //     result = 10;
        // else
        //     result = 20;

        // with the help of ternary operator

        result = n%2==0 ? 10 : 20;
        System.out.println(result);
    }
}

import java.util.Scanner;

class HelloWorld{
    public static void main(String[] args) {
        System.out.print("HelloWorld");
    }
}

class AddingTwoIntegers {
    public static void main(String[] args) {
        System.out.println("Adding two Integers");
        int a = 23;
        System.out.println("The first integer: "+a);
        int b = 45;
        System.out.println("The second integer:"+b);
        int c = a + b;
        System.out.println("The sum two integers: "+c);
    }
}

// Taking input from the user:

class InputUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String str = sc.next();
        // System.out.print(str);
        System.out.print("Good Morning, " + str);
        sc.close();
    }
}
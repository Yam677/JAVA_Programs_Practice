import java.util.Scanner;

public class Program2 {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String input1 = scanner.nextLine();
        System.out.println("My name is: " +input1);
        System.out.println("Enter your age");
        int input2 = scanner.nextInt();
        System.out.println("Hello, "+ input1 +" you are " + input2);
        scanner.close();
    }
}

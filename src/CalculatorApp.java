import java.util.Scanner;
public class CalculatorApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to a Simple Calculator which has following functions\n");
        System.out.println("1.Basic calculations + - / % * ");
        System.out.println("2.Square root");
        System.out.println("3.Factorial");
        System.out.println("4.Power");
        System.out.println("");
        System.out.println("* Keep the history");
        System.out.println("* Save the history to a file.");
        System.out.println("* Print the history from a file.");

        System.out.println("");
        System.out.println("Enter the expression or command");
        System.out.println("Example 1 : 5 * 2 ");
        System.out.println("Example 2 : sqrt 5 ");
        String input = sc.nextLine().trim();
        


        
    }
}

import java.util.Scanner;
class Calculator{

}
public class CalculatorApp {
    public static void main(String[] args){
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to a Simple Calculator which has following functions\n");
        System.out.println("1.Basic calculations + - / % * ");
        System.out.println("2.Square root");
        System.out.println("3.Factorial");
        System.out.println("4.Power\n");

        System.out.println("* Save the history");
        System.out.println("* Save the history to a file.\"save\"");
        System.out.println("* Print the history from a file. \"history\"\n");

        System.out.println("* Enter \"quit\" to exit from the calculator.\n");
        
        boolean status = true;

        while(status){

            System.out.println("Enter the expression or command");
            System.out.println("Example 1 : 5 * 2 ");
            System.out.println("Example 2 : sqrt 5 ");
            String input = sc.nextLine().trim();
            
            if(input.equalsIgnoreCase("quit")){
                status = false;
                continue;
            }
            if(input.equalsIgnoreCase("history")){

            }

        }
        

        
    }
}

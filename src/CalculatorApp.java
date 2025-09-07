import java.util.Scanner;
import java.lang.Exception;

class Calculator{
    
    public double calculate(double n1,char o,double n2)throws Exception{
        double res;
        switch(o){
            case '+': res = n1 + n2;break;
            case '-': res = n1 - n2;break;
            case '*': res = n1 * n2;break;
            case '%':
                if(n2==0)throw new ArithmeticException("Division by Zero");
                res = n1%n2;
                break;
            case '/':
                if(n2==0)throw new ArithmeticException("Division by Zero");
                res = n1/n2;
                break;
            default:
                throw new Exception("Invalid OPerator!");
        }
        return res;
    }

}
public class CalculatorApp {
    public static void main(String[] args){

        String bold = "\033[1m";
        String italic = "\033[3m";
        String reset = "\033[0m";

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
            try{
                System.out.println("Enter the expression or command");
                System.out.println("Example 1 : 5 * 2 ");
                System.out.println("Example 2 : sqrt 5 ");
                String input = sc.nextLine().trim();
                
                if(input.equalsIgnoreCase("quit")){
                    status = false;
                    continue;
                }

                //basic operations
                String[] parts = input.split(" ");
                if(parts.length!=3){
                    System.out.println("Invalid format!  ");
                    System.out.println(bold+italic+"(hint: 2 operands and 1 operator with spaces or command and operands with spaces)"+reset+"\n");
                    continue;
                }
                double n1 = Double.parseDouble(parts[0]);
                double n2 = Double.parseDouble(parts[2]);
                char o = parts[1].charAt(0);
                double result = c.calculate(n1, o, n2);
                System.out.println("Result = "+result+"\n");
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }

        }
        
        System.out.println(bold+italic+"Thank you!"+reset);
        sc.close();
    }
}

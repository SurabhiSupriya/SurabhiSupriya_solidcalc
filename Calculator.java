 import java.util.Scanner;
 //here class Calculator only do operation of calculator i.e one job so Single responsibility is valued
public class Calculator {
    void arithematic(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /,%): ");
        char operator = sc.next().charAt(0);
        double result;
        //If we want to add any other operation we can just add without modification so open closed principle is valued
        switch(operator)
        {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
             case '%':
                result = first % second;
                 break;
               default:
                System.out.printf("Error! operator is not correct");
          return;
        }
        //here class Calculator is  dependent on Mainclass hence dependency inversion
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
        //DRY exists as there is no repetation of any line of code
    }
}

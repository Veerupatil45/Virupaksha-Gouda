import java.util.Scanner;
class problem1{
    double a;
    double b;
    String operation;

    problem1(double a, double b, String operation){
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }
    public void calculate(double a, double b, String operation){
        switch(operation){
            case "addition":
                System.out.println("Addition of "+ a+" and "+b+" is "+(a+b));
                break;
            case "substraction":
                System.out.println("Substraction of "+a+" and "+b+" is "+(a-b));
                break;
            case "multiplication":
                System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
                break;
            case "division":
                System.out.println("Division of "+a+" and "+b+" is "+(a/b));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = sc.nextDouble();
        System.out.println("Enter the second number");
        double b = sc.nextDouble();
        System.out.println("Enter the operation");
        String operation = sc.next();
        problem1 obj = new problem1(a, b, operation);
        obj.calculate(a, b, operation);
    }
}
import java.util.Scanner;

public class main {

  public static void main(String args[]) {

    Scanner myObj = new Scanner(System.in);

    System.out.println("Please select addition, subtraction, multiplication, division, fibonacciNumberFinder or intToBinaryNumber. Type exit to exit.");
    String line = myObj.nextLine();

    String[] splited = line.split("\\s+");

    String userCommand = splited[0];

    Calculator calculator = new Calculator();
    while(!userCommand.equals("exit")) {

      if (userCommand.equals("addition")) {
        int number1=Integer.parseInt(splited[1]);
        int number2=Integer.parseInt(splited[2]);
        System.out.println(calculator.add(number1, number2));
      } else if (userCommand.equals("subtraction")) {
        int number1=Integer.parseInt(splited[1]);
        int number2=Integer.parseInt(splited[2]);
        System.out.println(calculator.subtract(number1, number2));
      } else if (userCommand.equals("multiply")) {
        int number1=Integer.parseInt(splited[1]);
        int number2=Integer.parseInt(splited[2]);
        System.out.println(calculator.multiply(number1, number2));
      } else if (userCommand.equals("divide")) {
        int number1=Integer.parseInt(splited[1]);
        int number2=Integer.parseInt(splited[2]);
        System.out.println(calculator.divide(number1, number2));
      } else if (userCommand.equals("fibonacciNumberFinder")) {
        int number1=Integer.parseInt(splited[1]);
        System.out.println(calculator.fibonacciNumberFinder(number1));
      } else if (userCommand.equals("intToBinaryNumber")) {
        int number1=Integer.parseInt(splited[1]);
        System.out.println(calculator.intToBinaryNumber(number1));
      }
      System.out.println("Please select addition, subtraction, multiplication, division, fibonacciNumberFinder or intToBinaryNumber. Type exit to exit.");
      line = myObj.nextLine();

      splited = line.split("\\s+");

      userCommand = splited[0];
    }
  }
}

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String repeatAccept = "";
        String errorString;
        Calculator oneCalculation = new Calculator();
        Scanner console = new Scanner(System.in);

        while (!repeatAccept.equals("no")) {
            System.out.print("Введите первое число: ");

            if (console.hasNextInt()) {
                int num1 = console.nextInt();
                oneCalculation.setNum1(num1);
            } else {
                System.out.print("Это не число, запустите программу заново.");
                return;
            }
            
            System.out.print("Введите знак математической операции: ");
            System.out.print(console.nextLine());
            char sign = console.nextLine().charAt(0);
            oneCalculation.setSign(sign);
            System.out.print("Введите второе число: ");

            if (console.hasNextInt()) {
                int num2 = console.nextInt();
                oneCalculation.setNum2(num2);
            } else {
                System.out.print("Это не число, запустите программу заново.");
                return;
            }

            oneCalculation.calculate();
            repeatAccept = console.nextLine();

            while (!repeatAccept.equals("yes") && !repeatAccept.equals("no")) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                repeatAccept = console.nextLine();
            }

            System.out.println();
        }

        console.close();
    }
}
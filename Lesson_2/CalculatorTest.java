import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String option = "";
        String errorString;
        Calculator Calc = new Calculator();
        Scanner console = new Scanner(System.in);

        while (!option.equals("no")) {
            System.out.print("\nВведите первое число: ");

            if (console.hasNextInt()) {
                int num1 = console.nextInt();
                Calc.setNum1(num1);
            } else {
                console.nextLine();
                System.out.print("Это не число, введите первое число заново.");
                continue;
            }

            System.out.print("Введите знак математической операции: ");
            console.nextLine();
            char sign = console.nextLine().charAt(0);
            Calc.setSign(sign);
            System.out.print("Введите второе число: ");

            if (console.hasNextInt()) {
                int num2 = console.nextInt();
                Calc.setNum2(num2);
            } else {
                console.nextLine();
                System.out.print("Это не число, введите данные заново.");
                continue;
            }

            Calc.calculate();

            do {
                option = console.nextLine();
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            } while (!option.equals("yes") && !option.equals("no"));

            System.out.println();
        }

        console.close();
    }
}
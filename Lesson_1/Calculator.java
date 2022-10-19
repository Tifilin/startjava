public class Calculator {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int result = 1;
        char sign = '^';

        if (sign == '+') {
            result += num2;
        } else if (sign == '-') {
            result -= num2;
        } else if (sign == '*') {
            result *= num2;
        } else if (sign == '/') {
            result /= num2;
        } else if (sign == '^') {
            for (int i = num2; i >= 1; i--) {
                result *= num1;
            }
        } else if (sign == '%') {
            result %= num2;
        } else {
            System.out.println("Неизвестный символ");
        }

        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}
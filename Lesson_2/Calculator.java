public class Calculator {

    private int num1;
    private int num2;
    private int result;
    private char sign;

    public void calculate() {
        result = num1;

        switch (sign) {
        case '+':
            result += num2;
            break;
        case '-':
            result -= num2;
            break;
        case '*':
            result *= num2;
            break;
        case '/':
            result /= num2;
            break;
        case '^':
            result = 1;
            
            for (int i = num2; i > 1; i--) {
                result *= num1;
            }
            break;
        case '%':
            result %= num2;
            break;
        default:
            System.out.println("Неизвестный символ операции");
        }

        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }
}
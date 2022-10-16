public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\nЗадачи по теме \"Циклы: for, while, do while\"");

        System.out.println("\n1 Подсчет суммы четных и нечетных чисел");

        int sumOdd = 0;
        int sumEven = 0;
        short counter = -10;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);

        System.out.println("\n    i. в промежутке [-10, 21] сумма четных чисел = " + sumEven +
                ", а нечетных = " + sumOdd);

        System.out.println("\n2 Вывод чисел в интервале (min и max) в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = num1;
        int minNum = num2;

        if (minNum > maxNum) {
            maxNum = num2;
            minNum = num1;
        }

        if (num3 > maxNum) {
            maxNum = num3;
        } else if (num3 < minNum) {
            minNum = num3;
        }

        if (maxNum == minNum) {
            System.out.print("    Все данные числа равны => в указанном промежутке чисел нет");
        } else {
            for (int i = (maxNum - 1); i > minNum; i--) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\n3 Вывод реверсивного числа и суммы его цифр");

        int srcNum = 1234;
        int sumDigits = 0;

        System.out.print("\n    i.  Исходное число в обратном порядке: ");

        while (srcNum > 0) {
            int digit = srcNum % 10;
            System.out.print(digit);
            sumDigits += digit;
            srcNum /= 10;
        }

        System.out.println("\n    ii. Сумма его цифр: " + sumDigits);

        System.out.println("\n4 Вывод чисел на консоль в несколько строк\n");

        for (int j = 1; j < 24;) {
            for (int i = 1; i <= 5; i++, j += 2) {
                if (j < 24) {
                    System.out.printf("%3s", j);
                } else if (i > 1) {
                    System.out.printf("%3s", 0);
                } else {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println("\n5 Проверка количества единиц на четность");

        srcNum = 3141591;
        int copySrcNum = srcNum;
        int countOnes = 0;

        while (copySrcNum > 0) {
            int digit = copySrcNum % 10;

            if (digit == 1) {
                countOnes++;
            }

            copySrcNum /= 10;
        }

        if ((countOnes % 2) > 0) {
            System.out.println("\n    i. Число " + srcNum + " содержит " + countOnes +
                    " (нечетное) количество единиц");
        } else {
            System.out.println("\n    i. Число " + srcNum + " содержит " + countOnes +
                    " (четное) количество единиц");
        }

        System.out.println("\n6 Отображение фигур в консоли\n");

        for (int countRows = 1; countRows <= 5; countRows++) {
            for (int countRowSymbols = 1; countRowSymbols <= 10; countRowSymbols++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int countRows = 5;

        while (countRows > 0) {
            int countRowSymbols = countRows;

            while (countRowSymbols > 0) {
                countRowSymbols--;
                System.out.print("#");
            }

            countRows--;
            System.out.println();
        }

        System.out.println();
        countRows = 1;

        do {
            int countRowSymbols = 3;

            do {
                countRowSymbols--;
                System.out.print("$");
            } while (Math.abs(3 - countRows) < countRowSymbols);

            countRows++;
            System.out.println();
        } while (countRows <= 5);

        System.out.println("\n7 Отображение ASCII-символов");
        
        System.out.println("\n DEC CHAR");

        for (int decSymbolCode = 0; decSymbolCode <= 47; decSymbolCode++) {
            if ((decSymbolCode % 2) > 0) {
                System.out.printf("\n%4s%5s", decSymbolCode, (char) decSymbolCode);
            }
        }

        for (int decSymbolCode = 97; decSymbolCode <= 122; decSymbolCode++) {
            if ((decSymbolCode % 2) == 0) {
                System.out.printf("\n%4s%5s", decSymbolCode, (char) decSymbolCode);
            }
        }

        System.out.println("\n\n8 Проверка, является ли число палиндромом");

        srcNum = 1234421;
        int copySrcNum = srcNum;
        int reverseNum = 0;

        while (copySrcNum > 0) {
            int digit = copySrcNumm % 10;
            reverseNum = reverseNum * 10 + (digit % 10);
            copySrcNum /= 10;
        }

        if (srcNum == reverseNum) {
            System.out.println("\n    i.  Число " + srcNum + " является палиндромом");
        } else {
            System.out.println("\n    i.  Число " + srcNum + " не является палиндромом");
        }

        System.out.println("\n9 Определение, является ли число счастливым");

        int sumFirstPart = 0;
        srcNum = 123421;

        for (int countParts = 1; countParts <= 2; countParts++) {
            System.out.print("\n    i.  Сумма цифр ");
            sumDigits = 0;

            for (int countDigits = 1; countDigits <= 3; countDigits++) {
                int digit = srcNum % 10;
                System.out.print(digit);
                sumDigits += digit;
                srcNum /= 10;
            }

            System.out.print(" = " + sumDigits);

            if (countParts == 1) {
                sumFirstPart = sumDigits;
            }
        }

        if (sumFirstPart == sumDigits) {
            System.out.println("\n    ii. Число является счастливым");
        } else {
            System.out.println("\n    ii. Число не является счастливым");
        }

        System.out.println("\n10 Вывод таблицы умножения Пифагора");

        System.out.println("\n    ТАБЛИЦА    ПИФАГОРА");

        for (countRows = 1; countRows <= 9; countRows++) {
            if (countRows == 1) {
                System.out.printf("\n%3s |", " ");
            } else {
                System.out.print("\n    |");
                System.out.printf("\n%3s |", countRows);                
            }

            for (int countColumns = 2; countColumns <= 9; countColumns++) {
                System.out.printf("%3s", countRows * countColumns);
            }

            if (countRows == 1) {
                System.out.print("\n_____________________________");
            }
        }
    }
}
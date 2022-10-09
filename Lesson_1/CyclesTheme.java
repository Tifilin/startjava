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

        int maxNum = 10;
        int minNum = 5;
        int num3 = -1;
        int tmp;

        if (minNum >= maxNum) {
            tmp = maxNum;
            maxNum = minNum;
            minNum = tmp;
        }
        if (num3 >= maxNum) {
            tmp = maxNum;
            maxNum = num3;
            num3 = tmp;
        }
        if (num3 <= minNum) {
            tmp = minNum;
            minNum = num3;
            num3 = tmp;
        }

        int i;

        if (maxNum == minNum) {
            System.out.print("    Все данные числа равны => в указанном промежутке чисел нет");
        } else {
            for (i = (maxNum - 1); i > minNum; i--) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\n3 Вывод реверсивного числа и суммы его цифр");

        int srcNum = 1234;
        int digit = srcNum % 10;
        int startSum = 0;

        System.out.print("\n    i.  Исходное число в обратном порядке: ");

        while (srcNum > 0) {
            System.out.print(digit);
            startSum = startSum + digit;
            srcNum /= 10;
            digit = srcNum % 10;
        }

        System.out.println("\n    ii. Сумма его цифр: " + startSum);

        System.out.println("\n4 Вывод чисел на консоль в несколько строк\n");

        int j;

        for (j = 1; j <= 24;) {
            for (i = 1; i <= 5; i++, j += 2) {
                if (j < 24) {
                    System.out.printf("%3s", j);
                } else {
                    System.out.printf("%3s", 0);
                }
            }
            System.out.println();
        }

        System.out.println("\n5 Проверка количества единиц на четность");

        srcNum = 3141591;
        tmp = srcNum;
        int onesQTY = 0;

        while (tmp > 0) {
            onesQTY++;
            tmp /= 10;
        }

        if ((onesQTY % 2) > 0) {
            System.out.println("\n    i. Число " + srcNum + " содержит " + onesQTY +
                    " (нечетное) количество единиц");
        } else {
            System.out.println("\n    i. Число " + srcNum + " содержит " + onesQTY +
                    " (четное) количество единиц");
        }

        System.out.println("\n6 Отображение фигур в консоли\n");

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        i = 5;

        while (i > 0) {
            j = i;

            while (j > 0) {
                j--;
                System.out.print("#");
            }

            i--;
            System.out.println();
        }

        System.out.println();
        i = 1;

        do {
            j = 3;

            do {
                j--;
                System.out.print("$");
            } while (Math.abs( 3 - i ) < j);

            i++;
            System.out.println();
        } while (i <= 5);

        System.out.println("\n7 Отображение ASCII-символов");

        char printSymbol;
        
        System.out.println("\nDEC CHAR");

        for (i = 0; i <= 47; i++) {
            if ((i % 2) > 0) {
                printSymbol = (char) i;
                System.out.printf("\n%3s    %s", i, printSymbol);
            }
        }

        for (i = 97; i <= 122; i++) {
            if ((i % 2) == 0) {
                printSymbol = (char) i;
                System.out.printf("\n%3s    %s", i, printSymbol);
            }
        }

        System.out.println("\n\n8 Проверка, является ли число палиндромом");

        srcNum = 1234321;
        int compareNum1 = srcNum * 10;
        int compareNum2 = 0;

        if ((srcNum % 10) > 0) {
            do {
                compareNum1 = compareNum1 / 10;
                compareNum2 = compareNum2 * 10 + (compareNum1 % 10);
            } while (compareNum2 <= (compareNum1 / 10));

            if ((compareNum1 == (compareNum2 / 10))  || (compareNum1 == compareNum2)) {
                System.out.println("\n    i.  Число " + srcNum + " является палиндромом");
            } else {
                System.out.println("\n    i.  Число " + srcNum + " не является палиндромом");
            }
        } else if (srcNum == 0) {
            System.out.println("\n    i.  Число " + srcNum + " является палиндромом");
        } else {
            System.out.println("\n    i.  Число " + srcNum + " не является палиндромом");
        }

        System.out.println("\n9 Определение, является ли число счастливым");

        srcNum = 123421;
        int sum1 = 0;

        for (i = 1; i <= 2; i++) {
            System.out.print("\n    i.  Сумма цифр ");
            tmp = 0;

            for (j = 1; j <= 3; j++) {
                System.out.print(srcNum % 10);
                tmp = tmp + (srcNum % 10);
                srcNum = srcNum / 10;
            }

            System.out.print(" = " + tmp);

            if (i == 1) {
                sum1 = tmp;
            }
        }

        if (sum1 == tmp) {
            System.out.println("\n    ii. Число является счастливым");
        } else {
            System.out.println("\n    ii. Число не является счастливым");
        }

        System.out.println("\n10 Вывод таблицы умножения Пифагора");

        System.out.println("\n    ТАБЛИЦА    ПИФАГОРА");
        
        char horLine;
        char vertLine;

        for (i = 1; i <= 9; i++) {
            if (i == 1) {
                System.out.printf("\n%3s |", " ");
            } else {
                System.out.print("\n    |");
                System.out.printf("\n%3s |", i);                
            }

            for (j = 2; j <= 9; j++) {
                System.out.printf("%3s", i * j);
            }

            if (i == 1) {
                System.out.print("\n_____________________________");
            }
        }
    }
}
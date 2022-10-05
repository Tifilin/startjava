public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\nЗадачи по теме \"Циклы: for, while, do while\"");

        System.out.println("\n1 Подсчет суммы четных и нечетных чисел");

        int unevenSum = 0;
        int evenSum = 0;
        short i = -10;

        do {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                unevenSum += i;
            }
            i++;
        } while(i <= 21);

        System.out.println("\n    i. в промежутке [-10, 21] сумма четных чисел = " + evenSum +
                ", а нечетных = " + unevenSum);

        System.out.println("\n2 Вывод чисел в интервале (min и max) в порядке убывания");

        short num1 = 10;
        short num2 = 5;
        short num3 = -1;
        short maxNumber = 0;
        short minNumber = 0;

        if ((num1 >= num2) && (num1 >= num3)) {
            maxNumber = num1;
        } else if ((num2 >= num1) && (num2 >= num3)) {
            maxNumber = num2;
        } else if ((num3 >= num1) && (num3 >= num2)) {
            maxNumber = num3;
        }

        if ((num1 <= num2) && (num1 <= num3)) {
            minNumber = num1;
        } else if ((num2 <= num1) && (num2 <= num3)) {
            minNumber = num2;
        } else if ((num3 <= num1) && (num3 <= num2)) {
            minNumber = num3;
        }

        System.out.print("\n    ");

        if (maxNumber == minNumber) {
            System.out.println("    Все данные числа равны => в указанном промежутке чисел нет");
        } else {
            for( i = (short) (maxNumber - 1); i > minNumber; i-- ) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("\n3 Вывод реверсивного числа и суммы его цифр");

        int startNumber = 1234;
        int startSum = 0;

        System.out.print("\n    i.  Исходное число в обратном порядке: ");

        while ( startNumber > 0) {
            System.out.print(startNumber % 10);

            startSum = startSum + startNumber % 10;
            startNumber /= 10;
        }

        System.out.println("\n    ii. Сумма его цифр: " + startSum);

        System.out.println("\n4 Вывод чисел на консоль в несколько строк");

        System.out.println();

        short j;

        for( i = 1; i < 24; i++ ) {
            for( j = 1; j <= 5; j++ ) {
                if (i < 24) {
                    System.out.printf("%3s", i);
                } else {
                    System.out.printf("%3s", 0);
                }
                
                i += 2;
            }

            System.out.println();
        }

        System.out.println("\n5 Проверка количества единиц на четность");

        startNumber = 3141591;

        int tmp = startNumber;
        int onesQTY = 0;

        while ( tmp > 0) {
            onesQTY++;
            tmp /= 10;
        }

        if ( (onesQTY % 2) > 0 ) {
            System.out.println("\n    i. Число " + startNumber + " содержит " + onesQTY +
                    " (нечетное) количество единиц");
        } else {
            System.out.println("\n    i. Число " + startNumber + " содержит " + onesQTY +
                    " (четное) количество единиц");
        }

        System.out.println("\n6 Отображение фигур в консоли");

        System.out.println();

        for( i = 1; i <= 5; i++ ) {
            for( j = 1; j <= 10; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        i = 5;

        while ( i > 0) {
            j = i;

            while ( j > 0) {
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

            } while( Math.abs( 3 - i ) < j );

            i++;

            System.out.println();

        } while(i <= 5);

        System.out.println("\n7 Отображение ASCII-символов");

            char printSymbol;
                //System.out.printf("%3s", printSymbol);
                System.out.println("DEC CHAR");

            for( i = 0; i <= 47; i++ ) {
                if ( (i % 2) > 0 ) {
                printSymbol = (char) i;

                System.out.printf("\n%3s    %s", i, printSymbol);
                }
            }

            for( i = 97; i <= 122; i++ ) {
                if ( (i % 2) == 0 ) {
                printSymbol = (char) i;

                System.out.printf("\n%3s    %s", i, printSymbol);
                }
            }

        System.out.println("\n\n8 Проверка, является ли число палиндромом");

        startNumber = 1234321;

        int compareNum1 = startNumber * 10;
        int compareNum2 = 0;

        if ( (startNumber % 10) > 0 ) {  

            do {
                compareNum1 = compareNum1 / 10;
                compareNum2 = compareNum2 * 10 + (compareNum1 % 10);
            } while( compareNum2 <= (compareNum1 / 10) );

            if ( (compareNum1 == (compareNum2 / 10))  || (compareNum1 == compareNum2) ) {
                System.out.println("\n    i.  Число " + startNumber + " является палиндромом");
            } else {
                System.out.println("\n    i.  Число " + startNumber + " не является палиндромом");
            }

        } else if ( startNumber == 0 ) {

            System.out.println("\n    i.  Число " + startNumber + " является палиндромом");
        } else {

            System.out.println("\n    i.  Число " + startNumber + " не является палиндромом");
        }

        System.out.println("\n9 Определение, является ли число счастливым");

        startNumber = 123421;

        int sum1 = 0;

        for( i = 1; i <= 2; i++ ) {
            System.out.print("\n    i.  Сумма цифр ");

            tmp = 0;

            for( j = 1; j <= 3; j++ ) {
                System.out.print(startNumber % 10);

                tmp = tmp + (startNumber % 10);
                startNumber = startNumber / 10;
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

        for( i = 1; i <= 9; i++ ) {
            if ( i == 1 ) {
                System.out.printf("\n%3s |", " ");
            } else {
                System.out.print("\n    |");
                System.out.printf("\n%3s |", i);                
            }

            for( j = 2; j <= 9; j++ ) {
                System.out.printf("%3s", i * j);
            }

            if ( i == 1 ) {
                System.out.print("\n_____________________________");
            }
        }
    }
}
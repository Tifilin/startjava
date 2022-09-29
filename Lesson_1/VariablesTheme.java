public class VariablesTheme {

    public static void main(String[] args) {
        boolean licenseStatus = true;
        byte cpuAmount = 1;
        char osEdition = 'H';
        short bitVersion = 64;
        int ramSize = 6011;
        long osBuild = 14393;
        float osVersion = 10.0f;
        double cpuFrequency = 2.203;

        System.out.println("\nЗадачи по теме \"Переменные: примитивные типы данных\"");

        System.out.println("\n1 Создание переменных и вывод их значений на консоль");
        System.out.println("\n    Наличие лицензии: " + licenseStatus);
        System.out.println("    Количество процессоров: " + cpuAmount);
        System.out.println("    Частота, Гц: " + cpuFrequency);
        System.out.println("    Полный объём физической памяти, мб: " + ramSize);
        System.out.println("    Тип системы: " + bitVersion);
        System.out.println("    Версия ОС: " + osVersion);
        System.out.println("    Вид ОС: " + osEdition);
        System.out.println("    Построение: " + osBuild);

        System.out.println("\n2 Расчет стоимости товара со скидкой");

        short penPrice = 100;
        short bookPrice = 200;
        short amountDiscount = 11;
        float sumDiscount = (penPrice + bookPrice) * amountDiscount / 100;
        float discountPrice = penPrice + bookPrice - sumDiscount;

        System.out.println("\n    Сумма скидки: " + sumDiscount);
        System.out.println("    Общая стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3 Вывод на консоль слова JAVA");
        System.out.println("\n   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4 Отображение min и max значений числовых типов данных");

        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;

        System.out.println("\n    Первоначальное значение переменной типа byte: " + byteMax);
        System.out.println("    Значение после инкремента переменной типа byte: " + (++byteMax));
        System.out.println("    Значение после декремента переменной типа byte: " + (--byteMax));
        System.out.println("    Первоначальное значение переменной типа short: " + shortMax);
        System.out.println("    Значение после инкремента переменной типа short: " + (++shortMax));
        System.out.println("    Значение после декремента переменной типа short: " + (--shortMax));
        System.out.println("    Первоначальное значение переменной типа int: " + intMax);
        System.out.println("    Значение после инкремента переменной типа int: " + (++intMax));
        System.out.println("    Значение после декремента переменной типа int: " + (--intMax));
        System.out.println("    Первоначальное значение переменной типа long: " + longMax);
        System.out.println("    Значение после инкремента переменной типа long: " + (++longMax));
        System.out.println("    Значение после декремента переменной типа long: " + (--longMax));

        System.out.println("\n5 Перестановка значений переменных");

        int num1 = 2;
        int num2 = 5;

        System.out.println("5.1 Перестановка с использованием третьей переменной");
        System.out.println("\nИсходные значения переменных:");
        System.out.println("Первая:" + num1 + ", Вторая:" + num2);

        int tmp = num1;
        num1 = num2;
        num2 = tmp;

        System.out.println("Новые значения переменных:");
        System.out.println("Первая:" + num1 + ", Вторая:" + num2);

        System.out.println("\n5.2 Перестановка с помощью арифметических операций");
        System.out.println("\nИсходные значения переменных:");
        System.out.println("Первая:" + num1 + ", Вторая:" + num2);

        num1 -= num2;
        num2 += num1;
        num1 = num2 - num1;

        System.out.println("Новые значения переменных:");
        System.out.println("Первая:" + num1 + ", Вторая:" + num2);

        System.out.println("\n5.3 Перестановка с помощью побитовой операции");
        System.out.println("\nИсходные значения переменных:");
        System.out.println("Первая:" + num1 + ", Вторая:" + num2);

        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;

        System.out.println("Новые значения переменных:");
        System.out.println("Первая:" + num1 + ", Вторая:" + num2);

        System.out.println("\n6 Вывод символов и их кодов");

        char firstChar = '#';
        char secondChar = '&';
        char thirdChar = '@';
        char fourthChar = '^';
        char fifthChar = '_';

        System.out.println((short) firstChar + " " + firstChar);
        System.out.println((short) secondChar + " " + secondChar);
        System.out.println((short) thirdChar + " " + thirdChar);
        System.out.println((short) fourthChar + " " + fourthChar);
        System.out.println((short) fifthChar + " " + fifthChar);

        System.out.println("\n7 Произведение и сумма цифр числа");

        int number = 123;
        int hundreds = number / 100;
        int dozens = (number / 10) % 10;
        int ones = number % 10;

        System.out.println("\nЧисло N содержит:\ni.    " + hundreds + " сотен\nii.   " +
                dozens + " десятков\niii.  " + ones + " единиц");
              
        System.out.println("\n8 Вывод на консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        char space = ' ';

        System.out.println("" + space + space + space + space + slash + backslash + space + space +
                space + space);
        System.out.println("" + space + space + space + slash + space + space + backslash + space +
                space + space);
        System.out.println("" + space + space + slash + underscore + openParenthesis + space +
                closeParenthesis + backslash + space + space);
        System.out.println("" + space + slash + space + space + space + space + space + space +
                backslash + space);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash);

        System.out.println("\n9 Произведение и сумма цифр числа");

        number = 345;
        hundreds = number / 100;
        dozens = (number / 10) % 10;
        ones = number % 10;

        System.out.println("\ni.  Сумма цифр числа " + number + " = " + (hundreds + dozens + ones));
        System.out.println("ii. Произведение цифр числа " + number +
                " = " + hundreds * dozens * ones);

        System.out.println("\n10 Преобразование секунд");

        int secondsAmount = 86399;
        int resultSeconds = secondsAmount % 60;
        int resultMinutes = secondsAmount / 60;
        int resultHours = resultMinutes / 60;
        resultMinutes = resultMinutes % 60;

        System.out.println("Получилось (ЧЧ:ММ:СС): " +
                resultHours + ":" + resultMinutes + ":" + resultSeconds);
    }
}
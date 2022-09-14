public class VariablesTheme {

    public static void main(String[] args) {

        boolean license = true;
        byte kolvoProcessorov = 1;
        char edition = 'H';
        short type = 64;
        int memory = 6011;
        long build = 14393;
        float version = 10.0f;
        double chastota = 2.203;

        System.out.println("\nЗадачи по теме \"Переменные: примитивные типы данных\"");
        System.out.println("\n1 Создание переменных и вывод их значений на консоль");
        System.out.println("\n    Наличие лицензии: " + license);
        System.out.println("    Количество процессоров: " + kolvoProcessorov);
        System.out.println("    Частота, Гц: " + chastota);
        System.out.println("    Полный объём физической памяти, мб: " + memory);
        System.out.println("    Тип системы: " + type);
        System.out.println("    Версия ОС: " + version);
        System.out.println("    Вид ОС: " + edition);
        System.out.println("    Построение: " + build);

        System.out.println("\n2 Расчет стоимости товара со скидкой");

        short penPrice = 100;
        short bookPrice = 200;
        short discountSize = 11;
        float discountAmount = (penPrice + bookPrice) * discountSize / 100;
        float resulPrice = penPrice + bookPrice - discountAmount;

        System.out.println("    Сумма скидки: " + discountAmount);
        System.out.println("    Общая стоимость товаров со скидкой: " + resulPrice);
        System.out.println("\n3 Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4 Отображение min и max значений числовых типов данных");

        byte varByte = 127;
        short varShort = 32767;
        int varInt = 2147483647;
        long varLong = 9223372036854775807L;

        System.out.println("    Первоначальное значение переменной типа byte: " + varByte);
        System.out.println("    Значение после инкремента переменной типа byte: " + (++varByte));
        System.out.println("    Значение после декремента переменной типа byte: " + (--varByte));
        System.out.println("    Первоначальное значение переменной типа short: " + varShort);
        System.out.println("    Значение после инкремента переменной типа short: " + (++varShort));
        System.out.println("    Значение после декремента переменной типа short: " + (--varShort));
        System.out.println("    Первоначальное значение переменной типа int: " + varInt);
        System.out.println("    Значение после инкремента переменной типа int: " + (++varInt));
        System.out.println("    Значение после декремента переменной типа int: " + (--varInt));
        System.out.println("    Первоначальное значение переменной типа long: " + varLong);
        System.out.println("    Значение после инкремента переменной типа long: " + (++varLong));
        System.out.println("    Значение после декремента переменной типа long: " + (--varLong));

        System.out.println("\n5 Перестановка значений переменных");

        int first = 2;
        int second = 5;
        int third = first;

        System.out.println("5.1 Перестановка с использованием третьей переменной");
        System.out.println("Исходные значения переменных:");
        System.out.println("Первая:" + first + ", Вторая:" + second + ", Третья:" + third);

        first = second;
        second = third;

        System.out.println("Новые значения переменных:");
        System.out.println("Первая:" + first + ", Вторая:" + second + ", Третья:" + third);
        System.out.println("\n5.2 Перестановка с помощью арифметических операций");
        System.out.println("Исходные значения переменных:");
        System.out.println("Первая:" + first + ", Вторая:" + second);

        first = first - 3;
        second = first + 3;

        System.out.println("Новые значения переменных:");
        System.out.println("Первая:" + first + ", Вторая:" + second);
        System.out.println("\n5.3 Перестановка с помощью побитовой операции");
        System.out.println("Исходные значения переменных:");
        System.out.println("Первая:" + first + ", Вторая:" + second);

        second = second ^ first ^ second;
        first = first ^ 5 ^ first;

        System.out.println("Новые значения переменных:");
        System.out.println("Первая:" + first + ", Вторая:" + second);

        System.out.println("\n6 Вывод символов и их кодов");

        char firstChar = 35;
        char secondChar = 38;
        char thirdChar = 64;
        char fourthChar = 94;
        char fifthChar = 95;

        System.out.println((short) firstChar + " " + firstChar);
        System.out.println((short) secondChar + " " + secondChar);
        System.out.println((short) thirdChar + " " + thirdChar);
        System.out.println((short) fourthChar + " " + fourthChar);
        System.out.println((short) fifthChar + " " + fifthChar);

        System.out.println("\n7 Произведение и сумма цифр числа");

        short number = 123;
        byte hundreds = (byte) (number / 100);
        byte dozens = (byte) ((number / 10) % 10);
        byte units = (byte) (number % 10);

        System.out.println("Число N содержит:\ni.    " + hundreds + " сотен\nii.   " + dozens + " десятков\niii.  " + units + " единиц");
              
        System.out.println("\n8 Вывод на консоль ASCII-арт Дюка");

        char one = '/';
        char two = '\\';
        char thr = '_';
        char fou = '(';
        char fiv = ')';
        char six = ' ';

        System.out.println(six + "" + six + "" + six + "" + six + "" + one + "" + two + "" + six + "" + six + "" + six + "" + six);
        System.out.println(six + "" + six + "" + six + "" + one + "" + six + "" + six + "" + two + "" + six + "" + six + "" + six);
        System.out.println(six + "" + six + "" + one + "" + thr + "" + fou + "" + six + "" + fiv + "" + two + "" + six + "" + six);
        System.out.println(six + "" + one + "" + six + "" + six + "" + six + "" + six + "" + six + "" + six + "" + two + "" + six);
        System.out.println(one + "" + thr + "" + thr + "" + thr + "" + thr + "" + one + "" + two + "" + thr + "" + thr + "" + two);
        System.out.println("\n9 Произведение и сумма цифр числа");

        number = 345;
        hundreds = (byte) (number / 100);
        dozens = (byte) ((number / 10) % 10);
        units = (byte) (number % 10);

        System.out.println("i.  Сумма цифр числа " + number + " = " + (hundreds + dozens + units));
        System.out.println("ii. Произведение цифр числа " + number + " = " + hundreds * dozens * units);
        System.out.println("\n10 Преобразование секунд");

        int amount = 86399;
        short seconds = (short) (amount % 60);
        short minutes = (short) (amount / 60);
        short hours = (short) (minutes / 60);

        minutes = (short) (minutes % 60);

        System.out.println("Получилось (ЧЧ:ММ:СС): " + hours + ":" + minutes + ":" + seconds);
    }
}
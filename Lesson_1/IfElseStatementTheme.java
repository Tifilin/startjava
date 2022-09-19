public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\nЗадачи по теме \"Ветвление: if-else\"");

        System.out.println("\n1 Перевод псевдокода на язык Java");

        short age = 20;
        char sex='m';
        boolean isSexM = 'm' == 1;
        float length = 1.60f;

        if(age > 20) {
            System.out.println("\nГоден");
        } else {
            System.out.println("\nПока не годен");
        }

        if(!isSexM == false) {
            System.out.println("Не тот пол");
        } else if(length < 1.80) {
            System.out.println("Прописать кальций");
        } else {
            System.out.println("Рассказать анекдот");
        }

        char firstNameLetter = "OLEG".charAt(0);

        if (firstNameLetter == 'M') {
            System.out.println("Спросить, есть ли внуки");
        } else if(firstNameLetter == 'I') {
            System.out.println("Закричать \"И-и-и-горь!\"");
        } else {
            System.out.println("Приписать к ВДВ");
        }

        System.out.println("\n2 Поиск max и min числа");

        short firstNumber = 12;
        short secondNumber = 33;

        if (firstNumber > secondNumber) {
            System.out.println("\nМаксимальное число - " + firstNumber + "Минимальное число - " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("\nМаксимальное число - " + secondNumber + " Минимальное число - " + firstNumber);
        } else {
            System.out.println("\nЧисла равны");
        }

        System.out.println("\n3 Работа с числом");

        int randomNumber = -1;

        System.out.println("\nИсходное число: " + randomNumber);

        if (randomNumber == 0) {
            System.out.println("Число является нулём");
        } else {
            if (randomNumber % 2 == 0) {
                System.out.println("Число является чётным");
            } else {
                System.out.println("Число является нечётным");
            }
            if (randomNumber > 0) {
                System.out.println("Число является положительным");
            } else {
                System.out.println("Число является отрицательным");
            }
        }

        System.out.println("\n4 Поиск одинаковых цифр в числах");

        short num1 = 165;
        short num2 = 195;

        System.out.println("\nПервое число: " + num1);
        System.out.println("Второе число: " + num2);

        if ((num1 % 10) == (num2 % 10)) {
            System.out.println("В 1 разряде одинаковые цифры - " + (num1 % 10));
        }
        if (((num1 / 10) % 10) == ((num2 / 10) % 10)) {
            System.out.println("Во 2 разряде одинаковые цифры - " + ((num2 / 10) % 10));
        }
        if ((num1 / 100) == (num2 / 100)) {
            System.out.println("В 3 разряде одинаковые цифры - " + (num1 / 100));
        }

        System.out.println("\n5 Определение буквы, числа или символа по их коду");

        char letterCode = '\u0057';
        short letterDexCode = (short) letterCode;

        System.out.println("\nИсходный код: " + (short) letterCode);

        if ((letterDexCode > 47) && (letterDexCode < 58)) {
            System.out.println("Это код числа " + letterCode);
        } else if ((letterDexCode > 64) && (letterDexCode < 91)) {
            System.out.println("Это код большой буквы " + letterCode);
        } else if ((letterDexCode > 96) && (letterDexCode < 123)) {
            System.out.println("Это код маленькой буквы " + letterCode);
        } else {
            System.out.println("Это не буква и не число, а символ " + letterCode);
        }

        System.out.println("\n6 Определение суммы вклада и начисленных банком %");

        float storeSum = 300000.0f;
        float endSum;
        short percent;

        if (storeSum < 100000) {
            percent = 5;
        } else if ((storeSum >= 100000) && (storeSum <= 300000)) {
            percent = 7;
        } else {
            percent = 10;
        }

        endSum = storeSum * (100 + percent) / 100;

        System.out.println("i.   Сумма вклада: " + storeSum);
        System.out.println("ii.  Начисленный %: " + percent);
        System.out.println("iii. Итоговая сумма: " + endSum);

        System.out.println("\n7 Определение оценки по предметам");

        short historyPercent = 59;
        short programPercent = 91;
        byte historyMark;
        byte programMark;

        if (historyPercent <= 60) {
            historyMark = 2;
        } else if (historyPercent <= 73) {
            historyMark = 3;
        } else if (historyPercent <= 91) {
            historyMark = 4;
        } else {
            historyMark = 5;
        }

        if (programPercent <= 60) {
            programMark = 2;
        } else if (programPercent <= 73) {
            programMark = 3;
        } else if (historyPercent <= 91) {
            programMark = 4;
        } else {
            programMark = 5;
        }

        System.out.println("\n" + historyMark + " - по истории");
        System.out.println(programMark + " - по программированию");
        System.out.println("Средний балл оценок по предметам: " + ((historyMark + programMark) / 2));
        System.out.println("Средний % по предметам: " + ((historyPercent + programPercent) / 2));

        System.out.println("\n8 Расчет прибыли");

        int rent = 5000;
        int monthGain = 13000;
        int cost = 9000;
        int yearGain = (monthGain - rent - cost) * 12;
        char sign;

        if (yearGain > 0) {
            sign = '+';
        } else {
            sign = ' ';
        }

        System.out.println("\nПрибыль за год: " + sign + "" + yearGain + " руб.");

        System.out.println("\n9 Подсчет количества банкнот");

        int reqQTY = 567;
        int checkQTY;
        int hundreds = (reqQTY / 100);
        int dozens = ((reqQTY / 10) % 10);
        int ones = (reqQTY % 10);

        if (dozens > 5) {
            ones = (dozens - 5) * 10 + ones;
            dozens = 5;
        }

        checkQTY = hundreds * 100 + dozens * 10 + ones;

        System.out.println("\nТребуется получить из банкомата:");
        System.out.println("Купюр номиналом 100: " + hundreds);
        System.out.println("Купюр номиналом 10: " + dozens);
        System.out.println("Купюр номиналом 1: " + ones);
        System.out.println("Посчитанная исходная сумма: " + checkQTY);
    }
}
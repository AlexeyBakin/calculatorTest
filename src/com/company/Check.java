package com.company;

//класс для проверки введенного запроса и вывода на экран ошибок
public class Check {
    Error error = new Error();

    //проверка не пустая ли строка
    public void isNoRequest (String request) {
        if (request.equals("")) {
            System.out.println(error.errorEmpty);
            System.exit(0);
        }
    }

    //проверка не пустое ли значение введенно
    public void isEmpty (String num1, String num2) {
        if (num1.equals("")) {
            System.out.println(error.errorNumberEmpty + "\nНет первого числа.");
            System.exit(0);
        } else {
            if (num2.equals("")) {
                System.out.println(error.errorNumberEmpty + "\nНет второго числа.");
                System.exit(0);
            }
        }
    }

    //является ли число в запросе числом с плавающей точкой
    public void ifNumberIsFloat (String name, boolean isFloat) {
        if (isFloat) {
            System.out.println(error.errorFloat + name + " не целое.");
            System.exit(0);
        }
    }

    //является ли символы в запросе хоть каким-то типом чисел
    public void ifNumberIsNotANumber (String name, boolean isFl, boolean isInt, boolean isRoman) {
        if (!isFl & !isInt & !isRoman) {
            System.out.println(error.errorOfValues + name + " не содержит допустимых значений.");
            System.exit(0);
        }
    }

    //проверяет, оба числа одного типа или нет
    public void ifNumbersDifferent (boolean int1, boolean int2, boolean roman1, boolean roman2) {
        if ( (int1 & roman2) || (roman1 & int2) ) {
            System.out.println(error.errorOfNumbers);
            System.exit(0);
        }
    }

    //не выходит ли целое число из допустимого диапозона
    public void ifIntNumberBigOrSmall (String name, int number) {
        if (number < 1 || number > 10) {
            System.out.println(error.errorOfNumberSize + name + " не находится в диапозоне допустимых значений.");
            System.exit(0);
        }
    }

    //является ли ответ римскими цифрами положительным
    public void ifRomanResultNotPositive (int result) {
        if (result <= 0) {
            System.out.println(error.errorRomanResult);
            System.exit(0);
        }
    }

    //проверяет есть ли математический символ в запросе
    public void isThereASymbol (boolean isThere) {
        if (!isThere) {
            System.out.println(error.errorOfSymbol);
            System.exit(0);
        }
    }

    //проверяет сколько математических символов указанно в запросе
    public void countOfSymbols (int count) {
        if (count != 1) {
            System.out.println(error.errorOfCountSymbols);
            System.exit(0);
        }
    }
}
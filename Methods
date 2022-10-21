import java.security.PublicKey;

public class Methods {

    public static int number1;
    public static int number2;

    public static int result;

    public static int romanianNumber1;
    public static int romanianNumber2;
    public static String choosenOperation;

    public static String MESSAGE_WRONG_INPUT = "Калькулятор работает только с ЦЕЛЫМИ РИМСКИМИ числами от I до X";

    public static int choosenFormat;

    public static void checkingForAnInteger(int num) throws Exception {
        if (num > 10 || num == -1) throw new Exception("Калькулятор работает только с ЦЕЛЫМИ числами от 1 до 10");
    }

    public static void checkingForRomania(String num) throws Exception {
        if (num.equals("diapason")) throw new Exception(MESSAGE_WRONG_INPUT);
    }


    public static int letterToNumber(String number1) {
        switch (number1) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                return -1;
        }
    }

    public static String numbersToLetter(int number1) {
        switch (number1) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            default:
                return new String("diapason");
        }
    }

    public static int numberPlus(int x, int y) {
        return x + y;
    }

    public static int numberMinus(int x, int y) {
        return x - y;
    }

    public static int numberMultiplication(int x, int y) {
        return x * y;
    }

    public static int numberDivision(int x, int y) {
        try {
            if (x == 0 || y == 0) {
                throw new Exception(" Нельзя делить на ноль, можно разрушить вселенную ");
            } else {
                return x / y;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void calculateArabianAll() {
        if (choosenOperation.equals("+"))
            System.out.println(" Ваш результат равен = " + Methods.numberPlus(number1, number2));
        else if (choosenOperation.equals("-")) {
            System.out.println(" Ваш результат равен = " + Methods.numberMinus(number1, number2));
        } else if (choosenOperation.equals("*")) {
            System.out.println(" Ваш результат равен = " + Methods.numberMultiplication(number1, number2));
        } else if (choosenOperation.equals("/")) {
            System.out.println(" Ваш результат равен = " + Methods.numberDivision(number1, number2));
        }

    }

    public static void calculateRomanianAll() {
        if (choosenOperation.equals("+")) {
            result = Methods.numberPlus(romanianNumber1, romanianNumber2);
            System.out.println(" Ваш результат равен = " + numbersToLetter(result));
        } else if (choosenOperation.equals("-")) {
            result = Methods.numberMinus(romanianNumber1, romanianNumber2);
            System.out.println(" Ваш результат равен = " + numbersToLetter(result));
        } else if (choosenOperation.equals("*")) {
            result = Methods.numberMultiplication(romanianNumber1, romanianNumber2);
            System.out.println(" Ваш результат равен = " + numbersToLetter(result));
        } else if (choosenOperation.equals("/")) {
            result = Methods.numberDivision(romanianNumber1, romanianNumber2);
            System.out.println(" Ваш результат равен = " + numbersToLetter(result));
        }

    }
}


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        ConversasionCommand.whatIsOperation();
        Methods.choosenFormat = Integer.parseInt(scanner.next());

        if (Methods.choosenFormat == 1) {

            ConversasionCommand.whatOperationNeedToDo();
            Methods.choosenOperation = scanner.next();

            ConversasionCommand.whatFirstNumber();
            Methods.number1 = scanner.nextInt();
            Methods.checkingForAnInteger(Methods.number1);

            ConversasionCommand.whatSecondNumber();
            Methods.number2 = scanner.nextInt();
            Methods.checkingForAnInteger(Methods.number2);

            Methods.calculateArabianAll();
        }

        if (Methods.choosenFormat == 2) {

            ConversasionCommand.whatOperationNeedToDo();
            Methods.choosenOperation = scanner.next();

            ConversasionCommand.whatFirstNumber();
            Methods.romanianNumber1 = Methods.letterToNumber(scanner.next());
            Methods.checkingForRomania(Methods.numbersToLetter(Methods.romanianNumber1));

            ConversasionCommand.whatSecondNumber();
            Methods.romanianNumber2 = Methods.letterToNumber(scanner.next());
            Methods.checkingForRomania(Methods.numbersToLetter(Methods.romanianNumber2));

            Methods.calculateRomanianAll();

        }


    }


}








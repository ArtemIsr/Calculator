public class ConversasionCommand {

    public static void whatOperationNeedToDo() {
        System.out.println("Выберите что будем делать : " + "\n"
                + " *  УМНОЖЕНИЕ" + "\n" + " /  ДЕЛЕНИЕ "
                + "\n" + " +  СЛОЖЕНИЕ " + "\n" + " -  ВЫЧИТАНИЕ");
    }

    public static void whatFirstNumber() {
        System.out.println(" Введит первое ЦЕЛОЕ число : ");
    }

    public static void whatSecondNumber() {
        System.out.println(" Введит второе ЦЕЛОЕ число : ");
    }

    public static void whatIsOperation() {
        System.out.println("ВЫБЕРИТЕ РЕЖИМ РАБОТЫ КАЛЬКУЛЯТОРА:  " + "\n" +
                "____________________________" + "\n" +
                " 1 АРАБСКИЙ КАЛЬКУЛЯТОР" + "\n" +
                " 2 РИМСКИЙ КАЛЬКУЛЯТОР" + "\n" +
                "____________________________" + "\n" +
                "ВНИМАНИЕ !!! КАЛЬКУЛЯТОР РАБОТАЕТ ТОЛЬКО С ЦЕЛЫМИ ЧИСЛАМИ");
    }


}

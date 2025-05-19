public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");   //Задача 1
        int[] payments = {723_778, 879_933, 901_844, 831_023, 698_989};
        int sum = 0;
        for (int current : payments ) {
            sum = sum + current;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();


        System.out.println("Задача №2");  //Задача 2
        int[] expense = {222_987, 314_342, 418_777, 189_787, 673_455};
        int maxExpense = -1;
        int minExpense = 100000000;
        for (int current : expense) {
            if (current > maxExpense) {
                maxExpense = current;
            }
            if (current < minExpense) {
                minExpense = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. Максимальная сумма трат за неделю составила " + maxExpense + " рублей");
        System.out.println();



        System.out.println("Задача №3");  //Задача 3
        int[] expenditure = {345_987, 333_342, 222_777, 444_787, 777_455};
        int amount = 0;
        for (int current : expenditure ) {
            amount = amount + current;
        }
        float averageExpenditure = (float) amount / expenditure.length;
        System.out.println("Средняя сумма трат еженедельно составила " + averageExpenditure + " рублей");
        System.out.println();



        System.out.println("Задача №4");  //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила" + sum + "рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int totalExpenses = 0;
        int minExpense = Integer.MAX_VALUE;
        int maxExpense = Integer.MIN_VALUE;
        for (int expense : arr) {
            totalExpenses += expense;
            if (expense <= minExpense) {
                minExpense = expense;
            }
            if (expense >= maxExpense) {
                maxExpense = expense;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int expense : arr) {
            sum += expense;
        }
        double average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}
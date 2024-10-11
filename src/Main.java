public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №2 Массивы");

        System.out.println("________________Задание 1__________________");
        int[] arr = {2200, 22002, 52, 2, 1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("___________________________________________");

        System.out.println("________________Задание 2__________________");

        int Min = arr[0];
        int Max = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            } //https://code-live.ru/forum/cpp/6/ Если бы не вот это, то я бы и не делал!
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + Min + " рублей. " +
                "Максимальная сумма трат за неделю составила " + Max + " рублей");

        System.out.println("___________________________________________");

        System.out.println("________________Задание 3__________________");

        int sumWeek = sum / arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + sumWeek + " рублей");

        System.out.println("___________________________________________");

        System.out.println("________________Задание 4__________________");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            int leftIndex = i;
            int rightIndex = reverseFullName.length - i - 1;
            char temp = reverseFullName[leftIndex];
            reverseFullName[leftIndex] = reverseFullName[rightIndex];
            reverseFullName[rightIndex] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        System.out.println("___________________________________________");

    }
}
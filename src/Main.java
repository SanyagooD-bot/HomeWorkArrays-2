public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №2 Массивы");
        int[] arr = new int[5];
        arr[0] = 31233;
        arr[1] = 66573;
        arr[2] = 74567;
        arr[3] = 24343;
        arr[4] = 97865;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i + 1] < arr[i]){
                System.out.println(arr[i]);

            }

        }

    }
    /*private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(30_000) + 30_000;
        }
        return arr;
    }*/
}


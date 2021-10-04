public class SummativeSums {

    public static void main(String[] args) {
        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };
        int sum1 = sum(array1);
        int sum2 = sum(array2);
        int sum3 = sum(array3);
        System.out.println("Array 1 sums to: " + sum1);
        System.out.println("Array 2 sums to: " + sum2);
        System.out.println("Array 3 sums to: " + sum3);
    }

    public static int sum(int[] array){
        int total = 0;
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        return total;
    }
}
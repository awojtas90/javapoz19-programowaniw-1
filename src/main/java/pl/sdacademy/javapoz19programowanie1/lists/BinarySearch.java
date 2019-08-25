package pl.sdacademy.javapoz19programowanie1.lists;

public class BinarySearch {

    public static void main(String[] args) {

        System.out.println("6, new int []0,1,3,6,8,9)));


    }

    public int binarySearch(int value, int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
​
        while (left != right) {
            int center = (left + right) / 2;
​
            if (numbers[center] <= value) {
                left = center + 1;
            }
            if (numbers[center] >= value) {
                right = center - 1;
            }
​
        }
        if (value == numbers[left]) {
            return left;
        } else {
            return -1;
        }
    }
}

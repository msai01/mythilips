package org.Week2.Day3;
import java.util.Arrays;

public class ArrayRotation {

        public static void rotateArrayLeft(int[] arr, int x) {
            int length = arr.length;
            x = x % length; // Normalize x if it exceeds array length

            // Reverse the elements from 0 to x-1
            reverseArray(arr, 0, x - 1);

            // Reverse the elements from x to length-1
            reverseArray(arr, x, length - 1);

            // Reverse the entire array
            reverseArray(arr, 0, length - 1);
        }

        public static void reverseArray(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7};
            int positions = 2;

            System.out.println("Original Array: " + Arrays.toString(array));

            rotateArrayLeft(array, positions);

            System.out.println("Rotated Array: " + Arrays.toString(array));
        }
    }

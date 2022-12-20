//Parttern: Two Pointers
// Sort Array consisting of only 0 and 1

import java.util.Scanner;

public class SortArray {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int zero = 0;
        //count number of zeroes
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                zero++;
            }
        }
        System.out.println();
        // 0 to zeroes-1, zeroes to n-1 : 1
        for(int i = 0; i < n; i++){
            if(i < zero){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Array Length: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + "Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("Origin Array: ");
        printArray(arr);
        sortZeroesAndOnes(arr);
        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}

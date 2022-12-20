import java.util.Scanner;

// Given an integer array 'a', return the prefix sum / runing sum in the same array without
// creating a new array.
public class PrefixSum {
    static void printArray(int[] arr){

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter Array Size: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter " + n + " Elements: ");
        printArray(arr);
    }
}

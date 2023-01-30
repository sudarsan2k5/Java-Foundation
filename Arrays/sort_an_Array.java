import java.util.Scanner;

public class sort_an_Array {
    static void sort(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i < count){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
    }
    static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter Value of " + i + "index: ");
            arr[i] = scn.nextInt();
        }
        sort(arr);
        System.out.print("Sorted array is: ");
        printArray(arr);
    }
}

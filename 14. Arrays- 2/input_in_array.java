import java.util.Scanner;

public class input_in_array {
    //METHOD ---> Function
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " Elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
        //Trying to copy arr to arr_2
        int[] arr_2 = arr;
//        for(int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + " ");
        }
    }
}

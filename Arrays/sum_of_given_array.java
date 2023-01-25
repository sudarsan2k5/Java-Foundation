//Problem 1: Calculate the sum of all the elements in the given array.
//
//        Input : arr[] = {1, 5, 3}
//
//        Output: 9

public class sum_of_given_array {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {1, 5, 3};
        for(int i = 0; i < 3; i++){
           sum += arr[i];
        }
        System.out.print(sum);
    }
}

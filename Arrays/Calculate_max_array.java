//Problem 2: Calculate the maximum value out of all the elements in the array.
//
//        Input : arr[] = {1, 5, 3}
//
//        Output : 5

public class Calculate_max_array {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3};
        int max = arr[0];
        for(int i = 1; i < 2; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}

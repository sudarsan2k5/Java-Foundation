//                                    Assignment Questions
//Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
//        Output:
//        2
//        6
//        0
//        4

public class print_positive {
    public static void main(String[] args) {
        int[] arr = {2, 6, -5, -1, 0, 4, -9};
        for(int i = 0; i < 7; i++){
            if(arr[i] >= 0){
                System.out.println(arr[i]);
            }
        }
    }
}

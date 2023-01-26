import java.util.Scanner;

public class Array_sorted_or_not {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int num = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= num){
                num = arr[i];
            }else{
                System.out.print("Not Sorted");
            }
        }
        if(num > 0){
            System.out.print("Sorted");
        }
    }
}

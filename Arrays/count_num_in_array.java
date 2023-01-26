import java.util.Scanner;

public class count_num_in_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter a Num: ");
        int x = scn.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                count++;
            }
        }
        System.out.print(count);
    }
}

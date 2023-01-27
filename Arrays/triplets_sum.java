import java.util.Scanner;

public class triplets_sum {
    static int tripleSum(int[] arr, int trg){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
           for(int j = i + 1; j < n; j++){
               for(int k = j + 1; k < n; k++){
                   if(arr[i] + arr[j] + arr[k] == trg){
                       count++;
                   }
               }
           }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter "+ n + " Elements: ");
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter Target: ");
        int trg = scn.nextInt();
        int sum = tripleSum(arr, trg);
        System.out.print(sum);

    }
}

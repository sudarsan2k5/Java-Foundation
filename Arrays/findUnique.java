import java.util.Scanner;

public class findUnique {
    static int findUnique(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
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
        int sum = findUnique(arr);
        System.out.print(sum);
    }
}

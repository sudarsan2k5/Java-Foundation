import java.util.Scanner;

public class array_manipulation {
    static int findUnique(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }

        }
        int ans = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter "+ n +" Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("Unique Element: " + findUnique(arr));
    }
}

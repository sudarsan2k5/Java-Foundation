import java.util.Scanner;

public class sortArrayByParity {
    static void Parity(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1;
        while(left > right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
                right--;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter Value of Index " + i + ": ");
            arr[i] = scn.nextInt();
        }
        Parity(arr);
    }
}

import java.util.Scanner;

public class first_value_repeting {
    static int firstRepeatingValue(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Enter Array Size: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + "Elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("The first Repeating Number: " + firstRepeatingValue(arr));
    }
}

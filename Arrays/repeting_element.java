import java.util.Scanner;

public class repeting_element {
    static int repting(int[] arr){
        int num = -1;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    num = arr[i];
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter value of "+ i + "index: ");
            arr[i] = scn.nextInt();
        }
        int num = repting(arr);
        System.out.print("The Repating Value is: " + num);
    }
}

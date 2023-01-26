import java.util.Scanner;

public class last_occurrence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter Index " + i);
            arr[i] = scn.nextInt();
        }
        int idx = 0;
        System.out.print("Enter a NUm: ");
        int x = scn.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                idx = i;
            }
        }
        System.out.print("The last occurrence of " + x + "is: " + idx);
    }
}

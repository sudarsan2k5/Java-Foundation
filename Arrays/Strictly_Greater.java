import java.util.Scanner;

public class Strictly_Greater {
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
                if(arr[i] > x){
                    count++;
                }
        }
        System.out.print(count);
    }
}

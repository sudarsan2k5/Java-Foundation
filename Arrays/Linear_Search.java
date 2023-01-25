//Problem 3: Search if the given element x is present in the array or not and find the index. If not present then
//        return the index as -1. (Linear Search)
//
//        Input : arr[] = {1, 5, 3}
//
//        x = 5
//
//        Output : 1

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = scn.nextInt();
        System.out.print("Given element is present or not: ");
        int x = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter value of "+ i + "index: ");
            arr[i] = scn.nextInt();
        }
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                ans = i;
                break;
            }
        }
        System.out.print("The index Of Given Num: " + ans);
    }
}

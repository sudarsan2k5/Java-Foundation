import java.util.Scanner;

public class input_in_2d_Arrays {
    static void printArray2(int[][] arr2){
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int r = scn.nextInt();
        System.out.print("Enter Number of Column: ");
        int c = scn.nextInt();
        int[][] arr2 = new int[r][c];

        System.out.print("Enter " + r * c + "Elements: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr2[i][j] = scn.nextInt();
            }
        }
        printArray2(arr2);
    }
}

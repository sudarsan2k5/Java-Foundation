import java.util.Scanner;

public class matrixMultiplication {
    static void printMatrix(int[][] matrix){

    }
    static void multipiy(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if(c1 != r2){
            System.out.print("Multiplication not Possible - Worng Dimension");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number of rows and columns of matrix 1 : ");
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.print("Enter Matrix Value: ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                arr1[i][j] = scn.nextInt();
            }
        }
        System.out.print("Enter Number of rows and columns of matrx 2 : ");
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.print("Enter Matrix Value: ");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < r2; j++){
                arr2[i][j] = scn.nextInt();
            }
        }
    }
}

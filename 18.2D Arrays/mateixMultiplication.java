import java.util.Scanner;

public class mateixMultiplication {
    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void add(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.print("Worng Input - Addition not Possible: ");
            return;
        }
        int[][] sum = new int[r1][c1];
        for(int i = 0; i < r1; i++){// Rows
            for(int j = 0; j < c1; j++){// Column
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        printMatrix(sum);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number of Rows and Columns of Matrix 1 : ");
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] arr1 = new int[r1][c1];

        System.out.print("Enter Matrix Value: ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                arr1[i][j] = scn.nextInt();
            }
        }
        System.out.print("Enter Number of Rows and Columns of Matrix 2 : ");
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int[][] arr2 = new int[r2][c2];

        System.out.print("Enter Matrix Value: ");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                arr2[i][j] = scn.nextInt();
            }
        }
        System.out.print("Matrix 1");
        printMatrix(arr1);
        System.out.print("Matrix 2");
        printMatrix(arr2);

        add(arr1, r1, c1, arr2, r2, c2);
    }
}

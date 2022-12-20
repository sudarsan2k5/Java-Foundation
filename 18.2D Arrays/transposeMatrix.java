import java.util.Scanner;

public class transposeMatrix {
    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] matrix, int r, int c){
        int[][] ans = new int[c][r];

        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter Number of rows and columns of Matrix: ");
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] matrix = new int[r][c];
        int rotalElemet = r * c;

        System.out.print("Enter " + rotalElemet + " Values: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = scn.nextInt();
            }
        }
        System.out.println("Input Matrix: ");
        printMatrix(matrix);

        System.out.println("Transpose of Matrix: ");
        int[][] ans = findTranspose(matrix, r, c);
        printMatrix(ans);
    }
}

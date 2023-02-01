import java.util.Scanner;

public class Add_two_matrix {
    public class Adition_two_matrix {
        static void print(int[][] matrix){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        static void addMatrix(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
            if(r1 != r2 || c1 != c2){
                return;
            }
            int[][] sum = new int[r1][c1];
            for(int i = 0; i < r1; i++){ // rows
                for(int j = 0; j < r2; j++){ // columns
                    sum[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            print(sum);
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter Number of Rows for First Matrix:  ");
            int r1 = scn.nextInt();
            System.out.print("Enter Number of Columns for Second Matrix:");
            int c1 = scn.nextInt();
            int[][] arr1 = new int[r1][c1];
            System.out.print("Enter Matrix Value: ");
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr1[i].length; i++){
                    arr1[i][j] = scn.nextInt();
                }
            }
            System.out.print("Enter Number of Rows for First Matrix:  ");
            int r2 = scn.nextInt();
            System.out.print("Enter Number of Columns for Second Matrix:");
            int c2 = scn.nextInt();
            int[][] arr2 = new int[r2][c2];
            System.out.print("Enter Matrix Value: ");
            for(int i = 0; i < arr2.length; i++){
                for(int j = 0; j < arr2[i].length; i++){
                    arr2[i][j] = scn.nextInt();
                }
            }
            System.out.print("Matrix 1");
            addMatrix(arr1, r1, c1, arr2, r2, c2);
        }
    }

}

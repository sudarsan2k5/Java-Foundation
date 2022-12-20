public class twoD_Arrays {
    static void printArray(int[][] arr2){
        for(int i  =0; i < arr2.length; i++){ // Rows.....
            for(int j = 0; j < arr2[i].length; j++){// Column
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr2 = {
                {1, 5, 3},
                {7, 8, 9},
                {8, 1, 1}
                };
        printArray(arr2);

    }
}

public class print_positive {
    public static void main(String[] args) {
        int[] arr = {2, 6, -5, -1, 0, 4, -9};
        for(int i = 0; i < 7; i++){
            if(arr[i] >= 0){
                System.out.println(arr[i]);
            }
        }
    }
}

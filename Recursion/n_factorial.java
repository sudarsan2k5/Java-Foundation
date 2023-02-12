public class n_factorial {
    static int fact(int n){ // n = 5
        // base case
        if(n == 0) return 1;
        // Smaller problem - recursive work
        int smallAns = fact(n - 1);
        // Big Problem - self Work
        int ans = n * smallAns;
        return ans;
    }
    public static void main(String[] args) {
    System.out.println(fact(5));
    }
}

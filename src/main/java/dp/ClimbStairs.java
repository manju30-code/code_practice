package dp;

public class ClimbStairs {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if(n == 2 ) return 2;
        if(n == 3 ) return 3;
        int total = 0;
        int prev1 = 3;
        int prev2 = 2;
        for (int i = 3; i<n; i++){
            total = prev1 + prev2;
            prev2 = prev1;
            prev1 = total;
        }
        return total;

    }
    public int climbStairsRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if(n == 2 ) return 2;
        return climbStairsRecursive(n-1) + climbStairsRecursive(n-2);
    }

    public static void main(String[] args){
        System.out.println(new ClimbStairs().climbStairs(4));
        System.out.println("************");
        System.out.println(new ClimbStairs().climbStairsRecursive(10));
    }
}

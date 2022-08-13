class binaryR {
    public static void main(String[] args) {
        int[] coins = {3,5,7};
        //fn(coins, 0, 0);
        
    }
    public static void fn(int[] coins, int i, int sum, int cnt) {
        if(i>= coins.length) {
            System.out.println(sum + " " + cnt);
            return;
        }
        fn(coins, i+1, sum, cnt);
        fn(coins, i+1, sum+coins[i], cnt+1);
    }
}
class Solution {
    public int findJudge(int n, int[][] trust) {
        // judge must be trusted n times
        // judge must not trust anybody else

        int[] incoming = new int[n+1];
        int[] outgoing = new int[n+1];

        for(int i = 0; i < trust.length; i++){
            outgoing[trust[i][0]]++;
            incoming[trust[i][1]]++;
        }

        for(int i = 1; i <= n; i++){
            if(incoming[i] == n-1 && outgoing[i] == 0){
                return i;
            }
        }
        return -1;



    }
}
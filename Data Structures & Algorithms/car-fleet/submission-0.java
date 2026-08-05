class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // sort the cars by position descending
        int len = position.length;
        int[][] pair = new int[len][2];
        for(int i = 0; i < len; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b)-> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for(int[] car : pair){
            double time = (double)(target-car[0])/car[1];
            stack.push(time);
            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)){
                // previous car faster, don't add to stack
                stack.pop();
            }
        }
        return stack.size();

    }

}

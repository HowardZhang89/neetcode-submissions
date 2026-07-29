class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a : asteroids){
            boolean isAlive = true;
            while(isAlive && !stack.isEmpty() && 
                        stack.peek() > 0 && a < 0){
                int top = stack.peek();
                if(Math.abs(a) > top){
                    stack.pop();
                }else if(Math.abs(a) == top){
                    stack.pop();
                    isAlive = false;
                }else{
                    isAlive = false;
                }
            }
            if(isAlive){
                stack.push(a);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();   
    }
}
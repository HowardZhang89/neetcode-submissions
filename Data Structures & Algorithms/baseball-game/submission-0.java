class Solution {
    public int calPoints(String[] operations) {
        int score = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }else if(operations[i].equals("C")){
                stack.pop();
            }else if(operations[i].equals("D")){
                int val = stack.peek();
                stack.push(val * 2);
            }else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        for(int points : stack){
            score += points;
        }
        return score;
    }
}
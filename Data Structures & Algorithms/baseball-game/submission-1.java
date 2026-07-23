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
                score += newTop;
            }else if(operations[i].equals("C")){
                score -= stack.pop();
            }else if(operations[i].equals("D")){
                stack.push(stack.peek() * 2);
                score += stack.peek();
            }else{
                stack.push(Integer.parseInt(operations[i]));
                score += stack.peek();
            }
        }
        return score;
    }
}
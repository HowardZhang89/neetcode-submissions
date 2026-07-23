class Solution {
    public int calPoints(String[] operations) {
        int score = 0;
        Stack<Integer> stack = new Stack<>();
        int top, newTop;
        for(String operation : operations){
            if(operation.equals("+")){
                top = stack.pop();
                newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
                score += newTop;
            }else if(operation.equals("C")){
                score -= stack.pop();
            }else if(operation.equals("D")){
                stack.push(stack.peek() * 2);
                score += stack.peek();
            }else{
                stack.push(Integer.parseInt(operation));
                score += stack.peek();
            }
        }
        return score;
    }
}
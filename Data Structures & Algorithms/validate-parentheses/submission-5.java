class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(isOpeningBracket(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                char last = stack.pop();
                if(last != expectedOpeningBracket(c)){
                        return false;
                }              
            }
        }
        return stack.isEmpty();
    }

    boolean isOpeningBracket(char c){
        return c == '[' || c == '{' || c == '(';
    }

    char expectedOpeningBracket(char c){
        if(c == ']') return '[';
        if(c == '}') return '{';
        if(c == ')') return '('; 
        return ' ';
    }
}

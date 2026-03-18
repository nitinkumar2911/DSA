class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
        
        
    }
    private String build(String s ){
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c != '#'){
                stack.push(c);
            }else{
                if(!stack.empty()){
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
}
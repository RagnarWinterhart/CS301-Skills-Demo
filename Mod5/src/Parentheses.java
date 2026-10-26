import java.util.Stack;
public class Parentheses {
    /*
    Write a stack client Parentheses.java that reads a string of parentheses,
    square brackets, and curly braces from standard input and uses a stack to
    determine whether they are properly balanced. For example, your program
    should print true for [()]{}{[()()]()} and false for [(]).
     */
    public static void main(String[] args) {
        StdOut.println("Enter a string of [] () {}'s.");
        String s = StdIn.readString();
        Stack<Character> stack = new Stack<>();
        StdOut.println(isBalanced(stack, s));
    }
    public static boolean isBalanced(Stack<Character> stack, String s){
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if(stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if(c == ']' && open != '[' || c == '}'
                        && open != '{' || c == ')' && open != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

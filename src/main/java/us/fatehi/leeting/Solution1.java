import java.util.Stack;

public class Solution1 {

        public static void main(String args[]) {
            Solution1 main = new Solution1();
            System.out.println("\"" + "([)]" + "\" --> " + main.isValid("([)]"));
            
            System.out.println("\"" + "()[]{}" + "\" --> " + main.isValid("([)]"));

            System.out.println("\"" + "([])" + "\" --> " + main.isValid("([)]"));
        }

        public boolean isValid(String s) {
            if (s == null)  return true;
            Stack<Boolean> curly = new Stack<Boolean>();
            Stack<Boolean> square = new Stack<Boolean>();
            Stack<Boolean> round = new Stack<Boolean>();
            Stack<Character> lastopen = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                char currchar = s.charAt(i);
                switch (currchar) {
                    case '{':
                        curly.push(true);
                        lastopen.push('{');
                        break;
                    case '}':
                        if (curly.isEmpty()) {
                            return false;
                        }  
                        if (lastopen.pop() != '{') {
                            return false;
                        }  
                        curly.pop();
                        break;
                    case '[':
                        square.push(true);
                        lastopen.push('[');
                        break;
                    case ']':
                        if (square.isEmpty()) {
                            return false;
                        }        
                        if (lastopen.pop() != '[') {
                            return false;
                        }            
                        square.pop();
                        break;
                    case '(':
                        round.push(true);
                        lastopen.push('(');
                        break;
                    case ')':
                        if (round.isEmpty()) {
                            return false;
                        }  
                        if (lastopen.pop() != '(') {
                            return false;
                        }                     
                        round.pop();
                        break;
                } 
            }
            return curly.isEmpty() && square.isEmpty() && round.isEmpty();
        }
    }

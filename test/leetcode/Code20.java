package leetcode;
//有效的括号
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 *     左括号必须用相同类型的右括号闭合。
 *     左括号必须以正确的顺序闭合。
 */

/**
 1、如果字符串为空，则true
     遍历字符串
 2、如果是左括号，则直接入栈
     如果是右括号，则将其与栈顶元素进行匹配
     如果此时栈为空，则说明右括号多，false
     如果不匹配，false
     如果匹配，则出栈
     最后检查栈是否为空，若不为空，说明左括号多，false
 */
public class Code20 {
    public static boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        char[] chars=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:chars){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            } else if(stack.isEmpty()){
                return false;
            }else if(c==']'&&stack.peek()=='['){
                stack.pop();
            }else if(c=='}'&&stack.peek()=='{'){
                stack.pop();
            }else if(c==')'&&stack.peek()=='('){
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
}

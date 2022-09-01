package leetcode;

import java.util.Stack;

//有效的括号
public class Code20_2 {
    public static boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        char[] chars=s.toCharArray();
        for(char c:chars){
            if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='{'){
                stack.push('}');
            }else if(stack.isEmpty()||c!=stack.pop()){
                return false;
            }
        }
        //这里不能直接return true，因为存在"(("的情况，这种就不为空，但是也不会进入上面return false的判断里
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }
}

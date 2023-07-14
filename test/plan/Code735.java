package plan;

import java.util.Stack;

public class Code735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        stack.push(asteroids[0]);
        int index=1;
        while (index<asteroids.length){
            //栈顶元素大于0（向右）,要入栈的元素小于0（向左）,说明会发生碰撞
            if (!stack.isEmpty()&&stack.peek()>0&&asteroids[index]<0){
                int top=Math.abs(stack.peek());
                int newNum=Math.abs(asteroids[index]);
                if(top>newNum){
                    index++;
                }else if(top==newNum){
                    stack.pop();
                    index++;
                }else {
                    stack.pop();
                }
            }else{
                stack.push(asteroids[index]);
                index++;
            }
        }
        int[] array=new int[stack.size()];
        int i=0;
        for(int s:stack){
            array[i++]=s;
        }
        return array;
    }
}

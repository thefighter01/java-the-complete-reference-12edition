package Interfaces;


import java.util.EmptyStackException;

public class DynStack implements IntStack{
    private int[] stack;
    private int top;
    public DynStack(int size) {
        stack = new int[size];
        top = -1;
    }
    public int pop(){
        if (top == -1){
            System.out.println("Stack is empty");
            return 0;
        }else return stack[top--];
    }
    public void push(int x){
        if (top == stack.length-1){
            int [] temp = new int[stack.length*2];
            for (int i = 0; i < stack.length; i++){
                temp[i] = stack[i];
            }
            stack = temp;
            stack[++top] = x;
        }else stack[++top] = x;
    }
}

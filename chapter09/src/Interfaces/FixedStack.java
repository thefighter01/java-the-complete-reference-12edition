package Interfaces;


public class FixedStack implements IntStack{
    private int size;
    private int[] stack;
    FixedStack(int size){
        this.size = -1;
        this.stack = new int[size];
    }
    public void push(int x){
        if (size == stack.length -1){
            System.out.println("Stack is full");
        }else {
            stack[++size] = x;
        }
    }
    public int pop(){
        if (size == -1){
            System.out.println("Stack is empty");
            return 0;
        }else
            return stack[size--];
    }
}

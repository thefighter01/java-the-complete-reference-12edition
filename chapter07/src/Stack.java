public class Stack {
    private int [] stck = new int [10];
    private int top = -1;

    Stack(){
        top = -1;
    }
    void push(int x){
        if (top == 9) {
            System.out.println("Stack is full");
            return;
        }
        stck[++top] = x;
    }

    int pop(){
        if (top == -1) {
            System.out.println("Stack is empty");
            return 0;
        }
        return stck[top--];
    }
}

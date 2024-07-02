public class TestStack {
    public static void main(String[] args) {
        Stack st1 = new Stack();
        Stack st2 = new Stack();

        for (int i = 0; i < 10; i++) {
            st1.push(i);
        }

        for (int i = 10; i <20; i++) {
            st2.push(i);
        }
        System.out.println("Stack 1: ");
        for (int i = 0; i <10; i++) {
            System.out.println(st1.pop());
        }

        System.out.println("Stack 2: ");
        for (int i = 0; i <10; i++) {
            System.out.println(st2.pop());
        }
    }
}

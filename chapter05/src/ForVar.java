public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i = 0;
        for (;!done;){
            System.out.println("the Value of i is " + i);
            if (i == 10) done = true;
            ++i;
        }
    }
}

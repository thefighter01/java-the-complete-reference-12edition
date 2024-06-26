public class NoBody {
    public static void main(String[] args) {
        int i , j;
        i = 100 ; j = 200;
        // i need to find the mid point between i and j
        while(++i < --j);
        System.out.println("mid point is " + i + " and j is " + j);

    }
}

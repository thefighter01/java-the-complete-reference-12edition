public class Wrap {
    public static void main(String[] args) {

        Integer current = Integer.valueOf(100); // this called boxing process , Wrap this value inside an object of numerical type Wrapper

        int valueInsideObject = current.intValue(); // this process called unboxing

        System.out.println(valueInsideObject + " " + current);
    }
}

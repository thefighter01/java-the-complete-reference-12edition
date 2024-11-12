package comm;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer [] inums = {2 , 5 ,32 , 6 , 3 , 1};
        Character [] chs = {'b' , 'a' , 'd' , 'x'};

        MyClass<Integer> iOb = new MyClass<>(inums);

        MyClass<Character> cOb = new MyClass<>(chs);

        System.out.println("Max value in inums is " + iOb.getMax());
        System.out.println("Min value in inums is " + iOb.getMin());


        System.out.println("Max value in chs is " + cOb.getMax());
        System.out.println("Min value in chs is " + cOb.getMin());
    }
}

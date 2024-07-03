public class StaticByName {
    int testVar = 0;
    public static void main(String[] args) {
        StaticDemo.callMe();
      //  System.out.println(testVar);
        // will give me errors

    }

    public void test(){
        StaticDemo.callMe();
    }
}

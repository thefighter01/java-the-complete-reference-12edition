public class TestNestedStatic {
    private int cur = 29;

    static int var = 30;

    static void meow(){
        System.out.println("Meow");
    }

    void  testWithoutStaic(){
        A obj = new A();

        obj.m();
        obj.hay();

        TestNestedStatic obj2 = new TestNestedStatic();

//       obj.meow();
//
//       A.meow();
//
//
//
//        System.out.println(obj.var);
       
    }


    static class A {

        void m() {
            System.out.println("A.m()");
        }

        static void hay(){
            System.out.println("A.hay()" + " " + var);

            meow();

        }
    }
}

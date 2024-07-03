
public class Outer {
    int outer_x = 100;

    private int outer_y = 10;

    static int just = 3;


    void test(){
       Inner inner = new Inner();
      inner.display();

    }

    void test2(){
        for (int i = 0; i < 10; ++i){
            class Inner{
                void display(){
                    System.out.println(outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }

    static void hell(){
        System.out.println("inside hell");
    }



    class Inner {
        int y = 10;
        void display(){
            System.out.println(outer_x + " " + outer_y+  " "+just);
            hell();

        }
    }

    void show(){
      //  System.out.println(y); this will give me an error
    }

}

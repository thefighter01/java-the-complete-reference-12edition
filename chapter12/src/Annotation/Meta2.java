package Annotation;

import java.lang.reflect.Method;

public class Meta2 {

    @MyAnno(str = "someShit" , val = 200)
    public static void myMeth(String s , int i){
        Meta2 ob = new Meta2();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno an = m.getAnnotation(MyAnno.class);
            System.out.println(an.str() + "  lol    " + an.val());

        }
        catch (NoSuchMethodException e) {
           System.out.println("NoSuchMethodFound");
        }
    }
    public static void main(String[] args) {
        myMeth("test" , 10);
    }
}

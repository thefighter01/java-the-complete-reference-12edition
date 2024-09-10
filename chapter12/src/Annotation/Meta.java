package Annotation;

import java.lang.reflect.Method;

public class Meta {

    @MyAnno(str = "Annotation Example" , val = 100)
    public static void  myMeth(){
        Meta ob = new Meta();
        try {
        Class<?> c = Meta.class;

        Method m = c.getMethod("myMeth");

        MyAnno an = m.getAnnotation(MyAnno.class);

        System.out.println(an.str() + "  "+ an.val());
        System.out.println(an);

        }catch (NoSuchMethodException e){
            System.out.println("Method not found");

        }
    }
    public static void main(String []args){
        myMeth();

    }
}

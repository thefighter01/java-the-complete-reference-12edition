package Annotation;

import java.lang.annotation.Annotation;

@MyAnno(str = "just annotation for fucken Class" , val = 8000000)
@What(description = "it's a fucken Class type")
public class Meta3 {

    @MyAnno(str = "just let's fucken Go" , val = 6000000)
    @What(description = "just it's not for babies")
    public static void myMeth() {
        Meta3 ob = new Meta3();

        try{
            System.out.println("Annoations for method");
            for (Annotation an : ob.getClass().getMethod("myMeth").getAnnotations()) {
                System.out.println(an);
            }

            System.out.println("Annoations for fucken Class");

            for (Annotation an : ob.getClass().getAnnotations()) {
                System.out.println(an);
            }

            System.out.println("Annoations for fucken Go");

            for (Annotation an : ob.getClass().getDeclaredAnnotations()) {
                System.out.println(an);
            }

            if (ob.getClass().getMethod("myMeth").isAnnotationPresent(MyAnno.class)) {
                System.out.println("MyAnno is " + ob.getClass().getMethod("myMeth").getAnnotation(MyAnno.class));
            }

        }catch (NoSuchMethodException e){
            System.out.println("no such method found");
        }

    }

    public static void main(String []args){
        myMeth();
    }
}

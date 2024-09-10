
public class Meta3 {

    @MyAnno
    public static void myMeth(){

        Meta3 ob = new Meta3();

        try{
            MyAnno anno = ob.getClass().getMethod("myMeth").getAnnotation(MyAnno.class);

            System.out.println(anno.str() + "  "+ anno.value());
        }catch (NoSuchMethodException e){
            System.out.println("method not found");
        }

    }
    public static void main(String[] args) {
        myMeth();
    }
}

package RestOfTheChapter;

public class Marker {
    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();

        try{

            MyMarker myMarker = ob.getClass().getMethod("myMeth").getAnnotation(MyMarker.class);

            if (ob.getClass().getMethod("myMeth").isAnnotationPresent(MyMarker.class)) {
                System.out.println("marker annotation present");
            }


        }catch (NoSuchMethodException e){
            System.out.println("method not found");
        }
    }

    public static void main(String []args){
        myMeth();
    }
}

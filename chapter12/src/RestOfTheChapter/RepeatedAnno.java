package RestOfTheChapter;

public class RepeatedAnno {

    @MyAnno()
    @MyAnno(str = "come on let's fucken go" , val = 6000000)
    public static void myMeth(String str , int val){

        RepeatedAnno ob = new RepeatedAnno();

        try{
            System.out.println(ob.getClass().getMethod("myMeth", String.class, int.class).getAnnotation(MyRepeatedAnnos.class));
            System.out.println("///////////////");
          var annos  = ob.getClass().getMethod("myMeth", String.class, int.class).getDeclaredAnnotationsByType(MyAnno.class);
          System.out.println(annos[1]);

        }catch(NoSuchMethodException e){
            System.out.println("method not found");
        }


    }
    public static void main(String[] args) {
        myMeth("" , 0);
    }
}

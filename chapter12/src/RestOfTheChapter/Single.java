package RestOfTheChapter;


public class Single {

    @MySingle(100)
    public static void myMeth(){
        Single ob = new Single();
        try{
            MySingle mySingle = ob.getClass().getMethod("myMeth").getAnnotation(MySingle.class);

            System.out.println(mySingle);
        }catch (NoSuchMethodException e){
            System.out.println("Method not found");
        }

    }
    public static void main(String[] args) {
        myMeth();
    }
}

package TypeAnnotations;

public class TypeAnnoDemo <@What (description = "Generic data type ")T>{
    public @Unique TypeAnnoDemo(){}

    @TypeAnno String str;

    @EmptyOk String test;

    public int f(@TypeAnno TypeAnnoDemo<T> this  , int x){
        return 10;
    }

    public @TypeAnno Integer f2 (int j , int k){
        return j+k;
    }

    public @Recommended Integer f3 (String str){
        return str.length() / 2;
    }
    public void f4() throws @TypeAnno NullPointerException{

    }


    @TypeAnno Integer [] vec;

    String @MaxLen(10)[] @NotZeroLen [] w;

    public static void myMeth(int i){
       TypeAnnoDemo<@TypeAnno Integer > ob = new TypeAnnoDemo<@TypeAnno Integer >();

       @Unique TypeAnnoDemo< Integer > obj = new @Unique TypeAnnoDemo< Integer >();
       Object x = Integer.valueOf(10);

       Integer y;
       y = (@TypeAnno Integer)x;


    }

    public static void main(String[] args) {
        myMeth(1);
    }

    class SomeClass extends @TypeAnno TypeAnnoDemo<String> {}



}
/*
@TypeAnno ElementType.TYPE_USE
@MaxLen ElementType.TYPE_USE
@NotZeroLen ElementType.TYPE_USE
@Unique ElementType.TYPE_USE
@What ElementType.TYPE_PARAMETER
@EmptyOK ElementType.FIELD
@Recommended ElementType.METHOD
 */
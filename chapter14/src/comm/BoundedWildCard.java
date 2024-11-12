package comm;


public class BoundedWildCard {
    static void showXY(Coords<?> c){
        System.out.println("x and y values");
        for (int i = 0; i < c.coords.length; ++i){
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("x and y  and z values");
        for (int i = 0; i < c.coords.length; ++i){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " "+c.coords[i].z);

        }
        System.out.println();
    }
    static void showAll(Coords<? extends FourD> c){
        System.out.println("x and y and z and t values");
        for (int i = 0; i < c.coords.length; ++i){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " "+c.coords[i].z + " "+c.coords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        var cur = new TwoD(2 , 2);

        TwoD [] td = {
                new TwoD(0 , 0) ,
                new TwoD(1 , 1) ,
                new TwoD(2 , 2) ,
                new TwoD(3 , 3)
        };


        Coords<TwoD> tdlocs = new Coords<TwoD>(td);

        System.out.println("content of tdlocs");
        showXY(tdlocs);


        FourD [] fd = {
                new FourD(1 , 1, 1  , 1) ,
                new FourD(2 , 2, 2 , 2) ,
                new FourD(3 , 3 , 3 , 3) ,
                new FourD(4 , 4 , 4 , 4)
        };

        Coords<FourD> fdlocs = new Coords<>(fd);

        System.out.println("content of fd");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}

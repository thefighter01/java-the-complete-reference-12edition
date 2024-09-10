public class AutoBox3 {
    public static void main(String[] args) {
        int i ;
        Integer iOb , iOb2;

        iOb = 100;
        System.out.println("Original value of iOb "+ iOb);
        ++iOb;

        System.out.println("After ++iOb "+ iOb);

        iOb2 = iOb + (iOb / 3);

        System.out.println("After iOb2 expression "+ iOb2);
        i = iOb + (iOb / 3);
        System.out.println("After i expression "+ i);
    }
}

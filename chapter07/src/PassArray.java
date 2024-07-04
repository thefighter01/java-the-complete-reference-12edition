public class PassArray {
    static void vaTest(int []v){
        System.out.println("Number of args in array: " + v.length);

        for (var cur : v){
            System.out.print(cur + " ");
        }

        System.out.println("\n" + "///////////////////////");
    }

    public static void main(String[] args) {
        int n1 [] = {10};
        int n2 [] = {1 , 2 , 3};
        int [] n3 = {};
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);


    }


}

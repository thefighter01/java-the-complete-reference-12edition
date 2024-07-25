public class test {

    test(){
        show("constructor");
    }
    private static void print(Integer []ans){
        for (int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }

    private static void print(int a){
     //   print(new Integer[]{a});
        System.out.println(a);
        //show("never give up");
    }

    void show(String a){
        System.out.println(a);
        print(10);
    }




    public static void main(String[] args) {

        var ans = new int[5];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = i;
        }
       // print(ans);
        Integer a = 10;

        new test();


    }
}

package resuming;

abstract class A {
    abstract void callMe();

    // concrete methods are still allowed in abstract class
    void callMeToo(){
        System.out.println("This is a concrete method");
    }
}

package p2;


public class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("OtherPackage Constructor");

        // can access only public members
        System.out.println(p.n_pub);
    }
}

package p1;

public class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("Same package constructor");
        System.out.println(" n = " + p.n);

        // can not access any private members it's allowed in the class only


        System.out.println(" n_pro = " + p.n_pro);

        System.out.println(" n_pub = " + p.n_pub);
    }
}

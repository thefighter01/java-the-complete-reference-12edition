package p2;


class Protection2 extends p1.Protection {
    Protection2(){
        System.out.println("Protection2 constructor");

        // can access only protected and public
        System.out.println("n_pro "+n_pro);

        System.out.println("n_pub "+ n_pub);
    }
}

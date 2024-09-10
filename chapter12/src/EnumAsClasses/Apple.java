package EnumAsClasses;

public enum Apple {
    Jonathan(10) , GoldenDel(9) , RedDel , winesap(15) , Cortland(8);
    // all constants inside enumerations are objects of type Apple

    private int price;
    Apple(int value) {
        this.price = value;
        System.out.println("Apple constant: " + this.ordinal() + "  "+ this);
    }

    Apple(){
        price = -1;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}

package laba4_;
public abstract class SystemUnit{
    protected String name;
    protected int price;
    protected SystemUnit(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    abstract void doGet();
}

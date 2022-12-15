package laba4_;
public abstract class SystemUnit{
    String name;
    int price;
    SystemUnit(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    abstract void doSomething();
}

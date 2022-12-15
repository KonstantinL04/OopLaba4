package laba4_;
public class Components extends SystemUnit{
    Components(String name, int price){
        super(name,price);
    }
    @Override
    void doSomething(){
        System.out.println("Название комплектующего: " + name + " Цена: " + price + " рублей");
    }
}

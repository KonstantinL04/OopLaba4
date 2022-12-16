package laba4_;

public class PowerSupply extends Components{
    private int power;
    PowerSupply(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }
    @Override
    void doGet(){
        System.out.println("Название комплектующего: " + name + "; Цена: " + price + " рублей; " +
                "Мощность: " + power + " Wat");
    }
}

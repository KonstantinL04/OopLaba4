package laba4_;

public class MotherBoard extends Components{
    private int countUSB;
    private int countSlotsRAM;
    public MotherBoard(String name, int price, int countUSB, int countSlotsRAM){
        super(name,price);
        this.countUSB = countUSB;
        this.countSlotsRAM = countSlotsRAM;
    }
    @Override
    void doSomething(){
        System.out.println("Название комплектующего: " + name + "; Цена: " + price + " рублей; " +
                "Количество USB-слотов: " + countUSB + " шт.; Количество RAM-слотов: " +
                countSlotsRAM + " шт.");
    }
}

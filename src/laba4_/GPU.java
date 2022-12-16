package laba4_;

public class GPU extends Components{
    private int countRam;
    private int countCooler;
    public GPU(String name, int price, int countRam, int countCooler){
        super(name,price);
        this.countRam = countRam;
        this.countCooler = countCooler;
    }
    @Override
    void doGet(){
        System.out.println("Название комплектующего: " + name + "; Цена: " + price + " рублей; Количество видеопамями: " +
                countRam + " ГБ; Количество кулеров: " + countCooler + " шт.");
    }
}

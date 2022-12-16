package laba4_;

public class Processor extends Components{
    private float frequencyCPU;
    private int heatDissipation;
    public Processor(String name, int price, int frequencyCPU, int heatDissipation) {
        super(name,price);
        this.frequencyCPU = frequencyCPU;
        this.heatDissipation = heatDissipation;
    }
    @Override
    void doGet(){
        System.out.println("Название комплектующего: " + name + "; Цена: " + price + " рублей; " +
                "Частота процессора: " + frequencyCPU + " ГГц; Теплоотдача: " + heatDissipation + " Wat");
    }
}

package laba4_;
import java.util.Scanner;
public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    public static void start() {
        getMainMenu();
    }

    private static void getMainMenu() {
        int choice;
       // boolean working = true;
        do {
            System.out.println("\n------------------Главное меню------------------");
            System.out.println("1 - Создать комплектующие системного блока");
            System.out.println("2 - Посмотреть список комплектующих");
            System.out.println("3 - Выполнить действия всех комплектующих");
            System.out.println("4 - Выполнить действие конкретного комплектующего");
            System.out.println("5 - Удалить комплектующее по названию");
            System.out.println("0 - Выход из программы\n");
            System.out.print("Ваш выбор: ");

            choice = readChoice();

            String name;
            switch (choice) {
                case 1:
                    createSystemUnit();
                    break;
                case 2:
                    Assembling.getSystemUnitList();
                    break;
                case 3:
                    Assembling.doAllActivities();
                    break;
                case 4:
                    if (Assembling.ifNullList() == true){
                        break;
                    }
                    else {
                        System.out.print("Введите название комплектующего, действие которого Вы хотите посмотреть: ");
                        name = scanner.nextLine();
                        Assembling.doSelectedActivity(name);
                        break;
                    }
                case 5:
                    if(Assembling.ifNullList() == true){
                        break;
                    }
                    else {
                        System.out.print("Введите название комплектующего, которое Вы хотите удалить: ");
                        name = scanner.nextLine();
                        Assembling.deleteSelectedSystemInit(name);
                        break;
                    }
                case 0:
                    System.out.println("Выход из программы...");
                    break;
                default:
                    System.out.println("Такой команды не существует!");
            }
        } while (choice!=0);
    }

    private static void createSystemUnit() {
        System.out.println("1 - Процессор");
        System.out.println("2 - Материнская плата");
        System.out.println("3 - Видеокарта");
        System.out.println("4 - Блок питания");
        System.out.print("Какое комплектующее Вы хотите добавить: ");

        String name;
        int price;

        int choice = Menu.readChoice();
        switch (choice) {
            case 1:
                System.out.print("Введите название процессора: ");
                name = scanner.nextLine();
                System.out.print("Введите цену процессора в рублях: ");
                price = readChoice();
                System.out.print("Введите частоту процессора в ГГц: ");
                int frequencyCPU = readChoice();
                System.out.print("Введите тепловыделение процессора в Wat: ");
                int heatDissipation = readChoice();
                Assembling.systemUnits.add(new Processor(name, price, frequencyCPU, heatDissipation));
                System.out.println("------------Успешно добавлено!------------");
                return;
            case 2:
                System.out.print("Введите название материнской платы: ");
                name = scanner.nextLine();
                System.out.print("Введите цену материнской платы в рублях: ");
                price = readChoice();
                System.out.print("Введите количество USB-слотов материнской платы: ");
                int countUSB = readChoice();
                System.out.print("Введите количество RAM-слотов материнской платы: ");
                int countRAM = readChoice();
                Assembling.systemUnits.add(new MotherBoard(name, price, countUSB, countRAM));
                System.out.println("------------Успешно добавлено!------------");
                return;
            case 3:
                System.out.print("Введите название видеокарты: ");
                name = scanner.nextLine();
                System.out.print("Введите цену видеокарты в рублях: ");
                price = readChoice();
                System.out.print("Введите количество ГБ памяти видеокарты: ");
                int countRam = readChoice();
                System.out.print("Введите количество кулеров видеокарты: ");
                int countCooler = readChoice();
                Assembling.systemUnits.add(new GPU(name, price, countRam, countCooler));
                System.out.println("------------Успешно добавлено!------------");
                return;
            case 4:
                System.out.print("Введите название блока питания: ");
                name = scanner.nextLine();
                System.out.print("Введите цену блока питания в рублях: ");
                price = readChoice();
                System.out.print("Введите мощность блока питания в Wat: ");
                int power = readChoice();
                Assembling.systemUnits.add(new PowerSupply(name, price, power));
                System.out.println("---------------Успешно добавлено!---------------");
                return;
            default:
                createSystemUnit();
        }
    }

    private static int readChoice() {
        Scanner in = new Scanner(System.in);
        int readed;
        try {
            readed = Integer.parseInt(in.nextLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Ошибка! Допустим только ввод значений пунктов меню");
            readed = readChoice();
        }
        return readed;
    }
}
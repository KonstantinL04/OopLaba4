package laba4_;
import java.util.ArrayList;
public class Assembling {
    protected static final ArrayList<SystemUnit> systemUnits = new ArrayList<SystemUnit>();
    public static void deleteSelectedSystemInit(String name) {
        for (SystemUnit systemUnit: systemUnits) {
            if (systemUnit.getName() == null ? name == null : systemUnit.getName().equals(name)) {
                systemUnits.remove(systemUnit);
                System.out.println("Успешно удалено!");
                return;
            }
        }
        System.out.println("Комплектующего с выбранным названием не существует!");
    }

    public static void doSelectedActivity(String name) {
        ifNullList();
        for (SystemUnit systemUnit: systemUnits) {
            if (systemUnit.getName() == null ? name == null : systemUnit.getName().equals(name)) {
                systemUnit.doGet();
                return;
            }
        }
        System.out.println("Комплектующего с выбранным названием не существует!");
    }

    public static void doAllActivities() {
        ifNullList();
        System.out.println();
        for (SystemUnit systemUnit: systemUnits) {
            systemUnit.doGet();
        }
        System.out.println();
    }

    public static void getSystemUnitList() {
        ifNullList();
        System.out.println();
        for (int i = 0; i < systemUnits.size(); i++) {
            System.out.println((i + 1) + " - " + systemUnits.get(i).getName());
        }
        System.out.println();
    }
    public static boolean ifNullList(){
        if (systemUnits.isEmpty()) {
            System.out.println("Для этого добавьте хотя бы одно комплектующее...");
            return true;
        }
        else return false;
    }
}

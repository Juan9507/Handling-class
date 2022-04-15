package handlingclassobject;

/**
 * Manejando clases y objetos en Java
 * @author Juan David Rivera
 */
public class HandlingClassObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.colors.add("Blue");
        fruit.addFruit();
        System.out.println(fruit.getColors());
    }
    
}

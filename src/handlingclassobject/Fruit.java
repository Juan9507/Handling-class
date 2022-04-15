package handlingclassobject;

import java.util.ArrayList;

/**
 *
 * @author Juan David Rivera
 */
public class Fruit {
    //Atributos de la clase fruta
    
    /**
     * Atributo publico para el nomrbe de la fruta
     */
    public String name;
    
    /**
     * Atributo privado para el peso promedio de la fruta
     */
    private float averageWeight;
    
    /**
     * Atributo publico para el color 
     */
    public String color;
    
    /**
     * Atributo array list para almacenar varios colores
     */
    public ArrayList<String> colors;
    
    //Metodo Constructor
    
    /**
     * Constructor para inicializar los atributos
     */
    public Fruit(){
        this.name = "apple";
        this.averageWeight = 2.3f;
        this.color = "red";
        this.colors = new ArrayList<>();
    }
    
    //Metodos propios de la clase fruit
    
    /**
     * Metodo para agregar el color al array list
     */
    public void addFruit(){
        this.colors.add(this.color);
    }
    
    /**
     * sobrecarga del Metodo addFruit para agregar el color al array list 
     * dependiendo del parametro
     * @param color 
     */
    public void addFruit(String color){
        this.colors.add(color);
    }
    
    //Setters and Getters
    
    /**
     * Metodo getter para retonar el nombre de la fruta
     * @return 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Metodo setter para modificar el nombre de la fruta
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Metodo getter para retornar el peso promedio de la fruta
     * @return 
     */
    public float getAverageWeight() {
        return averageWeight;
    }
    
    /**
     * Metodo setter para modificar el peso promedio de la fruta
     * @param averageWeight 
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    
    /**
     * Metodo setter para modificar el color de la fruta
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Metodo getter del arrayList para mostrar la lista
     * @return 
     */
    public ArrayList<String> getColors() {
        return colors;
    }
    
    
}

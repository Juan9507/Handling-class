package handlingclassobject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Juan David Rivera
 */
public class Person {

    /**
     * Atributo público para el nombre
     */
    public String name;
    /**
     * Atributo público para el primer apellido
     */
    public String lastName1;
    /**
     * Atributo público para el segundo apellido
     */
    public String lastName2;
    /**
     * Atributo público para la fecha de nacimiento
     */
    public Date dateBirth;
    /**
     * Atributo público para la altura
     */
    public float height;
    
    //Metodos constructores
    
    /**
     * Constructor sin parametros para crear una instacia de la clase Person
     */
    public Person() {
        this.name = "Juan";
        this.lastName1 = "Rivera";
        this.lastName2 = "Naranjo";
        this.dateBirth = null;
        this.height = 1.75f;
    }
    
    //Metodos de la clase Person
    
    /**
     * Metodo que recibe una cadena para darle el formato a la fecha
     *
     * @param date parametro para la fecha
     * @throws ParseException para la fecha de nacimiento
     */
    public void parseDate(String date) throws ParseException {
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        this.dateBirth = format.parse(date);
    }
    
    //Metodo setters y getters
    
    /**
     * método para acceder al valor del atributo name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * método para modificar el valor del atributo name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo para acceder al valor del atributo lastName1
     *
     * @return
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Metodo para modificar el atributo de lastName1
     *
     * @param lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Metodo para acceder al atributo lastName2
     *
     * @return
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Metodo para modificar el valor del atributo lastName2
     *
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Metodo para acceder al valor del atributo dateBirth
     *
     * @return
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Metodo para modificar el valor del atributo dateBirth
     *
     * @param dateBirth
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Metodo para acceder al valor del atributo height
     *
     * @return
     */
    public float getHeight() {
        return height;
    }

    /**
     * Metodo para modificar el valor del atributo height
     *
     * @param height
     */
    public void setHeight(float height) {
        this.height = height;
    }

}

package handlingclassobject;

/**
 *
 * @author Juan David Rivera
 */
public class BankAccount {
    
    // Atributos
    
    /**
     * Atributo private para el numero de la cuenta
     */
    private int accountNumber;
    
    /**
     * Atributo booleano para la activación de la cuenta
     */
    protected boolean activated;
    
    //Metodos constructor
    
    /**
     * Metodo constructos por defecto para inicializar los atributos
     */
    public BankAccount(){
        this.accountNumber = 3;
        this.activated = true;
    }
    
    /**
     * Metodo constructor para iniciar los atributos dependiendo 
     * los parametros
     * @param accountNumbre
     * @param activated 
     */
    public BankAccount(int accountNumbre, boolean activated){
        this.accountNumber = accountNumbre;
        this.activated = activated;
    }
    
    //Metodos getters y setters
    
    /**
     * Metodo publico getter para retornar el numero de la cuenta
     * @return 
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    
    /**
     * Metodo publico setter para acceder y modifar el numero de la cuenta
     * @param accountNumber 
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    /**
     * Metodo getter para acceder al atributo activated y retornarlo
     * @return 
     */
    public boolean isActivated() {
        return activated;
    }
    
    /**
     * Metodo setter para modificar el atributo activated
     * @param activated 
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
}

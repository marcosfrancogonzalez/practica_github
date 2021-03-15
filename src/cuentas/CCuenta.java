package cuentas;

    /** Comentarios para Javadoc:
 * @author Marcos Franco Gonz.
 * 
 * @Version: V0.1
 * 
 * @since 2021
 * 
 * Este es un ejemplo de prueba.
 * 
 * Documentacion completa de ccuenta.java
 */
public class CCuenta {
    



    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
            
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    /** Método ingresar: 
             * A través de este metodo se ingresa la cantidad indicada,
             * y se añade al saldo actual.
             */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    
    /** Método retirar: 
             * A través de este metodo se retira la cantidad indicada,
             * del saldo actual.
             */
    public void retirar(double cantidad) throws Exception            
    {
        
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

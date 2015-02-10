/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prácticaunidad3;

/**
 *
 * @author Francico Javier Cabrerizo Membrilla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
        try 
        {
            operativa_cuenta(cuenta1, 0);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
        
        try
        {
            System.out.println("Ingreso en cuenta");
            operativa_cuenta(cuenta1, 0);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        
    }

    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) throws Exception {
        cuenta1.ingresar(695);
    
        cuenta1.retirar(2300);
    }
    
        
    
    
    

}

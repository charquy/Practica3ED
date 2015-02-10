/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prácticaunidad3;

import junit.framework.TestCase;

/**
 *
 * @author Francisco Javier Cabrerizo Membrilla
 */
public class CCuentaTest extends TestCase {

    CCuenta cuentaTest;
    public CCuentaTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        cuentaTest=new CCuenta();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }


    /* Este método nos sirva para comprobar si, tras ingresar 1000 euros en la
     * cuenta, su saldo es en efecto 1000 €. Esperamos que no se produzca
     * ningún error, por lo que se lanza un fail en el catch
     */
    public void testIngresar1000()
    {
        try
        {
            cuentaTest.ingresar(1000);
            assertTrue(cuentaTest.estado()==1000);
        }
        catch (Exception e)
        {
            fail ("No debería haber fallado");
        }
    }

    /* Este método tiene como objetivo, comprobar que al retirar 1000 € en
     * una cuenta recién creada, y por tanto con saldo 0, el saldo de la cuenta
     * sigue siendo 0
     */
    public void testRetirar1000()
    {
        try
        {
            cuentaTest.retirar(1000);
        }
        catch (Exception e)
        {}
            assertTrue (cuentaTest.estado()==0.0);
    }

    /* En este método comprobamos que al ingresar 1000 € y retirar 450, el saldo
     * de la cuenta es 450
     */
     public void testIngresarYRetirar()
    {
         try
         {
             cuentaTest.ingresar(1000.0);
             cuentaTest.retirar(450.0);
         }
         catch (Exception e)
         {}
         assertTrue(cuentaTest.estado()==550);
    }
}
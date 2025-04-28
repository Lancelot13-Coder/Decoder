
package impl;

import model.Cuenta;
import impl.ICuentaJugador;

public class CuentaSonicForces implements ICuentaJugador {
    
       @Override
       public void abrirCuenta(Cuenta c) {
              System.out.println("----------------------");
              System.out.println("Se abrio la Cuenta de Sonic Forces");
              System.out.println("Jugador: " + c.getCliente());
       }
    
}

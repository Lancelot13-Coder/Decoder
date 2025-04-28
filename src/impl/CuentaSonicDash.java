
package impl;

import model.Cuenta;
import impl.ICuentaJugador;

public class CuentaSonicDash implements ICuentaJugador {
    
       @Override 
       public void abrirCuenta(Cuenta c) {
              System.out.println("--------------------");
              System.out.println("Se abrio la Cuenta de Sonic Dash");
              System.out.println("Jugador: " + c.getCliente());
       }
    
}


package PatronesDiseñoDecorator;

import model.Cuenta;
import impl.ICuentaJugador;

public class BlindajeDecorador extends CuentaDecorador {
    
       public BlindajeDecorador(ICuentaJugador cuentaDecorada) {
              super(cuentaDecorada);
       }
       
       @Override
       public void abrirCuenta(Cuenta c) {
              cuentaDecorada.abrirCuenta(c);
              agregarBlindaje(c);
       }
       
       public void agregarBlindaje(Cuenta c) {
               System.out.println("Se agrego Seguridad a la Cuenta del Jugador" + c.getCliente());
       }
    
}

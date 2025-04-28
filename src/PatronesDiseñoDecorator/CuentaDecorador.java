
package PatronesDiseñoDecorator;

import model.Cuenta;
import impl.ICuentaJugador;


public abstract class CuentaDecorador implements ICuentaJugador {
    
        protected ICuentaJugador cuentaDecorada;
        
        public CuentaDecorador(ICuentaJugador cuentaDecorada) {
                this.cuentaDecorada = cuentaDecorada;
        }
        
        @Override 
        
        public void abrirCuenta(Cuenta c) {
               this.cuentaDecorada.abrirCuenta(c);
        }
        
    
}

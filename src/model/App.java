
package model;

import PatronesDiseñoDecorator.BlindajeDecorador;
import impl.CuentaSonicForces;
import model.Cuenta;
import impl.ICuentaJugador;


public class App {
    
    public static void main(String[] args){
           Cuenta c = new Cuenta (57, "Mobile YT");
           
           ICuentaJugador cuenta = new CuentaSonicForces();
           ICuentaJugador cuentaBlindada = new BlindajeDecorador (cuenta);
           
           cuentaBlindada.abrirCuenta(c);
                  
    }
    
}

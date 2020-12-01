package exercise;

import java.util.Random;

public class Operacion extends Thread {
    static Random random = new Random();

    CuentaCorriente cuenta;
    String nombre;
    int cantidad;

    /*
    Declaro 3 variables globales, cuenta, nombre y cantidad,
    para agilizar el trabajo, ¿Por qué? declarandolas ahi
    en el constructor igualo los valores, y simplemente
    en el run les paso los valores.
    Su resultado es agilizar el trabajo y resumiendo codigo.
     */

    public void run() {
        cuenta.money(cantidad,nombre);
    }
    /*
    Paso los valores correspondientes.
     */

    public Operacion(CuentaCorriente x, String nombre){
        this.cuenta = x;
        this.nombre = nombre;
        cantidad = random.nextInt(2000);
    }
    /*
    Constructor con los parametros que entran igualandolos a salida.
     */

}

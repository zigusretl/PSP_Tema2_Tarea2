package exercise;

public class main {

	public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente(0);

        Operacion p1 = new Operacion(cuenta, "Jesus");
        Operacion p2 = new Operacion(cuenta, "Pedro");
        Operacion p3 = new Operacion(cuenta, "Luis");

        p1.start();
        p2.start();
        p3.start();

        /*
        Creamos cuenta con contenido 0 (de dinero), y luego creamos los nucleos con Operacion
        p1, p2, p3, pasando a su constructor cuenta y nombre. Esta clase extiende de thread,
        por ello ejecutamos start, donde se realizaran las operaciones.
         */


    }
}

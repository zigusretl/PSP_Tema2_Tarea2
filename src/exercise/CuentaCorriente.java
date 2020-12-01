package exercise;

public class CuentaCorriente {
    int saldoCorriente;

    public CuentaCorriente(int saldoEntrada){
        this.saldoCorriente = saldoEntrada;
    }

    public int getSaldoCorriente() {
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return saldoCorriente;
    }

    /*
    Metodo getter tal y como nos pide el ejercicio:
    thread.sleep, y return.
     */

    public void setSaldoCorriente(int saldoCorriente) {
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.saldoCorriente = saldoCorriente;
    }

    /*
    Metodo setter tal y como nos pide el ejercicio:
    thread.sleep, y return.
     */

    public synchronized void money(int dineroEntrada, String nombre){
        System.out.println("\nIngresando: "+dineroEntrada);
        System.out.println("\nSaldo inicial:"+this.saldoCorriente);
        this.saldoCorriente+=dineroEntrada;
        System.out.println("\nSaldo final:"+this.saldoCorriente);
        System.out.println("\nIngreso realizado por: "+nombre);
        System.out.println("\n________________________________");
    }

    /*
    Muestro primero el dinero de entrada, luego el
    estado de la cuenta, y a continuacion sumo la
    cantidad. Muestro el final y el nombre del que
    ingreso.
     */

}

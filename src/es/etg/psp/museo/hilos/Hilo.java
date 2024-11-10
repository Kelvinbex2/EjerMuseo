package es.etg.psp.museo.hilos;

import es.etg.psp.museo.Sala;

public class Hilo implements Runnable {
    private Sala sala;
    private boolean esEntrada;

    public Hilo(Sala sala, boolean esEntrada) {
        this.sala = sala;
        this.esEntrada = esEntrada;
    }

    @Override
    public void run() {
        if (esEntrada) {
            sala.entrar();
        } else {
            sala.salir();
        }
    }

}

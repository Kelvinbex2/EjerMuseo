package es.etg.psp.museo.salida;

import es.etg.psp.museo.Sala;

public class SalidaVis implements Runnable {

    private Sala sala;

    public SalidaVis(Sala sala) {
        this.sala = sala;
    }

    @Override
    public void run() {
        sala.salir();
        System.out.println(Thread.currentThread().getName() + " Saliendo persona, visitantes actuales: " + sala.getContardorVisitantes());
    }

}

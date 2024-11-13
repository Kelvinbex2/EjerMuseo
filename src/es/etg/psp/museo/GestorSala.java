package es.etg.psp.museo;

import es.etg.psp.museo.entrada.Entrada;
import es.etg.psp.museo.salida.SalidaVis;

public class GestorSala {

    private static final String NUMERO_FINAL_VISITANTES = "Numero final de visitantes en la sala: %d";

    public static void main(String[] args) {
        try {
            simular();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void simular() throws InterruptedException {
        Sala sala = new Sala();
        Thread[] hilo = new Thread[25];

        for (int i = 1; i <= 10; i++) {
          
            hilo[i - 1] = new Thread(new Entrada(sala));
            hilo[i - 1].start();

        }

        for (int i = 1; i <= 15; i++) {
       
            hilo[10 + i - 1] = new Thread(new SalidaVis(sala));
            hilo[10 + i - 1].start();
        }

        for (Thread thread : hilo) {
            thread.join();
        }

        System.out.println(String.format(NUMERO_FINAL_VISITANTES, sala.getContardorVisitantes()));
    }
}

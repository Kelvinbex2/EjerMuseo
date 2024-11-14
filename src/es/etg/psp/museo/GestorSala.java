package es.etg.psp.museo;

import es.etg.psp.museo.entrada.Entrada;
import es.etg.psp.museo.salida.SalidaVis;

public class GestorSala {

    private static final String NUMERO_FINAL_VISITANTES = "Numero final de visitantes en la sala: %d";
    private static final int SIZE = 25;

    public static void main(String[] args) {
        try {
            simular();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void simular() throws InterruptedException {
        Sala sala = new Sala();
        Thread[] hilo = new Thread[SIZE];
        
        for (int i = 1; i <= 15; i++) {
       
            hilo[ i - 1] = new Thread(new SalidaVis(sala));
            hilo[ i - 1].start();
        }

        for (int i = 1; i <= 10; i++) {
          
            hilo[15 + i - 1] = new Thread(new Entrada(sala));
            hilo[15 + i - 1].start();

        }

        

        for (Thread thread : hilo) {
            thread.join();
        }

        System.out.println(String.format(NUMERO_FINAL_VISITANTES, sala.getContardorVisitantes()));
    }
}

package es.etg.psp.museo;

import es.etg.psp.museo.hilos.Hilo;

public class GestorSala {

    // Definir las constantes para los textos
    private static final String ENTRANDO_PERSONA = "Entrando %d persona";
    private static final String SALIENDO_PERSONA = "Saliendo %d persona";
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
            System.out.println(String.format(ENTRANDO_PERSONA, i));  
            hilo[i - 1] = new Thread(new Hilo(sala, true));
            hilo[i - 1].start();
        }

        
        for (int i = 1; i <= 15; i++) {
            System.out.println(String.format(SALIENDO_PERSONA, i));  
            hilo[10 + i - 1] = new Thread(new Hilo(sala, false));
            hilo[10 + i - 1].start();
        }

        
        for (Thread thread : hilo) {
            thread.join();
        }

        
        System.out.println(String.format(NUMERO_FINAL_VISITANTES, sala.getContardorVisitantes())); 
    }
}

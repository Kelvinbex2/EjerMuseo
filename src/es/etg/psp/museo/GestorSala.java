package es.etg.psp.museo;

import es.etg.psp.museo.hilos.Hilo;

public class GestorSala {

    public static void main(String[] args) {
        try {
            simular(); 
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }

    public static void simular() throws InterruptedException {
        Sala sala = new Sala();
        Thread [] hilo = new Thread[25];
        
       
        for (int i = 1; i <= 10; i++) {  
            System.out.println("Entrando " + i + " persona");
             hilo[i - 1] = new Thread(new Hilo(sala, true));
             hilo[i -1].start();
        }

        for (int i = 1; i <= 15; i++) {
            System.out.println("Saliendo " + i + " persona");
            hilo[10 + i - 1] = new Thread(new Hilo(sala,false));
            hilo[10 + i - 1].start();
            
        }
        for (Thread thread : hilo) {
            thread.join();
        }
        
       

        System.out.println("Número final de visitantes en la sala: " + sala.getContardorVisitantes());
    }
    
    
    

}

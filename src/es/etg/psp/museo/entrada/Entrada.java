package es.etg.psp.museo.entrada;

import es.etg.psp.museo.Sala;

public class Entrada implements Runnable{
    private Sala sala;
   

    public Entrada(Sala sala) {
        this.sala = sala;
    }


    @Override
    public void run() {
     sala.entrar();
     System.out.println(Thread.currentThread().getName() + " Entrando persona, visitantes actuales: " + sala.getContardorVisitantes());
    }
    
}

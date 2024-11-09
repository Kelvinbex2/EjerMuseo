package es.etg.psp.museo.hilos;

public class Hilo implements Runnable{

    @Override
    public void run() {
        int time = (int) (Math.random() +6000) + 2000;
    }
    
}

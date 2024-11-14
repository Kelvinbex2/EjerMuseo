package es.etg.psp.museo;

public class Sala {
    public final static String ERR = "Se ha excedido la capacidad máxima de la sala.";
    public int contardorVisitantes = 0;

    public Sala() {
        contardorVisitantes = 100;
    }

    public int getContardorVisitantes() {
        if (contardorVisitantes > 100) {
            throw new IllegalStateException(ERR);
        }
        return contardorVisitantes;
    }

    public void setContardorVisitantes(int contardorVisitantes) {
        this.contardorVisitantes = contardorVisitantes;
    }

    public synchronized void entrar() {
        contardorVisitantes++;

    }

    public synchronized void salir() {
        if (contardorVisitantes > 0) {
            contardorVisitantes--;
        }

    }

}

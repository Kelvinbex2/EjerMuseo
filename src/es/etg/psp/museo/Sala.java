package es.etg.psp.museo;

public class Sala {
    public  int contardorVisitantes = 0;

    public Sala() {
        contardorVisitantes=100;
    }

  
    public int getContardorVisitantes() {
        return contardorVisitantes;
    }

    public void setContardorVisitantes(int contardorVisitantes) {
        this.contardorVisitantes = contardorVisitantes;
    }

     public void entrar(){
        contardorVisitantes++;
        
     }

     public void salir(){
        if (contardorVisitantes > 0) {
            contardorVisitantes--;
        }
        
     }

   

}

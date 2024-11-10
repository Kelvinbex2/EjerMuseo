package es.etg.psp.museo.lanzador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import es.etg.psp.museo.fichero.Salida;

public class Lanzador {
    public static final String[] COMMANDO = { "java", "es.etg.psp.museo.GestorSala" };
    public static final String MSG_BUENO = "Ha ido bien";
    public static final String MSG_ERR = "No ha ido bien";

    public static void main(String[] args) {
        try {
            ejecutar();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static int ejecutar() {
        int exitValue = 0;
        try {
            Process process = Runtime.getRuntime().exec(COMMANDO);
            BufferedReader read = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            Salida sal = new Salida();
            
            sal.vaciar();
            while ((line = read.readLine()) != null) {
                System.out.println(line);
                
                sal.escribir(line);
                
            }
           

            exitValue = process.waitFor();
            if (exitValue == 0) {
                System.out.println(MSG_BUENO);
            } else {
                System.out.println(MSG_ERR);
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(e);
        }

        return exitValue;
    }
}

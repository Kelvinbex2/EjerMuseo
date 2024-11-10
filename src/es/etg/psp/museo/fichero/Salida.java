package es.etg.psp.museo.fichero;

import java.io.File;
import java.io.FileOutputStream;

public class Salida {
    public static final String FICHERO = "museo.txt";

    public void escribir(String datos) {
        File fichero = new File(FICHERO);
        try {
            FileOutputStream fout = new FileOutputStream(fichero, true);
            fout.write(datos.getBytes());
            fout.write(System.lineSeparator().getBytes());

        } catch (Exception e) {
            System.err.println(e);
        }

    }

    public void vaciar() {
        File fichero = new File(FICHERO);
        try {
            FileOutputStream fo = new FileOutputStream(fichero, false);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

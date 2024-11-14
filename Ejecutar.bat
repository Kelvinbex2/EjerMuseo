echo off
cd src
javac es\etg\psp\museo\GestorSala.java
javac es\etg\psp\museo\Sala.java
javac es\etg\psp\museo\fichero\Salida.java
javac es\etg\psp\museo\salida\SalidaVis.java
javac es\etg\psp\museo\entrada\Entrada.java
javac es\etg\psp\museo\lanzador\Lanzador.java

 java es/etg/psp/museo/lanzador/Lanzador

cd ..

pause
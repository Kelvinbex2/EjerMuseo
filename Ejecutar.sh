#!/bin/bash
#chmod +x Ejecutar.sh para darle permiso 
cd src
javac es/etg/psp/museo/hilos/Hilo.java
javac es/etg/psp/museo/GestorSala.java
javac es/etg/psp/museo/Sala.java
javac es/etg/psp/museo/fichero/Salida.java
javac es/etg/psp/museo/lanzador/Lanzador.java

java es.etg.psp.museo.lanzador.Lanzador

cd ..

read -p "Press enter to continue"

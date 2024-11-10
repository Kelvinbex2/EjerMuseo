# Noma kelvin Obamedo

## Analisis
### Requistos Funcionales

### Requisitos no Funcionales

## Diseño

``` plantuml

package es/etg/psp/museo{
    package hilos{
        Class Hilo implements Runnable {
            - sala : Sala
            - esEntrada : boolean
            + run():void
        }
    }


    package fichero{
        Class Salida{
            + escribir : void
            + vaciar : void 
        }
    }

    package lanzador{
        class Lanzador{
            - COMMANDO : String 
            - MSG_ERR : String
            - MSG_BUENO : String
            + ejecutar() : int
        }
    }

    class Sala{
        - contardorVisitantes : int
        + salir() : void
        + entrar() : void
    }

    class GestorSala{
        + simular() : void
        + main() : void
    }

    GestorSala ...> Hilo :use
    GestorSala ...> Sala :use
    Hilo ...> Sala :use
    Lanzador --> GestorSala : lanza
    GestorSala ...> Lanzador : salida
    Lanzador ...> Salida : use
    
}

```

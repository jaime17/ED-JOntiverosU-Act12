/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filas;

/**
 *
 * @author emiaj
 */
public class Filas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue fila = new Queue();
        fila.enqueue(" Hola");
        fila.enqueue(" mundo");
        fila.enqueue(" creando");
        fila.enqueue(" una");
        fila.enqueue(" fila");
        fila.showQueue();
        fila.dequeue();
        fila.showQueue();
        fila.clearQueue();
        fila.showQueue();
    }
    
}

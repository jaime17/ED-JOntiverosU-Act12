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
public class  Node <T> {
    T data;
    Node next;
    public Node(T data)
    {
        this.data=data;
        next = null;
    }
    public void print()
    {
        System.out.print(this.data+" -> ");
    }
}

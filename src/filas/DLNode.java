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
public class DLNode <T> {
    DLNode next;
    DLNode back;
    T data;
    
    public DLNode(T d)
    {
        data=d;
        next = null;
    }
    public void print()
    {
        System.out.println(data+"->");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Mejía Sánchez
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Conejo cn = new Conejo("dexter","zanahorias",2);
    
    cn.alimentacion();
    cn.correr();
    }
    
}

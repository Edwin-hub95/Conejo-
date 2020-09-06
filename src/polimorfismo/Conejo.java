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
public class  Conejo extends Animal{

    public Conejo(String nombre, String tipo_de_alimentacion, int edad) {
        super(nombre, tipo_de_alimentacion, edad);
    }

    @Override
    public void correr() {
        System.out.println("corro y salto con las dos patas");
    }

    @Override
    public void alimentacion() {
        System.out.println("me gustan las zanahorias");
    }
    
}

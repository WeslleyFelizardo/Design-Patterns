/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploAnimal;

/**
 *
 * @author Cleide
 */
public class Gato extends Animal{

    @Override
    public void Comer() {
        System.out.println("Gato comendo");
    }

    @Override
    public void Dormir() {
        System.out.println("Gato dormindo");
    }

}

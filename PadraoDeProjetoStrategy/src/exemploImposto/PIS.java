/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploImposto;

/**
 *
 * @author Cleide
 */
public class PIS implements Imposto{

    @Override
    public float calcularImposto(double valor) {
        return (float) valor + 1;
    }
    
}

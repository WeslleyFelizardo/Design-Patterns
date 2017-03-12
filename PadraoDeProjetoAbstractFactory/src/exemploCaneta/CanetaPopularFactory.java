/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploCaneta;

/**
 *
 * @author Cleide
 */
public class CanetaPopularFactory extends CanetaFactory{

    @Override
    public Led montarLed() {
        return new SemLed();
    }

    @Override
    public Design montarDesign() {
        return new Design();
    }

    @Override
    public Tampa montarTampa() {
        return new ComTampa();
    }

    @Override
    public Nome montarNome() {
        return new SemNome();
    }
    
}

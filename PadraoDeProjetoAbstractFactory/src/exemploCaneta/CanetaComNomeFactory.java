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
public class CanetaComNomeFactory extends CanetaFactory{

    @Override
    public Led montarLed() {
        return new ComLed();
    }

    @Override
    public Design montarDesign() {
        return new Customizado();
    }

    @Override
    public Tampa montarTampa() {
        return new ComTampa();
    }

    @Override
    public Nome montarNome() {
        return new ComNome("lucas");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploHumano;

/**
 *
 * @author Cleide
 */
public class HumanoBranco implements IHumano{

    
    @Override
    public Humano criarHumano(HumanoFactory humanoFactory) {
        Humano humano = new Humano();
        humano.setCabelo(humanoFactory.criarCabelo());
        humano.setOlho(humanoFactory.criarOlho());
        humano.setOrelha(humanoFactory.criarOrelha());
        
        return humano;
    }
    
}

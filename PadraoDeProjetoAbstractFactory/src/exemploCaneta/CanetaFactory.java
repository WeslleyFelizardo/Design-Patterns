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
public abstract class CanetaFactory {
    
    public abstract Led montarLed();
    
    public abstract Design montarDesign();
    
    public abstract Tampa montarTampa();
    
    public abstract Nome montarNome();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploYoutube;

/**
 *
 * @author Cleide
 */
public interface Observado {
    
    public void registraObservador(Observador obj);
    public void removerObservador(Observador obj);
    public void notificarObservadores();
    
    
}

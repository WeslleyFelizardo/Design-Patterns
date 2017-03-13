/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploPersonagens;

/**
 *
 * @author Cleide
 */
public class Personagem {
    
    private IArma arma;

    public void setArma(IArma arma) {
        this.arma = arma;
    }
    
    public String lutar(){
        return "O lutador esta " + this.arma.usarArma();
    }
}

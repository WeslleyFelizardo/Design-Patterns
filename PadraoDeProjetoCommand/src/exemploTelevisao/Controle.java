/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploTelevisao;

/**
 *
 * @author Cleide
 */
public class Controle {
    
    private ICommand comando;

    public void setComando(ICommand comando) {
        this.comando = comando;
    }
    
    public void botaoPressionado(){
        this.comando.execute();
    }
    
}

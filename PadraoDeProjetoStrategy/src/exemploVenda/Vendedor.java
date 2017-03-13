/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploVenda;

/**
 *
 * @author Cleide
 */
public class Vendedor {
    private ICommand comando;
    
    public Vendedor(ICommand comando) {
        this.comando = comando;
    }
    
    public void definirEstadoVenda(){
        this.comando.execute();
    }

    public void setComando(ICommand comando) {
        this.comando = comando;
    }
   
}

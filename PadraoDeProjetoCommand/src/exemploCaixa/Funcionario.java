/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploCaixa;

/**
 *
 * @author Cleide
 */
public class Funcionario {
    
    private ICommand commando;

    public void setCommando(ICommand commando) {
        this.commando = commando;
    }
    
    public void statusCaixa(){
        this.commando.execute();
    }
}

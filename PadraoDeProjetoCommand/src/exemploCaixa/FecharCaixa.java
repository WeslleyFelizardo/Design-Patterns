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
public class FecharCaixa implements ICommand{
    
    private Caixa caixa;

    public FecharCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
    
    @Override
    public void execute() {
        this.caixa.fecharCaixa();
    }
}

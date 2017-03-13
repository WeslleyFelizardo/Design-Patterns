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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario func = new Funcionario();
        Caixa caixa = new Caixa();
        
        func.setCommando(new AbrirCaixa(caixa));
        func.statusCaixa();
        func.setCommando(new FecharCaixa(caixa));
        func.statusCaixa();
    }
    
}

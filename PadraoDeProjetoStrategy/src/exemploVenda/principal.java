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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Inicando a venda
        Venda venda = new Avista();
        
        Vendedor vendedor = new Vendedor(new IniciarVenda(venda));
        vendedor.definirEstadoVenda();
        System.out.println("Tipo da venda: " + venda.getTipo());
        venda.setValor(2000);
        venda.setFormaPagamento(new Dinheiro());
        System.out.println(venda.getFormaPagamento().CalcularDesconto(venda.getValor()));
        
        vendedor.setComando(new FinalizarVenda(venda));
        vendedor.definirEstadoVenda();
        
                
        
    }
    
}

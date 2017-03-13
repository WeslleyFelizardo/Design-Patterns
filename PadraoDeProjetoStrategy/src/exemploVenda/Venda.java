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
public abstract class Venda{
    private float valor;
    private IFormaDePagamento formaPagamento;
    private String tipo;
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public IFormaDePagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(IFormaDePagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
   public void IniciarVenda(){
       System.out.println("Iniciando venda");
   }
   public void FinalizarVenda(){
       System.out.println("Finalizando venda");
   }
   public void CancelarVenda(){
       System.out.println("Cancelando venda");
   }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
   
}

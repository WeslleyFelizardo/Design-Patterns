/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploFrete;

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
        
        //Frete normal = new Normal();
        //Frete sedex = new Sedex();
        TipoFrete tipoFrete = TipoFrete.SEDEX;
        
        Frete frete = tipoFrete.getFrete();
        
        System.out.println(frete.calcularFrete(200));
        
    }
    
}

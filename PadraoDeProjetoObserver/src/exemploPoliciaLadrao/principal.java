/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploPoliciaLadrao;

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
        
       CarroLadrao ladrao = new CarroLadrao();
       ladrao.registrarObservador(new CarroPolicia());
       
       ladrao.setEsquerda(); 
       ladrao.setDireita();
       ladrao.setFrente();
       ladrao.setDireita();
       
    }
    
}

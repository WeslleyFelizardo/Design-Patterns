/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploPato;

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
        
        Pato patoComum = new PatoComum();
        Pato patoBorracha = new PatoBorracha();
        Pato patoMadeira = new PatoMadeira();
        
        System.out.println(patoComum.getNome() + "\n");
        System.out.println(patoComum.emitirSom());
        System.out.println(patoComum.voar());
        System.out.println("\n");
        System.out.println(patoBorracha.getNome() + "\n");
        System.out.println(patoBorracha.emitirSom());
        System.out.println(patoBorracha.voar());
        System.out.println("\n");
        System.out.println(patoMadeira.getNome() + "\n");
        System.out.println(patoMadeira.emitirSom());
        System.out.println(patoMadeira.voar());
        System.out.println("\n");
        
        System.out.println(patoMadeira.getNome() + "\n");
        patoMadeira.setSom(new SomComum());
        patoMadeira.setVoo(new VooComum());
        System.out.println("\n" + patoMadeira.emitirSom() + "\n" + patoMadeira.voar());
    }
    
}

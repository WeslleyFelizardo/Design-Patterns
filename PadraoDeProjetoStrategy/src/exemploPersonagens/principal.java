/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploPersonagens;

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
        
        Personagem guerreiro = new Guerreiro();
        Personagem rei = new Rei();
        Personagem rainha = new Rainha();
        Personagem duende = new Duende();
        
        System.out.println(guerreiro.lutar());
        System.out.println(rei.lutar());
        System.out.println(rainha.lutar());
        System.out.println(duende.lutar());
        
        guerreiro.setArma(new Machado());
        System.out.println(guerreiro.lutar());
    }
    
}

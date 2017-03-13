/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploLuz;

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
        Luz luz = new Luz(); //Criando o receptor receber o comando
        ControleRemoto controle = new ControleRemoto(); //Criando o cara que vai solicitar o comando
        
        controle.setComando(new LigarLuz(luz));
        controle.botaoPressionado();
        
        controle.setComando(new DesligarLuz(luz));
        controle.botaoPressionado();
    }
    
}

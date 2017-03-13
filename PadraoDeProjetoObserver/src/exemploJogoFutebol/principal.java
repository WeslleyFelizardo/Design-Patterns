/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploJogoFutebol;

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
        
        Jogo jogo1 = new Jogo();
        Jogo jogo2 = new Jogo();
        Jogo jogo3 = new Jogo();
        Eu eu = new Eu();
        
        jogo1.registraObservador(eu);
        jogo2.registraObservador(eu);
        jogo3.registraObservador(eu);
        
        jogo1.setTime1("Corinthians");
        jogo1.setTime2("Santos");
        
        jogo2.setTime1("São Paulo");
        jogo2.setTime2("Palmeiras");
        
        jogo3.setTime1("Barcelona");
        jogo3.setTime2("Real Madri");
        
        jogo1.golDoTime1();
        jogo2.golDoTime1();
        jogo2.golDoTime2();
        jogo2.golDoTime1();
        jogo2.golDoTime1();
        jogo1.golDoTime2();
        jogo1.golDoTime2();
        jogo3.golDoTime1();
        jogo3.golDoTime1();
        jogo3.golDoTime2();
        jogo3.getGolTime2();
        jogo3.golDoTime2();
        
        System.out.println("Resultados da rodada : \n");   
        jogo1.terminarJogo();
        jogo2.terminarJogo();
        jogo3.terminarJogo();
    }
    
}

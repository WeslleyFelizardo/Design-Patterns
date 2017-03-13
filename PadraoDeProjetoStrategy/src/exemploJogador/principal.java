/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploJogador;

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
        
        TimeFactory timeBrasileiro = new TimeBrasileiroFactory();
        Time corinthians = new Time("Corinthians");
        Bandeira bandeira = timeBrasileiro.criarBandeira();
        bandeira.setCor("Preta com Vermelha");
        bandeira.setNome("timão");
        bandeira.setTamanho("3 metro");
        corinthians.setBandeira(bandeira);
        //corinthians.setEscudo(timeBrasileiro.criarEscudo());
        //corinthians.setEstadio(timeBrasileiro.criarEstadio());
        Escudo escudo = timeBrasileiro.criarEscudo();
        escudo.setTipo("Quadrado");
        Estadio estadio = timeBrasileiro.criarEstadio();
        estadio.setNome("Itaquerão");

        corinthians.setEscudo(escudo);
        corinthians.setEstadio(estadio);
        
        //Criando os jogadores
        Atleta weslley = new JogadorFutebol("Weslley");
        Atleta lucas = new JogadorFutebol("Lucas");
        Atleta murilo = new JogadorFutebol("Murilo");
        Atleta dente = new JogadorFutebol("Dente");
        Atleta je = new JogadorFutebol("Je");
        Atleta gordo = new JogadorFutebol("Gordo");
        
        //Adicionando os atletas ao time
        corinthians.addJogador(weslley);
        corinthians.addJogador(lucas);
        corinthians.addJogador(murilo);
        corinthians.addJogador(dente);
        corinthians.addJogador(je);
        corinthians.addJogador(gordo);
        
        System.out.println("Time criado");
        System.out.println(corinthians.getNome());
        System.out.println(corinthians.getEscudo().getTipo());
        System.out.println(corinthians.getEstadio().getNome());
        
        System.out.println("Jogadores do time " + corinthians.getNome());
        for (Atleta jogador : corinthians.getListJogador()) {
            System.out.println(jogador.getNome());
        }               
    }    
}

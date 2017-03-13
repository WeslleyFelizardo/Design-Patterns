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
public class JogadorFutebol extends Atleta{

    public JogadorFutebol(String nome) {
        setChutar(new Falta());
        setNome(nome);
    }
}

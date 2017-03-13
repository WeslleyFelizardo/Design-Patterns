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
public class TimeBrasileiroFactory extends TimeFactory{

    @Override
    public Escudo criarEscudo() {
        return new EscudoBrasileiro();
    }

    @Override
    public Bandeira criarBandeira() {
        return new BandeiraBrasileira();
    }

    @Override
    public Estadio criarEstadio() {
        return new EstadioBrasileiro();
    }
    
}

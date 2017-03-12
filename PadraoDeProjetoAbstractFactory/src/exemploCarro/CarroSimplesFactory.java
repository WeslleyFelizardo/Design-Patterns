/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploCarro;

import exemploCarro.CarroFactory;
import exemploCarro.Roda;
import exemploCarro.RodaSimples;
import exemploCarro.Som;
import exemploCarro.TocaFita;

/**
 *
 * @author Cleide
 */
public class CarroSimplesFactory extends CarroFactory{

    @Override
    public Roda montarRoda() {
        return new RodaSimples();
    }

    @Override
    public Som montarSom() {
        return new TocaFita();
    }
    
    @Override
    public Volante montarVolante() {
        return new Mecanico();
    }
}

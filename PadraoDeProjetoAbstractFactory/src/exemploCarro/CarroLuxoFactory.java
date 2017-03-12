/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploCarro;

import exemploCarro.CarroFactory;
import exemploCarro.Roda;
import exemploCarro.RodaLed;
import exemploCarro.Som;
import exemploCarro.SomDvd;

/**
 *
 * @author Cleide
 */
public class CarroLuxoFactory extends CarroFactory{

    @Override
    public Roda montarRoda() {
        return new RodaLed();
    }

    @Override
    public Som montarSom() {
        return new SomDvd();
    }

    @Override
    public Volante montarVolante() {
        return new Hidraulico();
    }
    
}

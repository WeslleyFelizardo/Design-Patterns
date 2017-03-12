/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploCarro;

/**
 *
 * @author Cleide
 */
public class MontarCarroLuxo implements IMontarCarro{

    @Override
    public Carro montar(CarroFactory carroFactory) {
        Carro carro = new Carro();
        carro.setRoda(carroFactory.montarRoda());
        carro.setSom(carroFactory.montarSom());
        carro.setVolante(carroFactory.montarVolante());
        return carro;
    }
    
}

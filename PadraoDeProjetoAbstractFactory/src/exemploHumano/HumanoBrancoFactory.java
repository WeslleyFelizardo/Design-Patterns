/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploHumano;

/**
 *
 * @author Cleide
 */
public class HumanoBrancoFactory extends HumanoFactory{

    @Override
    public Olho criarOlho() {
        return new OlhoClaro();
    }

    @Override
    public Orelha criarOrelha() {
        return new OrelhaGrande();
    }

    @Override
    public Cabelo criarCabelo() {
        return new CabeloLoiro();
    }
    
}

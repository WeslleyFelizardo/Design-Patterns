/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploPato;

/**
 *
 * @author Cleide
 */
public class PatoComum extends Pato{

    public PatoComum() {
        setSom(new SomComum());
        setVoo(new VooComum());
        setNome("Pato Comum");
    }
    
}

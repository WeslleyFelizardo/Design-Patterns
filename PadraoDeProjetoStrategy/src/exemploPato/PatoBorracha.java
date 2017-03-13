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
public class PatoBorracha extends Pato{

    public PatoBorracha() {
        setSom(new SomBorracha());
        setVoo(new VooSem());
        setNome("Pato de Borracha");
    }
    
}

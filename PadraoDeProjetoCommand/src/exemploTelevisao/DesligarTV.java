/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploTelevisao;

/**
 *
 * @author Cleide
 */
public class DesligarTV implements ICommand{
    
    private Televisao tv;

    public DesligarTV(Televisao tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.DesligarTV();
    }
    
    
}

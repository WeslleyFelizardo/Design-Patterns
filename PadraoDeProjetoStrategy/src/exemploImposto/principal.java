/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploImposto;

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
        
        
        Imposto imposto = EnumImpostos.values()[3].getImposto();
        System.out.println(imposto.calcularImposto(0));
        
        
    }
    
}

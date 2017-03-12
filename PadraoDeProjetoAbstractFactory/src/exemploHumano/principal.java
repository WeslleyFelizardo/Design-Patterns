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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Humano humano = new Humano();
        
        int opcao = 1;
        IHumano tipoHumano = EnumHumano.values()[opcao - 1].getHumano();
        HumanoFactory humanoFactory = EnumHumano.values()[opcao - 1].getHumanoFactory();
        
        humano = tipoHumano.criarHumano(humanoFactory);
        System.out.println(humano.getOlho().getCor());
    }
}

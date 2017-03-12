/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploCaneta;

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
        
        CanetaFactory cf = null;
        String tipoCaneta = "popular";
        
        if ("led".equals(tipoCaneta)) {
            cf = new CanetaComLedFactory();
        } else if ("nome".equals(tipoCaneta)) {
            cf = new CanetaComNomeFactory();
        }else{
            cf = new CanetaPopularFactory();
        }
        
            Caneta caneta = new Caneta();
            caneta.setDesign(cf.montarDesign());
            caneta.setLed(cf.montarLed());
            caneta.setNome(cf.montarNome());
            caneta.setTampa(cf.montarTampa());
            //System.out.println("exemploCaneta.principal.main()");
    }
}

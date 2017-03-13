/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploYoutube;

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
        
        CanalYoutube canalYoutube = new CanalYoutube();
        
        Inscrito inscrito1 = new Inscrito();
        Inscrito inscrito2 = new Inscrito();
        Inscrito inscrito3 = new Inscrito();
        
        inscrito1.setNome("Weslley");
        inscrito2.setNome("Lucas");
        inscrito3.setNome("Cleide");
        
        canalYoutube.registraObservador(inscrito1);
        canalYoutube.registraObservador(inscrito2);
        canalYoutube.registraObservador(inscrito3);
        
        canalYoutube.setNovoVideo("Angular2");
        canalYoutube.setNovoVideo("Java");
    }
    
}

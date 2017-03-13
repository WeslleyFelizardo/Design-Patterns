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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Televisao tv = new Televisao();
        Controle controle = new Controle();
        
        controle.setComando(new LigarTV(tv));
        controle.botaoPressionado();
        System.out.println(tv.getOnOff());
        
        controle.setComando(new AdiantarCanal(tv));
        controle.botaoPressionado();
        System.out.println("Canal atual " + tv.getCanal());
        controle.setComando(new AdiantarCanal(tv));
        controle.botaoPressionado();
        System.out.println("Canal atual " + tv.getCanal());
        controle.setComando(new AdiantarCanal(tv));
        controle.botaoPressionado();
        System.out.println("Canal atual " + tv.getCanal());
        controle.setComando(new AdiantarCanal(tv));
        controle.botaoPressionado();
        System.out.println("Canal atual " + tv.getCanal());
        controle.setComando(new AdiantarCanal(tv));
        controle.botaoPressionado();
        System.out.println("Canal atual " + tv.getCanal());
        controle.setComando(new AdiantarCanal(tv));
        controle.botaoPressionado();
        System.out.println("Canal atual " + tv.getCanal());
        controle.setComando(new AumentarVolume(tv));
        controle.botaoPressionado();
        System.out.println("Volume atual " + tv.getVolume());
        controle.setComando(new AumentarVolume(tv));
        controle.botaoPressionado();
        System.out.println("Volume atual " + tv.getVolume());
        controle.setComando(new AumentarVolume(tv));
        controle.botaoPressionado();
        System.out.println("Volume atual " + tv.getVolume());
        controle.setComando(new RetrocederCanal(tv));
        controle.botaoPressionado();
        System.out.println("Canal atual " + tv.getCanal());
        controle.setComando(new DesligarTV(tv));
        controle.botaoPressionado();
        System.out.println(tv.getOnOff());
        
    }
    
}

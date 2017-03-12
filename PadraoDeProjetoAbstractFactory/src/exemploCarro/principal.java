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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao = 2;
        
         //Forma sem utilizar ifs
         
         CarroFactory cf = EnumTipoCarro.values()[opcao - 1].getFactory();
         IMontarCarro montarCarro = EnumTipoCarro.values()[opcao - 1].getCarro();
        
         Carro carro = montarCarro.montar(cf);
        
        //carro.setAno("2000");
        //carro.setCor("Azul");
        //carro.setNome("Monstro");
        //System.out.println(carro.getNome());
        
        //Forma utilizando ifs para escolher qual fabrica irei usar
        
        CarroFactory cf2 = null;
        if (opcao == 1) {
            cf2 = new CarroLuxoFactory();
        }else {
            cf2 = new CarroSimplesFactory();
        }
        Carro carro2 = new Carro();
        carro2.setRoda(cf2.montarRoda());
        carro2.setSom(cf2.montarSom());
        carro2.setVolante(cf2.montarVolante());
        
        System.out.println(carro2.getRoda().getAro());
        
    }
    
}

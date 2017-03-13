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
public class Pato {
    
    private String nome;
    private ISom som;
    private IVoo voo;

//    public Pato(ISom som, IVoo voo) {
//        this.som = som;
//        this.voo = voo;
//    }
    
    public void setSom(ISom som) {
        this.som = som;
    }

    public void setVoo(IVoo voo) {
        this.voo = voo;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }
    
    public String emitirSom(){
        return this.som.reproduzirSom();
    }
    
    public String voar(){
        return this.voo.voando();
    }
    
    
    
}

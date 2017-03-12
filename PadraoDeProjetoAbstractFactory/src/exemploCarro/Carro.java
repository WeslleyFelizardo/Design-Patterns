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
public class Carro {
    
    private String nome;
    private String ano;
    private String cor;
    private Roda roda;
    private Som som;
    private Volante volante;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
   
    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Som getSom() {
        return som;
    }

    public void setSom(Som som) {
        this.som = som;
    }

    public Volante getVolante() {
        return volante;
    }

    public void setVolante(Volante volante) {
        this.volante = volante;
    }
    
    
}

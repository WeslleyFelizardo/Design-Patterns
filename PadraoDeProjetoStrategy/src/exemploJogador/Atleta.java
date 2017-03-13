/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploJogador;

/**
 *
 * @author Cleide
 */
public class Atleta {
    private String nome;
    private String time;
    private ChutarBola chutar;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ChutarBola getChutar() {
        return chutar;
    }

    public void setChutar(ChutarBola chutar) {
        this.chutar = chutar;
    }
    
    public String chutando(){
        return this.chutar.chutar();
    }
}

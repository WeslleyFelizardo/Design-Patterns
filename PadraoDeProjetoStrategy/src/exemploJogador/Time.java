/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploJogador;

import java.util.ArrayList;

/**
 *
 * @author Cleide
 */
public class Time {
    
    private Bandeira bandeira;
    private Escudo escudo;
    private Estadio estadio;
    private ArrayList<Atleta> listJogador; 
    private String nome;
    
    
    public Time(String nome) {
        this.nome = nome;
        this.listJogador = new ArrayList<Atleta>();
    }

    public String getNome() {
        return nome;
    }
    
    public Bandeira getBandeira() {
        return bandeira;
    }

    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public ArrayList<Atleta> getListJogador() {
        return listJogador;
    }

    public void addJogador(Atleta jogador) {
        this.listJogador.add(jogador);
    }
    
    public void exibirDados(){
        
    }
    
}

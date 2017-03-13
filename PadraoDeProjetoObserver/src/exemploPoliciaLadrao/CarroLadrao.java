/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploPoliciaLadrao;

import java.util.ArrayList;

/**
 *
 * @author Cleide
 */
public class CarroLadrao implements Observado{

    private ArrayList<Observador> observadores;
    private String direita;
    private String esquerda;
    private String frente;

    public CarroLadrao() {
        this.observadores = new ArrayList<Observador>();
    }
    
    @Override
    public void registrarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        this.observadores.remove(observador);
    }

    @Override
    public void notificar(Object obj) {
        for (Observador observadores : observadores) {
            observadores.atualizar(obj);
        }
    }

    public ArrayList<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(ArrayList<Observador> observadores) {
        this.observadores = observadores;
    }

    public String getDireita() {
        return direita;
    }

    public void setDireita() {
        this.direita = "direita";
        System.out.println("Ladrão andou para " + this.getDireita());
        this.notificar(this.getDireita());
    }

    public String getEsquerda() {
        return esquerda;
    }

    public void setEsquerda() {
        this.esquerda = "Esquerda";
        System.out.println("Ladrão andou para " + this.getEsquerda());
        this.notificar(this.getEsquerda());
    }

    public String getFrente() {
        return frente;
    }

    public void setFrente() {
        this.frente = "frente";
        System.out.println("Ladrão andou para " + this.getFrente());
        this.notificar(this.getFrente());
    }
    
    
    
}

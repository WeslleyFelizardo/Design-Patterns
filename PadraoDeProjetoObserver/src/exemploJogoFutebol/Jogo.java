/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploJogoFutebol;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Cleide
 */
public class Jogo implements Observado{
    
    private String time1;
    private String time2;
    private Integer golTime1;
    private Integer golTime2;
    private String gols;
    private ArrayList<Observador> listObservadores;

    public Jogo() {
        this.listObservadores = new ArrayList<Observador>();
        this.golTime1 = 0;
        this.golTime2 = 0;
        this.gols = "";
    }
    
    @Override
    public void registraObservador(Observador obj) {
        this.listObservadores.add(obj);
    }

    @Override
    public void removerObservador(Observador obj) {
        this.listObservadores.remove(obj);
    }

    @Override
    public void notificarObservadores(Object obj) {
        for (Observador observador : listObservadores) {
            observador.update(obj);
        }
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }
    
    public void golDoTime1(){
        this.golTime1++;
        this.gols = "Gol do " + this.getTime1();
        this.notificarObservadores(this.gols);
    }
    
    public void golDoTime2(){
        this.golTime2++;
        this.gols = "Gol do " + this.getTime2();
        this.notificarObservadores(this.gols);
    }

    public Integer getGolTime1() {
        return golTime1;
    }

    public Integer getGolTime2() {
        return golTime2;
    }
    
    public void terminarJogo(){
        String finalDeJogo = "";
        if (this.getGolTime1() > this.getGolTime2()) {
            finalDeJogo = (this.getTime1() + " " + this.getGolTime1() + " X " + this.getGolTime2() + " " +this.getTime2()).toString();
        } else if (this.getGolTime2() > this.getGolTime1()) {
            finalDeJogo = (this.getTime1() + " " + this.getGolTime1() + " X " + this.getGolTime2() + " " + this.getTime2()).toString();
        }else {
            finalDeJogo = (this.getTime1() + " " + this.getGolTime1() + " X " + this.getGolTime2() + " " + this.getTime2()).toString();
        }
        this.notificarObservadores(finalDeJogo);
    }
}

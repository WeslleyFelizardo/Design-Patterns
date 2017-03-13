/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploYoutube;

import java.util.ArrayList;

/**
 *
 * @author Cleide
 */
public class CanalYoutube implements Observado{

    private ArrayList<Observador> listObservadores;
    private String novoVideo;
    
    public CanalYoutube() {
        this.listObservadores = new ArrayList<Observador>();
    }

    public String getNovoVideo() {
        return novoVideo;
    }

    public void setNovoVideo(String novoVideo) {
        this.novoVideo = novoVideo;
        this.notificarObservadores();
    }
    
    @Override
    public void registraObservador(Observador obj) {
        this.listObservadores.add(obj);
    }

    @Override
    public void removerObservador(Observador obj) {
        this.listObservadores.remove(obj);;
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : listObservadores) {
            observador.update(novoVideo);
        }
    }
    
}

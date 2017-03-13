/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploPoliciaLadrao;

/**
 *
 * @author Cleide
 */
public interface Observado {
    public void registrarObservador(Observador observador);
    public void removerObservador(Observador observador);
    public void notificar(Object obj);
}

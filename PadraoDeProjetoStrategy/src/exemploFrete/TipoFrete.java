/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploFrete;

/**
 *
 * @author Cleide
 */
public enum TipoFrete {
    
    NORMAL {
        @Override
        public Frete getFrete() {
            return new Normal();
        }
    },
    SEDEX {
        @Override
        public Frete getFrete() {
            return new Sedex();
        }
    };
    
    public abstract Frete getFrete();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploAnimal;

/**
 *
 * @author Cleide
 */
public enum EnumAnimal {
    CACHORRO {
        @Override
        public Animal getAnimal() {
            return new Cachorro();
        }
    },GATO {
        @Override
        public Animal getAnimal() {
            return new Gato();
        }
    },LEAO {
        @Override
        public Animal getAnimal() {
            return new Leao();
        }
    }, Passarinho{
        @Override
        public Animal getAnimal() {
            return new Passarinho();
        }
        
    };
    
    public abstract Animal getAnimal();
}

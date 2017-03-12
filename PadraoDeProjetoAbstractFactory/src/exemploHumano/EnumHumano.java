/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploHumano;

/**
 *
 * @author Cleide
 */
public enum EnumHumano {
    MORENO {
        @Override
        public HumanoFactory getHumanoFactory() {
            return new HumanoMorenoFactory();
        }

        @Override
        public IHumano getHumano() {
            return new HumanoMoreno();
        }
    },BRANCO {
        @Override
        public HumanoFactory getHumanoFactory() {
            return new HumanoBrancoFactory();
        }

        @Override
        public IHumano getHumano() {
            return new HumanoBranco();
        }
    };
    
    public abstract HumanoFactory getHumanoFactory();
    
    public abstract IHumano getHumano();
    
}

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
public enum EnumTipoCarro {
    
    LUXO {
        @Override
        public CarroFactory getFactory() {
            return new CarroLuxoFactory();
        }

        @Override
        public IMontarCarro getCarro() {
            return new MontarCarroLuxo();
        }
    }, SIMPLES {
        @Override
        public CarroFactory getFactory() {
            return new CarroSimplesFactory();
        }

        @Override
        public IMontarCarro getCarro() {
            return new MontarCarroSimples();
        }
    };
    
    public abstract CarroFactory getFactory();
    
    public abstract IMontarCarro getCarro();
}

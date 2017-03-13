/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploImposto;

/**
 *
 * @author Cleide
 */
public enum EnumImpostos {
    ICMS {
        @Override
        public Imposto getImposto() {
            return new ICMS();
        }
    },INSS {
        @Override
        public Imposto getImposto() {
            return new INSS();
        }
    },PIS {
        @Override
        public Imposto getImposto() {
            return new PIS();
        }
    },CONFINS {
        @Override
        public Imposto getImposto() {
            return new CONFINS();
        }
    };
    
    public abstract Imposto getImposto();
}

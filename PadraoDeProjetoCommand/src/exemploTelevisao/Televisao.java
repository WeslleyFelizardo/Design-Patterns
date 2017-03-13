/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploTelevisao;

/**
 *
 * @author Cleide
 */
public class Televisao {
    
    private Integer Canal;
    private Integer Volume;
    private Integer OnOff;

    public Televisao() {
        this.Canal = 18;
        this.Volume = 20;
        this.OnOff = 0;
    }

    public Integer getCanal() {
        return Canal;
    }

    public void setCanal(Integer Canal) {
        this.Canal = Canal;
    }

    public Integer getVolume() {
        return Volume;
    }

    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    public Integer getOnOff() {
        return OnOff;
    }

    public void setOnOff(Integer OnOff) {
        this.OnOff = OnOff;
    }
      
    
    public void LigarTV(){
        this.setOnOff(1);
    }
    
    public void DesligarTV(){
        this.setOnOff(0);
    }
    
    public void AdiantarCanal(){
        this.setCanal(this.getCanal()+ 1);
    }
    
    public void RetrocederCanal(){
        this.setCanal(this.getCanal()- 1);
    }
    
    public void AumentarVolume(){
        this.setVolume(this.getVolume() + 1);
    }
    
    public void DiminuirVolume(){
        this.setVolume(this.getVolume() - 1);
    }
}

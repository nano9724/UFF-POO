
package br.UFF.Televisao;

public class Televisao {
    private boolean estado; //definimos false para tv desligada
    private int canais;
    private int potencia_volume;
    private boolean mute; //definimos false para mudo desligado 
    private int canal; 
    private int volume;
    
    Televisao(){
        this.estado=false;
        this.canais=100;
        this.potencia_volume=100;
        this.mute=false;
        this.canal=0;
        this.volume=0;}
            
    void volumelUp(){
        if (this.getVolume()==100){
            System.out.println("Volume Máximo "+this.getVolume());
        }else {
        this.volume++;
        System.out.println("Volume "+volume);
        }
       }
    void volumeDwn(){
        if (volume==0){
          System.out.println("Volume Mínimo" +volume);
        }else {
        volume--;
        System.out.println("Volume "+volume);
        }
       }
        
    void setVolume(int v){
        if (v>=0&&v<=canais){
            this.volume=v;
            System.out.println("Volume Definido: "+volume);
        }else {
        System.out.println("Entrada não Permitida");
        }
       }
        
    void canalUp(){
        if (canal==100){
            canal=0;
            canal++;
            System.out.println("Canal "+canal);
        }else {
        canal++;
        System.out.println("Canal "+canal);
        }
       }
    void canalDwn(){
        if (canal==0){
            canal=100;
            canal--;
            System.out.println("Canal "+canal);
        }else {
        canal--;
        System.out.println("Canal "+canal);
        }
       }
        
    void setCanal(int c){
        if (c>=0&&c<=canais){
            this.canal=c;
            System.out.println("Assistindo Canal "+canal);
        }else {
        System.out.println("Canal não existe");
        }
       }

    public void powerOnTV () {
       if(estado= false){
           estado=true;
           System.out.println("TV ligada");
       }}
    
public void powerOffTV () {
       if(estado=true){
           estado=false;
           System.out.println("TV desligada");
        }}
    
    public void mute(){
    if(mute= true){
           mute=false;
           System.out.println("TV Silenciada");
       }
    }
    
    public void Unmute(){
    if(mute= false){
           mute=true;
           System.out.println("Áudio TV Ativado");
       }
    }          
    
    public void infoTV(){
        if (estado==false){
        System.out.println("TV Ligada");
        System.out.println("Canal: "+canal);
        System.out.println("Volume: "+volume);
        }else{System.out.println("TV desligada");}
    }
    
    public void setMute(boolean mute) {
        this.mute = mute;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getCanais() {
        return canais;
    }

    public int getPotencia_volume() {
        return potencia_volume;
    }

    public boolean isMute() {
        return mute;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public void setPotencia_volume(int potencia_volume) {
        this.potencia_volume = potencia_volume;
    }
    
    
    public static void main(String[] args){
    
        
        Televisao tv1=new Televisao();
        
        tv1.infoTV();
        tv1.volumelUp();
        tv1.setVolume(30);
        tv1.setCanal(20);
        tv1.mute();
        tv1.infoTV();
    
    
    }
    
    
    
    
    
    
    
}


package br.UFF.Televisao;

public class Televisao {
    private boolean estado=false; //definimos false para tv desligada
    int canais=100;
    int potencia_volume =100;
    private boolean mute=false; //definimos false para mudo desligado 
    int canal=0; 
    int volume=0;
        
    void volumelUp(){
        if (volume==100){
            System.out.println("Volume Máximo "+volume);
        }else {
        volume++;
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
       }else{
         System.out.println("TV ligada");     }}
    
public void powerOffTV () {
       if(estado= true){
           estado=false;
           System.out.println("TV desligada");
       }else{
         System.out.println("TV desligada");     }}
    
    public void mute(){
    if(mute= true){
           mute=false;
           System.out.println("TV Silenciada");
       }else{
         System.out.println("TV Silenciada");     }
    }
    
    public void Unmute(){
    if(mute= false){
           mute=true;
           System.out.println("Áudio TV Ativado");
       }else{
         System.out.println("Áudio TV Ativado");     }
    }
          
    
    public void infoTV(){
        if (estado== false){
        System.out.println("TV Ligada");
        }else{System.out.println("TV desligada");}
        System.out.println("Canal: "+canal);
        System.out.println("Volume: "+volume);
    
    }
    
    public void setMute(boolean mute) {
        this.mute = mute;
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

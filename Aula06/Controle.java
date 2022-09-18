package Aula06;

public class Controle implements Interface {
//Atributos    
    private int volume;
    private Boolean ligado;
    private Boolean tocando;

//Construtor
    public Controle(){
        volume = 50;
        ligado = true;
        tocando = false;
    }

//Getters
    private int getVolume(){
        return this.volume;
    }
    private Boolean getLigado(){
        return this.ligado;
    }
    private Boolean getTocando(){
        return this.tocando;
    }
//Setters
    private void setVolume(int num){
        this.volume = num;
    }
    private void setLigado(Boolean val){
        this.ligado = val;
    }
    private void setTocando(Boolean val){
        this.tocando = val;
    }
//Metodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        
    }

    @Override
    public void desligar() {
       this.setLigado(false);
        
    }

    @Override
    public void abrirMenu() {
        if(getLigado()){
            System.out.println(this.getLigado());
            System.out.println(this.getTocando());
            System.out.print(this.getVolume());
            for(int i=0; i < this.getVolume()/10; i++){
                System.out.print(" X");
            }
            System.out.println();
        }
        else
        System.out.println("Controle Desligado. ");
        
        
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado())
            System.out.println("Fechar Menu. ");
        else
            System.out.println("Controle Desligado. ");
        
    }

    @Override
    public void maisVolume() {
       if(this.getLigado() && this.getVolume() <= 90)
            this.setVolume(this.getVolume()+10);
        else 
            System.out.println("Controle Desligado. ");
        
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() && this.getVolume() > 0)
            this.setVolume(this.getVolume()-10);
        else 
            System.out.println("Controle Desligado. ");
        
    }

    @Override
    public void ligarMudo() { 
        if(this.getLigado() && this.getVolume() !=0)
            this.setVolume(0);
        else 
            System.out.println("Controle Desligado. ");
            
    }

    @Override
    public void desligarMudo() {
     if(this.getLigado() && this.getVolume() == 0)
        this.setVolume(50);
    else 
        System.out.println("Controle Desligado. ");
     
        
    }

    @Override
    public void play() {
     if(this.getLigado() && !(this.getTocando()))
        this.setTocando(true);
    else 
        System.out.println("Controle Desligado. ");
        
    }

    @Override
    public void pause() {
    if(this.getLigado() && this.getTocando())
        this.setTocando(false);
        else 
            System.out.println("Controle Desligado. ");
        
    }

}

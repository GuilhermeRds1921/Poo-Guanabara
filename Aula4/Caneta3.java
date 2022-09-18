package Aula4;

public class Caneta3 {
    //Atributos

    private String cor;
    private int carga;
    private Boolean tampada;

    //Metodos

    public String getCor(){
        return this.cor;
    }
    public void setCor(String color){
        this.cor = color;
    }

    public int getCarga(){
        return this.carga;
    }
    public void setCarga(int num){
        this.carga = num;
    }

    public Boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(Boolean tamp){
        this.tampada = tamp;
    }

    //Construtor

    public Caneta3(){
        this.cor = "Vermelho";
        this.carga = 60;
        this.tampada = false;
    }
    //Status

    public void status(){
        System.out.println("Cor: "+this.cor);
        System.out.println("Carga: "+this.carga);
        System.out.println("Tampada: "+this.tampada);
    }   
}
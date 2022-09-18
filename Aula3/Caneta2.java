package Aula3;

public class Caneta2 {
    //Atribuitos
    public String cor;
    public String marca;
    private int carga;
    private float ponta;
    private Boolean tampada;

    //Metodos
    public void rabiscar(){
        if(this.tampada == true)
            System.out.println("Destampe a caneta. ");
        /*else if(carga == 0)
            System.out.println("Caneta sem tinta");*/
        else{
            System.out.println("Rabiscado na cor: " + cor);
            carga -= 10;
        }
            
    }
    public void tampar(){
        this.tampada = true;

    }
    public void destampar(){
        this.tampada= false;   
    }
    //Estado
    public void status(){
        System.out.println("Cor: "+this.cor);
        System.out.println("Marca: "+this.marca);
        System.out.println("Carga: "+this.carga);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Tampada: "+this.tampada);
    }   

}

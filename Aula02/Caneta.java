package Aula02;
public class Caneta {
    //Atribuitos
    String cor;
    String marca;
    int carga;
    float ponta;
    Boolean tampada;

    //Metodos
    void rabiscar(){
        if(this.tampada == true)
            System.out.println("Destampe a caneta. ");
        else if(carga == 0)
            System.out.println("Caneta sem tinta");
        else{
            System.out.println("Rabiscado na cor: " + cor);
            carga -= 10;
        }
            
    }
    Boolean tampar(){
        tampada = true;
        return tampada;
    }
    Boolean destampar(){
        tampada= false;   
        return tampada;
    }
    //Estado
    void status(){
        System.out.println("Cor: "+this.cor);
        System.out.println("Marca: "+this.marca);
        System.out.println("Carga: "+this.carga);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Tampada: "+this.tampada);
    }   

}

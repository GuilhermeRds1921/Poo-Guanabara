package Aula08;

import java.util.Random;

public class Luta {
//Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private Boolean aprovada;

//Construtor
    public Luta(Lutador ado, Lutador ante){
        this.setDesafiado(ado);
        this.setDesafiante(ante);
    }

//Setters
    private void setDesafiado(Lutador lutad){
        this.desafiado = lutad;
    }
    private void setDesafiante(Lutador lutad){
        this.desafiante = lutad;
    }
    private void setAprovado(Boolean val){
        this.aprovada = val;
    }

//Metodos Abstratos

    public void marcarLuta(){
        if(((desafiado.getCategoria() == desafiante.getCategoria()) && (desafiado != desafiante))){
            this.setAprovado(true);
            this.setDesafiado(desafiado);
            this.setDesafiante(desafiante);
        }
        else{
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);

        }
    }
    public void lutar(){
       if(this.aprovada){
            desafiado.apresentar();
            desafiante.apresentar();
            Random rn = new Random();
            int vencedor = rn.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("Empatou ");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiante.getNome() + " Venceu luta. ");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                case 2:
                System.out.println(desafiado.getNome() + " Venceu a luta. ");
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;
            }

        }
        else{
            System.out.println();
            System.out.println("Luta Invalida. ");
        }
           
    }
        
}

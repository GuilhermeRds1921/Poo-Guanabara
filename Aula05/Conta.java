package Aula05;

public class Conta {
//Atributos 
    public int numconta;
    private String dono;
    private float saldo;
    private Boolean status;
//Construtor
    public Conta(int num, String nome, float num2){
        this.setNumConta(num);
        this.setDono(nome);
        this.setSaldo(num2);
        this.status = true;
    }
//Metodos
    public int getNumConta(){
        return this.numconta;
    }
    private void setNumConta(int num){
        this.numconta = num;
    }

    public String getDono(){
        return this.dono;
    }
    private void setDono(String nome){
        this.dono = nome;
    }

    public float getSaldo(){
        return this.saldo;
    }
    private void setSaldo(float num2){
        this.saldo = num2;
    }
    
//Operações
    public void sacar(float num){
        System.out.println();
        if(this.saldo >= num)
            this.saldo -= num;
        else
            System.out.println("Saldo insuficiente ");
    }
    public void depositar(float num){
        this.saldo += num;
    }
    public void transferir(Conta p, float num){
        System.out.println();
        if(this.saldo >= num){
            p.depositar(num);
            this.saldo -= num;
        }
        else
            System.out.println("Saldo insuficiente");        
    }
    
    
    //Status
    public void showStatus(){
        System.out.println();
        System.out.println("Numero da Conta: " + this.numconta);
        System.out.println("Dono da Conta: " + this.dono);
        System.out.println("Saldo da Conta: " + this.saldo);
        System.out.println("Status da Conta: " + this.status);
    }
}

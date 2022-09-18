package Aula08;

    public class Lutador implements Interface{
    //Atributos
        private String nome;
        private String nacionalidade;
        private int idade;
        private float altura;
        private int peso;
        private String categoria;
        private int vitorias;
        private int derrotas;
        private int empates;




//Construtor
    public Lutador(String nome, String nacao, int idade, float altura, int peso,int vit, int der, int em){
        this.setNome(nome);
        this.setNacionalidade(nacao);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitoria(vit);
        this.setDerrota(der);
        this.setEmpate(em);

    }
//Getters
    public String getNome(){
        return this.nome;
    }
    private String getNacionalidade(){
        return this.nacionalidade;
    }
    private int getIdade(){
        return this.idade;
    }
    private float getAltura(){
        return this.altura;
    }
    private float getPeso(){
        return this.peso;
    }
    public String getCategoria(){
        return this.categoria;
    }
    private int getVitoria(){
        return this.vitorias;
    }
    private int getDerrota(){
        return this.derrotas;
    }
    private int getEmpate(){
        return this.empates;
    }

//Setters
    private void setNome(String str){
        this.nome = str;
    }
    private void setNacionalidade(String str){
        this.nacionalidade = str;
    }
    private void setIdade(int num){
        this.idade = num;
    }
    private void setAltura(float num){
        this.altura = num;
    }
    private void setPeso(int num){
        this.peso = num;
        this.setCategoria(num);
    }
    private void setCategoria(int num){
        if(num >= 50 && num < 80)
            this.categoria = "Pena";
        else if(num >= 80 && num < 100)
            this.categoria = "Medio";
        else if(num >= 100)
            this.categoria = "Pesado";
        else
            this.categoria = "Frango";
    }
    private void setVitoria(int num){
        this.vitorias = num;
    }
    private void setDerrota(int num){
        this.derrotas = num;
    }
    private void setEmpate(int num){
        this.empates = num;
    }

//Metodo abstrato
    @Override
    public void apresentar() {
        System.out.println();
        System.out.println(this.getNome());
        System.out.println(this.getNacionalidade());
        System.out.println(this.getIdade());
        System.out.println(this.getAltura());
        System.out.println(this.getPeso());
        System.out.println(this.getCategoria());
        System.out.println(this.getVitoria());
        System.out.println(this.getDerrota());
        System.out.println(this.getEmpate());
        System.out.println();
    }

    @Override
    public void status() {
        System.out.println();
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " +this.getCategoria());
        System.out.println("Vitorias: " +this.getVitoria());
        System.out.println("Derrotas: " +this.getDerrota());
        System.out.println("Empates: " +this.getEmpate());
        System.out.println();
    }


    @Override
    public void ganharLuta() {
       this.setVitoria(getVitoria()+1);
        
    }

    @Override
    public void perderLuta() {
        this.setDerrota((getDerrota()+1));
        
    }

    @Override
    public void empatarLuta() {
        this.setEmpate(getEmpate()+1);
    }
}

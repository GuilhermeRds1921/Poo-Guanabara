package Aula02;
public class UsaCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.carga = 100;
        c1.cor = "Azul";
        c1.marca = "Bic";
        c1.ponta = 0.2f;
        c1.tampada = true;

        c1.status();
        System.out.println('.');
        c1.rabiscar();

        System.out.println('.');
        c1.destampar();
        c1.status();

        System.out.println('.');
        c1.rabiscar();
        c1.status();
    }
}

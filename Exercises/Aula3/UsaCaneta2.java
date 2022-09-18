package Aula3;
public class UsaCaneta2 {
    public static void main(String[] args) {
        Caneta2 c1 = new Caneta2();
        //c1.carga = 100;
        c1.cor = "Azul";
        //c1.tampada = true;

        c1.status();
        System.out.println('.');
        c1.destampar();
        c1.rabiscar();

        c1.status();
    }
}

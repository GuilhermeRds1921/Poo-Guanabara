package Aula04;

public class UsaCaneta {
    public static void main(String[] args) {
        Caneta3 c1 = new Caneta3();
        System.out.println();
        c1.status();

        c1.setCarga(100);
        c1.setCor("Azul");
        c1.setTampada(true);

        System.out.println();
        System.out.println(c1.getCarga());
        System.out.println(c1.getCor());
        System.out.println(c1.getTampada());


    }
}

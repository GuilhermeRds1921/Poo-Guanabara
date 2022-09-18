package Aula5;

public class UsaConta {
    public static void main(String[] args) {
        Conta p1 = new Conta(1, "Gui", 500);
        Conta p2 = new Conta(2, "Jao", 400);


        p1.showStatus();
        p2.showStatus();

        p1.transferir(p2, 300);
        
        p1.showStatus();
        p2.showStatus();

    }
}

package Aula08;

public class UsaLutador {
    public static void main(String[] args) {
        Lutador lutadores[] = new  Lutador[3];
         lutadores[0] = new Lutador("Bob", "br", 20, 1.75f, 60, 1, 1, 1);
         lutadores[1] = new Lutador("Fela", "eua", 30, 1.85f, 65, 2, 2, 2);
         lutadores[2] = new Lutador("Think", "ru", 40, 1.95f, 100, 3, 3, 3);
        
         Luta ufc = new Luta(lutadores[0], lutadores[1]);
         ufc.marcarLuta(lutadores[0], lutadores[1]);
         ufc.lutar();

        lutadores[0].status();
        lutadores[1].status();
    }
}

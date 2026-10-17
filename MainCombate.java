public class MainCombate {
    public static void main(String[] args) {
        Personagem[] personagens = {
            new Guerreiro(),
            new Mago(),
            new Arqueiro()
        };

        System.out.println("=== Turno de Combate ===");

        for (Personagem personagem : personagens) {
            personagem.atacar();
        }
    }
}
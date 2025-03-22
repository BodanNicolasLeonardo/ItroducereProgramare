public class Main {
    public static void main(String[] args) {
        Carte carte1 = new Carte(150);
        Carte carte2 = new Carte(150);
        Carte carte3 = new Carte(200);

        System.out.println("Cartea 1 si Cartea 2 sunt identice: " + carte1.esteIdentica(carte2));
        System.out.println("Cartea 1 si Cartea 3 sunt identice: " + carte1.esteIdentica(carte3));
    }
}

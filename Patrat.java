public class Patrat {
    int latura;

    public Patrat() {
        this.latura = 10;
    }

    public Patrat(int latura) {
        this.latura = latura;
    }

    public void afiseaza() {
        int aria = latura * latura;
        System.out.println("Patrat " + latura + " Aria " + aria);
    }
}

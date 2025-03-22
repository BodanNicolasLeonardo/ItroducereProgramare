public class Piramida {
    int n;

    public Piramida(int n) {
        this.n = n;
    }

    public void afiseaza() {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= (n - i); j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

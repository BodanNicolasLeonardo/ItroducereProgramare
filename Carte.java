public class Carte{
    int numarPagini;

    public Carte(int numarPagini) {
        this.numarPagini = numarPagini;
    }

    public boolean esteIdentica(Carte altaCarte) {
        return this.numarPagini == altaCarte.numarPagini;
    }
}

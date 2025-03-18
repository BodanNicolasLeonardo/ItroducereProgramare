
public class Main {
	public static void main(String[] args) {
        Sertar sertar1 = new Sertar(40, 50, 20);
        Sertar sertar2 = new Sertar(35, 45, 15);

        Birou birou = new Birou(120, 60, 75, sertar1, sertar2);

        birou.tipareste();
    }
}

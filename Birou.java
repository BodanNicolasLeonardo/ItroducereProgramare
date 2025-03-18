
public class Birou {

	    private double latime;
	    private double lungime;
	    private double inaltime;
	    private Sertar sertar1;
	    private Sertar sertar2;
	   
	    public Birou(double latime, double lungime, double inaltime, Sertar sertar1, Sertar sertar2) {
	        this.latime = latime;
	        this.lungime = lungime;
	        this.inaltime = inaltime;
	        this.sertar1 = sertar1;
	        this.sertar2 = sertar2;
	    }
 
	    public void tipareste() {
	        System.out.println("Birou " + latime + " " + lungime + " " + inaltime);
	        sertar1.tipareste();
	        sertar2.tipareste();
	    }
	
	
	

}

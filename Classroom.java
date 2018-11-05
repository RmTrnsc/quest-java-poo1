public class Classroom {

    public static void main(String[] args) {
    	
    	Wilder romain = new Wilder ("Romain");
    	romain.setAware(true);
    	System.out.println(romain.firstNameAndAware());
    	
    	Wilder maxime = new Wilder ("Maxime");
    	romain.setAware(false);
    	System.out.println(maxime.firstNameAndAware());
    }
    
}
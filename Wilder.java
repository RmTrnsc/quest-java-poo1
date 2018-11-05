public class Wilder {
	
	private String firstName;
	private boolean aware;
	
	public Wilder(String firstName) {
		this.firstName = firstName;
		this.aware = false;
	}
	
	public String getFirstName() {
        return this.firstName;
    }
	
	public boolean isAware() {
        return this.aware;
    }
	
	public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setAware(boolean aware) {
        this.aware = aware;
    }
    
    public String firstNameAndAware() {
    	if (aware != true) {
    		return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware" ;
    	}
    	else {
    		return "Je m'appelle " + this.getFirstName() + " et je suis aware";
    	}
    }
}

/**
 * @author Romeo
 * @version Feb 3 2017
 */
public class Eagle extends Pets {

	/**
	 * @param name of animal
	 * @param breed of animal
	 */
	public Eagle(String name, String breed) {
		super(name, breed);
		
	}
	
	public String Move() {
		return this.name+" Flies";
	}

}

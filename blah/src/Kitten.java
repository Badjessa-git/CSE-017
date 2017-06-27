
/**
 * @author Romeo
 * @version Feb 5, 2017
 */
public class Kitten extends Pets {

	/**
	 * @param name of animal
	 * @param breed of animal
	 */
	public Kitten(String name, String breed) {
		super(name, breed);
	}
	
	public String Move() {
		return this.name+" Runs";
	}

}

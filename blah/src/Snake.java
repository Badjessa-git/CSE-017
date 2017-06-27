
/**
 * @author Romeo Bahoumda
 * @version 2017.02.12
 *
 */
public class Snake extends Pets {

	/**
	 * Constructor
	 * @param name of
	 * @param breed of
	 */
	public Snake(String name, String breed) {
		super(name, breed);
	}
	public String Move(){
		return this.getName()+ " Slithers";
	}
}

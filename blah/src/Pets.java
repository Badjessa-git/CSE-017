/**
 * @author Romeo
 * @version 2017.02.12
 */
public abstract class Pets implements Motion{
    protected String name;
    protected String breed;
    protected int age;
    /**
     * @param name name of the pet
     * @param breed breed of the pet
     */
    public Pets(String name, String breed){
        this.age = 0;
        this.name = name;
        this.breed = breed;
    }
    /**
     * @param name
     */
    public void setName(String name){
    	this.name = name;
    }
    /**
     * @return name of pet
     */
    public String getName(){
    	return this.name;
    }
    /**
     * @param breed of pet
     */
    public void setBreed(String breed){
    	this.breed = breed;
    }
    /**
     * @return breed of pet
     */
    public String getBreed(){
    	return this.breed;
    }
    /**
     * @return the name of the pet and how they move
     */
    public String Move() {
    	return null;
    }
}

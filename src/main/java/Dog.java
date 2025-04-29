/**
 * The Dog class represents a dog with a name, breed, and weight.
 * It provides constructors, getters, and setters for each instance variable.
 */
public class Dog{
    private String name;
    private String breed;
    private double weight;


/**
 * Constructs a Dog object with the given name, breed, and weight.
 * 
 * @param name  the name of the dog
 * @param breed  the breed of the dog
 * @param weight the weight of the dog in kilograms
 */

 public Dog(String name, String breed, double weight){
     this.name = name;
     this.breed = breed;
     this.weight = weight;
  }
 
  
/**
 * Gets the dog's name
 * 
 * @return the dog's name
*/
public String getName(){
    return name;
}
  
/**
 * Sets the dog's name)
 * 
 * @param name the new name for the dog
 */
public void setName(String name){
    this.name = name;
}

/**
 * Sets the dog's breed.
 * 
 * @param breed the new breed for the dog
 */
public void setBreed(String breed){
    this.breed = breed;
}

/**
 * Gets the dog's weight
 * 
 * @return the dog's weight in kilograms
 */
public double getWeight(){
    return weight;
}

/**
 * Sets the dog's weight
 * 
 * @param weight the new weight for the dog in kilogrmas
 * 
 */
public void setWeight(double weight){
    this.weight = weight;
}
}





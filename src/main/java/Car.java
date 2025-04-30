/**
 * The Car class represents a car with a make , model, year, and price.
 * It provides constructors, getters, and setters for each instance variable.
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;
        
            /**
             * Constructs a Car object with the given make, model, year, and price
             *
             * @param make  the make of the car
             * @param model the model of the car
             * @param year  the year the car was made
             * @param price the price of the car in dollars
             */

             public Car(String make, String model, int year, double price){
                this.make = make;
                this.model = model;
                this.year = year;
                this.price = price;
             }

             /**
              * Gets the car's make
              *
              * @return the car's make
              */
              public String getMake(){
                return make;
              }

              /**
               * Sets the car's make
               * 
               * @param make the new make of the car
               */
              public void setMake(String make){
                this.make = make;
              }

              /**
               * Gets the car's model
               * 
               * @return the car's model
               */
              public String getModel(){
                return model;
              }

              /**
               * Sets the car's model
               * 
               * @param make the new model of the car
               */
              public void setModel(String model){
                this.model = model;
              }

              /**
               * Gets the year the car was made
               * 
               * @return the car's year
               */
              public int getYear(){
                return year;
              }

              /**
               * Sets the year the car was made
               * 
               * @param year the new year of the car
               */
              public void setYear(int year){
                this.year = year;
              }

              /**
               * Gets the price of the car
               * 
               * @return the car's price in dollars
               */
              public double getPrice(){
                return price;
              }

              /**
               * Set the price oc the car
               * 
               * @param make the new price of the car
               */
              public void setPrice(double price){
                this.price = price;
              }
}

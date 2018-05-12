/**
 * A simple Car implementation
 */
public class Car  {
    double TANK_CAPACITY = 50.0;       // capacity of gas tank in litres
    double LITRES_PER_100KM = 10.0;    // gas consumption in litres per 100km

    private double fuel;
    private String condition;
    private int totalDistanceTravelled;

    // EFFECTS: a new car with a full tank, not moving, in a working condition
    public Car() {
        fuel = TANK_CAPACITY;
        condition = "working";
        totalDistanceTravelled = 0;
    }

    // EFFECTS: returns how much fuel is left in a tank of the car
    public double getFuel() {
        return fuel;
    }

    // EFFECTS: sets the fuel to be curFuel
    public void setFuel(int curFuel) {
        this.fuel = curFuel;
    }

    // EFFECTS: returns the condition of the car
    public String getCondition() {
        return condition;
    }

    // EFFECTS: sets the condition to cond
    public void setCondition(String cond) {
        this.condition = cond;
    }

    // EFFECTS: returns total distance travelled in km
    public int getTotalDistanceTravelled() {
        return totalDistanceTravelled;
    }

    // MODIFIES: this
    // EFFECTS: returns true is the car's condition is broken
    public boolean isBroken() {
        return false;
        //TODO: implement the method

    }

    // MODIFIES: this
    // EFFECTS: fixes the car and sets the condition to "working"
    public void repair() {
        //TODO: implement the method
    }

    // EFFECTS: returns maximum distance (in kms) that car can be driven (rounded to nearest km)
    // until gas tank is empty
    public int getDistanceUntilEmpty() {
        return (int) (fuel / LITRES_PER_100KM * 100);
    }

    // REQUIRES: amount > 0
    // MODIFIES: this
    // EFFECTS: adds amount litres of gas to tank; if there is insufficient space in tank to hold
    // the given amount, any excess is assumed to overflow and not be added.
    public void addGasToTank(double amount) {

        //TODO: implement the method
    }

    // REQUIRES: condition is "working"
    // distance > 0 AND distance <= getDistanceUntilEmpty()
    // MODIFIES: this
    // EFFECTS: move the car at a specified speed for given time, increase the distance travelled, decreases the fuel
    // sets the condition to broken if there is the ditance travelled is too big
    // for this model assume that 1000 is enough to break a car
    public void drive(int speed, int time) {
        // assume the acceleration is uniform and car moves at a constant speed km/h
        int distance;

        //TODO: implement the method
    }

    //TODO: ADD TWO MORE METHODS CREATED BY YOU. ONE OF THEM MUST INCLUDE A FOR LOOP.
}

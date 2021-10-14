package creational.singleton;

/**
 * As an example, let's say we want to model the American President's official aircraft called "Airforce One"
 * in our software.
 * There can only be one instance of Airforce One and a singleton class is the best suited representation.
 */

public class AirforceOne {

    private static AirforceOne airforceOne;

    private AirforceOne(){

    }

    public static AirforceOne getInstance(){
        if (airforceOne == null){
            return new AirforceOne();
        }
        return airforceOne;
    }

    public void fly(){
        System.out.println("fly");
    }
}

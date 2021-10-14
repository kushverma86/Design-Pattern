package creational.singleton;

public class AirforceMultithreaded {

    private static volatile AirforceMultithreaded airforceOne = null;
    private AirforceMultithreaded(){
        System.out.println("Creating");
    }


    public static AirforceMultithreaded getInstance(){
        // double check
        if (airforceOne == null){ // check 1
            synchronized (AirforceMultithreaded.class){
                if (airforceOne == null) {  // check 2
                    return new AirforceMultithreaded();
                }
            }
        }
        return airforceOne;
    }

    public void fly(){
        System.out.println("fly");
    }


}

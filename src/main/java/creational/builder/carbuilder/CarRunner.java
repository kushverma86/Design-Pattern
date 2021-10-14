package creational.builder.carbuilder;

import creational.builder.carbuilder.carcomponent.*;
import jdk.internal.dynalink.linker.LinkerServices;

import java.util.ArrayList;

public class CarRunner {
    public static void main(String[] args) {
        CarWithBuilder.Builder builder = new CarWithBuilder.Builder();
        builder.buildWithEngine(new Engine()).withAirBags(new Airbags()).withSteering(new Steering()).withSeats(new ArrayList<Seat>()).withFuel(new Fuel());
        CarWithBuilder car = builder.build();
        System.out.println(car);
    }
}

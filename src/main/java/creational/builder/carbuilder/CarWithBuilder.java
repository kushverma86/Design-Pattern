package creational.builder.carbuilder;

import com.sun.istack.internal.NotNull;
import creational.builder.carbuilder.carcomponent.*;
import lombok.NonNull;

import java.util.List;

public class CarWithBuilder {

    private Engine engine;
    private List<Seat> seats;
    private Steering steering;

    @Override
    public String toString() {
        return "CarWithBuilder{" +
                "engine=" + engine +
                ", seats=" + seats +
                ", steering=" + steering +
                ", wheels=" + wheels +
                ", fuel=" + fuel +
                ", airconditioner=" + airconditioner +
                ", airBags=" + airBags +
                ", centralLock=" + centralLock +
                ", musicSystem=" + musicSystem +
                ", sunRoof=" + sunRoof +
                '}';
    }

    private Wheels wheels;
    private Fuel fuel;

    //optional
    private Airconditioner airconditioner;
    private Airbags airBags;
    private CentralLock centralLock;
    private MusicSystem musicSystem;
    private SunRoof sunRoof;

//    public static Builder builder(){
//        return new Builder();
//    }

    public static class Builder{

        private Engine engine;
        private List<Seat> seats;
        private Steering steering;
        private Wheels wheels;
        private Fuel fuel;

        //optional
        private Airconditioner airconditioner;
        private Airbags airBags;
        private CentralLock centralLock;
        private MusicSystem musicSystem;
        private SunRoof sunRoof;

        public Builder buildWithEngine(@NotNull final Engine engine){
            this.engine = engine;
            return this;
        }


        public Builder withFuel(@NonNull final Fuel fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder withSeats(@NonNull final List<Seat> seats) {
            this.seats = seats;
            return this;
        }

        public Builder withSteering(@NonNull final Steering steering) {
            this.steering = steering;
            return this;
        }

        public Builder withAirBags(@NonNull final Airbags airBags) {
            this.airBags = airBags;
            return this;
        }

        public Builder withCentralLock(@NonNull final CentralLock centralLock) {
            this.centralLock = centralLock;
            return this;
        }

        public Builder withMusicSystem(@NonNull final MusicSystem musicSystem) {
            this.musicSystem = musicSystem;
            return this;
        }

        public Builder withSunRoof(@NonNull final SunRoof sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public CarWithBuilder build(){
            if (this.engine == null || this.steering == null || this.seats == null || this.fuel == null) {
                throw new RuntimeException("All required properties are not present.");
            }

            CarWithBuilder carWithBuilder = new CarWithBuilder();
            carWithBuilder.engine = engine;
            carWithBuilder.steering = steering;
            carWithBuilder.seats = seats;
            carWithBuilder.fuel = fuel;
            carWithBuilder.airconditioner = airconditioner;
            carWithBuilder.musicSystem = musicSystem;
            carWithBuilder.sunRoof = sunRoof;

            return carWithBuilder;
        }
    }
}

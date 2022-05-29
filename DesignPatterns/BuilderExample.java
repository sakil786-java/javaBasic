package DesignPatterns;

/*
    * It is creational Design pattern
    * Used when too many arguments to send in constructor & it is hard to maintain order;
    * When we don't want to send all parameters in object initialisation
    *
    * Implementation
    *
 */

class Vehicle3
{
    //required parameter
    private String engine;
    private int wheel;

    //optional parameter
    private int airbags;

    public String getEngine() {
        return this.engine;
    }

    public int getWheel() {
        return this.wheel;
    }

    public int getAirbags() {
        return this.airbags;
    }

    private Vehicle3(VehicleBuilder builder) {
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.airbags = builder.airbags;
    }

    public static class VehicleBuilder {
        private String engine;
        private int wheel;

        private int airbags;

        public VehicleBuilder(String engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }

        public VehicleBuilder setAirbags(int airbags) {
            this.airbags = airbags;
            return this;
        }

        public Vehicle3 build() {
            return new Vehicle3(this);
        }
    }


}
public class BuilderExample {
}

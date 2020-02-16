package transport;

public class BlueCamel extends AbstractVehicle {
    public String name;
   
    public BlueCamel(String name, int fuel) {
        super(fuel);
        this.fuel *= 2;
        this.name = name;
    }

    public BlueCamel(String name) {
        this.name = name;
    }

    @Override
    public String getPath(){
        return "Sand";
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "BlueCamel{" + "name: " + name + ", fuel: " + fuel + "}";
    }
}
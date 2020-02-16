package transport;

public interface Vehicle {
    String getPath();
    void move();
    int getFuelLVL();
    void addFuel(int i);
}
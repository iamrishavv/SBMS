// Context class using interface reference
public class Car {

    private Engine eng;   // interface reference

    // constructor injection
    public Car(Engine eng) {
        this.eng = eng;
    }

    public void drive() {
        eng.start();
        System.out.println("Car is moving");
    }
}

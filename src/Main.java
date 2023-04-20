
public class Main {
    float km = 30;
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        Thread thread = new Thread(car);
        thread.start();
        thread.join();

    }
}
public class Nav extends Thread{
    private float credSpeed;
    private float ostatokKm;
    private float time;

    int num;
    float[] speedArray;

    public void RunNav(){
        Car car = new Car();
        speedArray = new float[60];
        for (int i = 0; i < 60; i++){
            num++;
            speedArray[i] = car.getSpeed();
        }
    }

    public float getCredSpeed() {
        return credSpeed;
    }

    public float getOstatokKm() {
        return ostatokKm;
    }

    public float getTime() {
        return time;
    }
}

import javax.swing.plaf.SplitPaneUI;

import static java.lang.Thread.sleep;

public class Car implements Runnable {
    private float speed;
    public boolean PlusOrMinus = true;

    public void run(){
        PlusSpeed();
        while (true){
            if(PlusOrMinus) {
                speed += 5;
                PlusOrMinus = false;
            }else {
                speed -= 5;
                PlusOrMinus = false;
            }



            try {
                sleep(1000);
            }catch (Exception e){}
        }
    }

    public void PlusSpeed(){
        for (int i = 0; i < 5; i++){
            speed += 5;
            try {
                sleep(500);
            }catch (Exception e){}
        }
    }

    public float getSpeed() {
        return speed;
    }
}

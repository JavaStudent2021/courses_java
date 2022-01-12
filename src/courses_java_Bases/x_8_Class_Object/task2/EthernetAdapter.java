package courses_java_Bases.x_8_Class_Object.task2;

public class EthernetAdapter extends Device {
    int speed;
    String mac;

    public EthernetAdapter(int speed, String mac) {
        super();
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

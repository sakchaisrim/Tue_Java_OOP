package tue10;

public class Bus implements Vehicle {
    @Override
    public int cashRate() {
        return 100;
    }

    @Override
    public int ePassRate() {
        return 90;
    }
}

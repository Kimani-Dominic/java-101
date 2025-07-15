

package JAM;

public class Pvt {
    private long time = 0;

    private Pvt(long time) {
        this.time = time;
    }

    public Pvt(long time, long timeOffset) {
        this(time);
        this.time += timeOffset;
    }

    public static Pvt newClock() {
        return new Pvt(System.currentTimeMillis());
    }
};


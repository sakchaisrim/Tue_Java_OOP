package tue01;

public class BoxV1 {
    public double w, h, d;  // access modifier
    // data + method

    public double volume() {
        return w * h * d;
    }

    public double surfaceArela() {
        return (2.0 * w * h) + (2.0 * w * d) + (2.0 * d * h);
    }
}



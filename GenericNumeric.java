public class GenericNumeric<T extends Number> {

    private T value;

    public GenericNumeric(T value) {
        this.value = value;
    }

    public double reciprocal() {
        return 1.0 / value.doubleValue();
    }

    public double fractionalPart() {
        return value.doubleValue() - value.longValue();
    }

    public boolean absoluteEquals(GenericNumeric<? extends Number> other) {
        return Math.abs(this.value.doubleValue()) == Math.abs(other.value.doubleValue());
    }

    public static void main(String[] args) {
        GenericNumeric<Double> d = new GenericNumeric<>(9.76);
        System.out.println("Reciprocal: " + d.reciprocal());
        System.out.println("Fractional part: " + d.fractionalPart());

        GenericNumeric<Double> d2 = new GenericNumeric<>(-3.5);
        GenericNumeric<Float> f = new GenericNumeric<>(3.5f);
        System.out.println("Absolute equals: " + d2.absoluteEquals(f));
    }
}

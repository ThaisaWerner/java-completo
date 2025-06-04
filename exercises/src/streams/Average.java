package streams;

public class Average {

    private double total;
    private int quantity;

    public Average add(double value) {
        total += value;
        quantity++;
        return this;
    }

    public double getValue() {
        return total / quantity;
    }

    public static Average combine(Average av1, Average av2) {
        Average result = new Average();
        result.total = av1.total + av2.total;
        result.quantity = av1.quantity + av2.quantity;
        return result;
    }
}

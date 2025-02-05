public class Sity extends Car {
    final int base_price = 40000;

    @Override
    public String toString() {
        return "Sity " + super.toString();
    }

    public Sity() {
        addBaseprice(base_price);
    }
}

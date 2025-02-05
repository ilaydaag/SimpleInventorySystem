public class Racer extends Motorbike {
    final int base_price = 60000;

    @Override
    public String toString() {
        return "Racer " + super.toString();
    }

    public Racer(){
        addBaseprice(base_price);
    }
}

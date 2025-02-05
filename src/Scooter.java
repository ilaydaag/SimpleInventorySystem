public class Scooter extends Motorbike {
    final int base_price = 20000;

    @Override
    public String toString() {
        return "Scooter " + super.toString();
    }

    public Scooter(){
        addBaseprice(base_price);
    }
}

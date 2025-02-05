public class Sivic extends Car {
    final int base_price = 50000;

    @Override
    public String toString() {
        return "Sivic " + super.toString();
    }

    public Sivic(){
        addBaseprice(base_price);
    }
}

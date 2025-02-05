import java.util.ArrayList;

public class Inventory {
    private ArrayList vehicle; //create a list for all kind of vehicles

    public Inventory(){
        vehicle = new ArrayList<>();
    }

    public void add(Object o) {
        vehicle.add(o);
    }

    @Override
    public String toString() {
        String message = "";
        int count_cars = 0;
        int count_motors = 0;
        int total_price = 0;

        for (Object vehicles : vehicle){
            if (vehicles instanceof Car){
                count_cars++;
                total_price += ((Car) vehicles).getTotalprice();
            }
            if (vehicles instanceof Motorbike){
                count_motors++;
                total_price += ((Motorbike) vehicles).getTotalprice();
            }

            message += vehicles + "\n";  //adding each object in the form of a string
        }


        if (count_cars == 0 && count_motors == 0){ //it will be written in case there is no cars and motorbikes
            return "There is no vehicle.";
        }else{
            return message + "\n" + "TOTAL: " + (vehicle.size()) + " Vehicles including " + count_cars + " Cars and "
                    + count_motors +  " Motorbikes " + " having a total price of " + total_price + " TL";
        }
    }
}

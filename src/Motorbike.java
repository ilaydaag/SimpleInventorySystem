public abstract class Motorbike {

    private boolean abs;
    private boolean seat_heating;
    private int total_price;

    public void addBaseprice(int bases_price){ //it could vary depending on motorbike models.
        total_price += bases_price;
    }

    public void setAbs(boolean abs) {
        if(abs){
            total_price += 5000;
        }
        this.abs = abs;
    }

    public void setSeatHeating(boolean seat_heating) {
        if(seat_heating){
            total_price += 2000;
        }
        this.seat_heating = seat_heating;
    }

    public int getTotalprice(){ //if any option select its cost will be added to base price
        return total_price;
    }

    @Override
    public String toString() {

        String message = "";
        if(abs || seat_heating){ //if any of them selected
            message += "with";
        }

        if(abs){
            message += " ABS";
        }

        if(seat_heating){
            message += ", Seat Heating";
        }

        if(!abs){//if abs not the first word
            message = message.replaceFirst(",", "");
        }

        message += " having a total price of " + total_price + " TL";

        return message;
    }
}

public abstract class Car {
    private boolean selfparking;
    private boolean abs;
    private boolean music_system;
    private boolean airbag;
    private boolean sunroof;
    private int total_price;

    public void addBaseprice(int base_price){  //it could vary depending on car models.
        total_price += base_price;
    }



    public void setSelfParking(boolean selfparking){
        if(selfparking){
            total_price += 2000;
        }
        this.selfparking =selfparking;
    }
    public void setAbs(boolean abs) {
        if(abs){
            total_price += 5000;
        }
        this.abs=abs;
    }

    public void setMusicSystem(boolean music_system) {
        if(music_system){
            total_price += 1000;
        }
        this.music_system = music_system;
    }

    public void setAirBag(boolean airbag) {
        if(airbag){
            total_price += 3000;
        }
        this.airbag = airbag;
    }

    public void setSunRoof(boolean sunroof) {
        if(sunroof){
            total_price += 2000;
        }
        this.sunroof = sunroof;
    }

    public int getTotalprice(){ //if any option select its cost will be added to base price
        return total_price;
    }

    @Override
    public String toString() {

        String message = "";
        if(abs || music_system || airbag || sunroof){ //if any of them selected
            message += "with";
        }

        if(abs){
            message += " ABS";
        }

        if(music_system){
            message += ", Music System";
        }

        if(airbag){
            message += ", Air Bag";
        }

        if(sunroof){
            message += ", Sunroof";
        }

        if(selfparking){
            message += ", SelfParking";
        }


        if(!abs){  //if abs not the first word
            message = message.replaceFirst(",", "");
        }

        message += " optional having a total price of " + total_price + " TL";

        return message;
    }
}

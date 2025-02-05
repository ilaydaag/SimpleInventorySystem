public class TestInventory {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Car car = new Sivic(); //50000
        car.setAbs(true); // 5000
        car.setMusicSystem(true); //1000
        car.setAirBag(true); //3000
        car.setSelfParking(true); //2000
        inventory.add(car);

        car = new Sivic(); //50000
        car.setAbs(true); //5000
        car.setSunRoof(true); //2000
        inventory.add(car);

        car = new Sity(); //40000
        car.setMusicSystem(true); //1000
        car.setSunRoof(true); //2000
        inventory.add(car);

        Motorbike mBike = new Racer(); //60000
        mBike.setAbs(true); //5000
        mBike.setSeatHeating(true);//2000
        inventory.add(mBike);

        mBike = new Scooter();//20000
        mBike.setSeatHeating(true);//2000
        inventory.add(mBike);

        //print the inventory
        System.out.println(inventory);

    }
}



//Разработайте систему парковки для автостоянки. На парковке есть три вида парковочных мест: 
//большие, средние и маленькие, с фиксированным количеством мест для каждого размера.

public class ParkingSystem {
    private int smallPark;
    private int mediumPark;
    private int bigPark;

    public ParkingSystem(int small, int medium, int big) {
        this.smallPark = small;
        this.mediumPark = medium;
        this.bigPark = big;
    }

    public boolean addCar(int carType) {
        if (carType == 1)
            return freePlace(bigPark--);
        if (carType == 2)
            return freePlace(mediumPark--);
        if (carType == 3)
            return freePlace(smallPark--);
        return false;
    }

    private boolean freePlace(int placeNum) {
        return placeNum > 0;
    }

    public void getInfo() {
        System.out.println(String.format("Big park %d, Med park %d, Small park %d",
                bigPark, mediumPark, smallPark));
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(2, 3, 2);
        parkingSystem.getInfo();
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(3));

        parkingSystem.getInfo();
    }
}
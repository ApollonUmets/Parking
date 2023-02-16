public class ParkingPlace {

    int number;

    String isOccupied;

    ParkingPlace(int number, String  isOccupied) {
        this.number = number;
        this.isOccupied = isOccupied;
    }

    @Override
    public String toString() {
        return "ParkingPlace{" +
                "number=" + number +
                ", isOccupied='" + isOccupied + '\'' +
                '}';
    }
}

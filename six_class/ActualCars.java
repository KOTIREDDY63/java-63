package six_class;

public class ActualCars {
    public static void main(String[] args) {
        CarFactory CretaCar = new CarFactory();
        CretaCar.CarBrand="Hundai";
        CretaCar.CarPrice=20.5;
        CretaCar.CarReviews=1000;
        CretaCar.CarRating=4.5; 
        CretaCar.displayCar_ShortInfo();
        CretaCar.displayCar_LongInfo();

        CarFactory SwiftCar = new CarFactory();
        SwiftCar.CarBrand="Maruti";
        SwiftCar.CarPrice=15.5;
        SwiftCar.CarReviews=500;        
        SwiftCar.CarRating=4.0;
        SwiftCar.displayCar_ShortInfo();
        SwiftCar.displayCar_LongInfo();
        
    }

}

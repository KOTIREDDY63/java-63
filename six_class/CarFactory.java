package six_class;

public class CarFactory {
     

    //Data
    String CarBrand;
    double CarPrice;
    int CarReviews;
    double CarRating;
    

    //behaviour method task
    public void displayCar_ShortInfo(){
        System.out.println("CarBrand:"+CarBrand);
        System.out.println("CarPrice:"+CarPrice);
    }


    public void displayCar_LongInfo(){
      
    displayCar_ShortInfo();
    System.out.println("CarReviews:"+CarReviews);
    System.out.println("CarRating:"+CarRating);
    CarFactory HundaiCreta = new CarFactory();
    displayCar_ShortInfo();
    // Removed recursive call to displayCar_LongInfo() to prevent infinite loop
    }
 
}

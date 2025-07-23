package incompatable_conversion;

public class incompatable {

    public static void main(String[] args) {
         int zip = 500030;
         //String code =(String) zip; // cannot convert int to String directly
         String code =(String.valueOf(zip));
         System.out.println("Orginal value :"+ zip);
            System.out.println("Converted value :"+ code);
    }
}

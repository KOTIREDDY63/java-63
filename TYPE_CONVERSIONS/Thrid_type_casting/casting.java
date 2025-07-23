package Thrid_type_casting;

public class casting {
     public static void main(String[] args) {
        double num_3 =3.14;
        //int num_4 = num_3; //type casting from double to int but compailer will give error we need to use explicit casting
        int num_4 = (int)num_3; // explicit type casting from double to int 
         System.out.println("Original value: " + num_3);
            System.out.println("Converted value: " + num_4);
     }

}

package operators;

public class logical_operators {
    public static void main(String[] args) {
        int x=10;
        int y=5;
        System.out.println("x is greater than y :"+(x>y));
        System.out.println("x is less than y :"+(x<y));
        System.out.println("x is equal to y :"+(x==y)); 
        System.out.println("x is not equal to y :"+(x!=y));
        System.out.println("x is greater than or equal to y :"+(x>=y));
        System.out.println("x is less than or equal to y :"+(x<=y));
        //logicala operators
        System.out.println("Logical AND (x > y && y < 10): " + (x > y && y < 10)); //return true if both are correct
        System.out.println("Logical OR (x < y || y < 10): " + (x < y || y < 10)); //return true if at least one is correct
        System.out.println("Logical NOT !(x > y): " + !(x > y)); //return true if the condition is false(inverts  )   


        

    }

}

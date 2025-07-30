package operators;

public class bitwise_operators { //used to perform bitwise operations on integer values
    // &(AND),|(OR),^(XOR),~(NOT),<<(left shift),>>(right shift),>>>(unsigned right shift)
    public static void main(String[] args) {
        int valuea = 5; // 0101 in binary
         int valueb = 3;; // 0011 in binary
         int resultand = valuea & valueb; // 0001 in binary (1 in decimal)
         System.out.println(resultand);
         

    }

}
